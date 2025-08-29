BUILD_DIR     = out
MAIN_BUILD    = $(BUILD_DIR)/main
CLI_BUILD     = $(BUILD_DIR)/cli
TEST_BUILD    = $(BUILD_DIR)/test

SRC_MAIN      = src/main
SRC_CLI       = src/cli
SRC_TEST      = src/test

TOOLS_DIR     = tools
LIB_DIR       = lib

KIND_VERSION = 1.0.0
KIND_JAR     = $(LIB_DIR)/org.x96.sys.lexer.token.kind.jar
KIND_URL     = https://github.com/x96-sys/lexer.token.kind.java/releases/download/v$(KIND_VERSION)/org.x96.sys.lexer.token.kind.jar
KIND_SHA256  = 55d12618cd548099d138cbc1e7beda2b78e6a09382ec725523e82f7eb5a31c69

JUNIT_VERSION = 1.13.4
JUNIT_JAR     = $(TOOLS_DIR)/junit-platform-console-standalone.jar
JUNIT_URL     = https://maven.org/maven2/org/junit/platform/junit-platform-console-standalone/$(JUNIT_VERSION)/junit-platform-console-standalone-$(JUNIT_VERSION).jar
JUNIT_SHA256  = 3fdfc37e29744a9a67dd5365e81467e26fbde0b7aa204e6f8bbe79eeaa7ae892

JACOCO_VERSION = 0.8.13
JACOCO_BASE    = https://maven.org/maven2/org/jacoco

JACOCO_CLI_VERSION = $(JACOCO_VERSION)
JACOCO_CLI_JAR     = $(TOOLS_DIR)/jacococli.jar
JACOCO_CLI_URL     = $(JACOCO_BASE)/org.jacoco.cli/$(JACOCO_CLI_VERSION)/org.jacoco.cli-$(JACOCO_CLI_VERSION)-nodeps.jar
JACOCO_CLI_SHA256  = 8f748683833d4dc4d72cea5d6b43f49344687b831e0582c97bcb9b984e3de0a3

JACOCO_AGENT_VERSION = $(JACOCO_VERSION)
JACOCO_AGENT_JAR     = $(TOOLS_DIR)/jacocoagent-runtime.jar
JACOCO_AGENT_URL     = $(JACOCO_BASE)/org.jacoco.agent/$(JACOCO_AGENT_VERSION)/org.jacoco.agent-$(JACOCO_AGENT_VERSION)-runtime.jar
JACOCO_AGENT_SHA256  = 47e700ccb0fdb9e27c5241353f8161938f4e53c3561dd35e063c5fe88dc3349b

GJF_VERSION = 1.28.0
GJF_JAR     = $(TOOLS_DIR)/gjf.jar
GJF_URL     = https://maven.org/maven2/com/google/googlejavaformat/google-java-format/$(GJF_VERSION)/google-java-format-$(GJF_VERSION)-all-deps.jar
GJF_SHA256  = 32342e7c1b4600f80df3471da46aee8012d3e1445d5ea1be1fb71289b07cc735

JAVA_SOURCES       = $(shell find $(SRC_MAIN) -name "*.java")
JAVA_TEST_SOURCES  = $(shell find $(SRC_TEST) -name "*.java")

DISTRO_JAR = org.x96.sys.lexer.token.jar
CLI_JAR    = org.x96.sys.lexer.token.cli.jar

build: libs clean/build/main
	@echo "[🔨] [build] Compiling..."
	@javac -cp $(KIND_JAR) -d $(MAIN_BUILD) $(JAVA_SOURCES)
	@echo "[📀] [build] compiled in [$(MAIN_BUILD)]"

build/test: kit clean/build/test build
	@mkdir -p $(TEST_BUILD)
	@echo "[🔨] [test] Compiling tests..."
	@javac -cp $(MAIN_BUILD):$(KIND_JAR):$(JUNIT_JAR) -d $(TEST_BUILD) $(JAVA_TEST_SOURCES)
	@echo "[🦾] [test] compiled in [$(TEST_BUILD)]"

test:
	@echo "[🧪] [test] Running tests..."
	@java -jar $(JUNIT_JAR) --class-path $(MAIN_BUILD):$(TEST_BUILD):$(KIND_JAR) --scan-class-path

coverage-run: build/test
	java -javaagent:$(JACOCO_AGENT_JAR)=destfile=$(BUILD_DIR)/jacoco.exec \
       -jar $(JUNIT_JAR) \
       execute \
       --class-path $(TEST_BUILD):$(MAIN_BUILD):$(KIND_JAR) \
       --scan-class-path

coverage-report:
	java -jar $(JACOCO_CLI_JAR) report \
     $(BUILD_DIR)/jacoco.exec \
     --classfiles $(MAIN_BUILD) \
     --sourcefiles $(SRC_MAIN) \
     --html $(BUILD_DIR)/coverage \
     --name "Coverage Report"

coverage: coverage-run coverage-report
	@echo "[📊] [relatório] de cobertura disponível em: build/coverage/index.html"
	@echo "[🌐] [abrir] com: open out/coverage/index.html"

format:
	@find src -name "*.java" -print0 | xargs -0 java -jar $(GJF_JAR) --aosp --replace
	@echo "[🧾] [format] Code formatted successfully!"

define deps
$1/$2: $1
	@expected="$($3_SHA256)"; \
	jar="$($3_JAR)"; \
	url="$($3_URL)"; \
	tmp="$$$$(mktemp)"; \
	if [ ! -f "$$$$jar" ]; then \
		echo "[📦] [🚛] [$($3_VERSION)] [$2]"; \
		curl -sSL -o "$$$$tmp" "$$$$url"; \
		actual="$$$$(shasum -a 256 $$$$tmp | awk '{print $$$$1}')"; \
		if [ "$$$$expected" = "$$$$actual" ]; then mv "$$$$tmp" "$$$$jar"; \
		echo "[📦] [📍] [$($3_VERSION)] [$2] [🐚]"; else rm "$$$$tmp"; \
		echo "[❌] [hash mismatch] [$2]"; exit 1; fi; \
	else \
		actual="$$$$(shasum -a 256 $$$$jar | awk '{print $$$$1}')"; \
		if [ "$$$$expected" = "$$$$actual" ]; \
		then echo "[📦] [📍] [$($3_VERSION)] [🐚] [$2]"; \
		else \
			echo "[❌] [hash mismatch] [$2]"; \
			curl -sSL -o "$$$$tmp" "$$$$url"; \
			actual="$$$$(shasum -a 256 $$$$tmp | awk '{print $$$$1}')"; \
			if [ "$$$$expected" = "$$$$actual" ]; then mv "$$$$tmp" "$$$$jar"; \
			echo "[📦] [♻️] [$($3_VERSION)] [🐚] [$2]"; else rm "$$$$tmp"; \
			echo "[❌] [download failed] [$2]"; exit 1; fi; \
		fi; \
	fi
endef

$(BUILD_DIR) $(MAIN_BUILD) $(LIB_DIR) $(TOOLS_DIR):
	@mkdir -p $@

kit: \
	$(TOOLS_DIR)/junit \
	$(TOOLS_DIR)/gjf \
	$(TOOLS_DIR)/jacoco_cli \
	$(TOOLS_DIR)/jacoco_agent

$(eval $(call deps,$(TOOLS_DIR),junit,JUNIT))
$(eval $(call deps,$(TOOLS_DIR),gjf,GJF))
$(eval $(call deps,$(TOOLS_DIR),jacoco_cli,JACOCO_CLI))
$(eval $(call deps,$(TOOLS_DIR),jacoco_agent,JACOCO_AGENT))

libs: $(LIB_DIR)/kind

$(eval $(call deps,$(LIB_DIR),kind,KIND))

distro: build
	@echo "[📦] [distro] Creating distribution JAR..."
	@jar cf $(DISTRO_JAR) -C $(MAIN_BUILD) .
	@echo "[🦿] [distro] Created $(DISTRO_JAR)"

clean/kit:
	@rm -rf $(TOOLS_DIR)
	@echo "[🛀] [clean] [$(TOOLS_DIR)]"

clean/libs:
	@rm -rf $(LIB_DIR)
	@echo "[🥽] [clean] [$(LIB_DIR)]"

clean/build/main:
	@rm -rf $(MAIN_BUILD)
	@echo "[🧼] [clean] [$(MAIN_BUILD)]"

clean/build/test:
	@rm -rf $(TEST_BUILD)
	@echo "[🧹] [clean] [$(TEST_BUILD)]"

clean/build:
	@rm -rf $(BUILD_DIR)
	@echo "[🧽] [clean] [$(BUILD_DIR)]"

clean: \
	clean/build \
	clean/kit \
	clean/libs
	@rm -rf *.jar
	@echo "[🔬] [clean]"
