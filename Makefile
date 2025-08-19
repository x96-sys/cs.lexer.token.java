BUILD_DIR     = build
MAIN_BUILD    = $(BUILD_DIR)/main
CLI_BUILD     = $(BUILD_DIR)/cli
TEST_BUILD    = $(BUILD_DIR)/test

SRC_MAIN      = src/main
SRC_CLI       = src/cli
SRC_TEST      = src/test

FOUNDATION      = /org/x96/sys/foundation/cs/lexer/token
FOUNDATION_MAIN = $(SRC_MAIN)/$(FOUNDATION)
FOUNDATION_CLI  = $(SRC_CLI)/$(FOUNDATION)
FOUNDATION_TEST = $(SRC_TEST)/$(FOUNDATION)

TOOL_DIR      = tools
LIB_DIR       = lib

CS_KIND_VERSION = 0.1.3
CS_KIND         = org.x96.sys.foundation.cs.lexer.token.kind.jar
CS_KIND_JAR     = $(LIB_DIR)/$(CS_KIND)
CS_KIND_URL     = https://github.com/x96-sys/cs.lexer.token.kind.java/releases/download/$(CS_KIND_VERSION)/$(CS_KIND)

JUNIT_VERSION = 1.13.4
JUNIT_JAR     = $(TOOL_DIR)/junit-platform-console-standalone.jar
JUNIT_URL     = https://maven.org/maven2/org/junit/platform/junit-platform-console-standalone/$(JUNIT_VERSION)/junit-platform-console-standalone-$(JUNIT_VERSION).jar

JACOCO_VERSION = 0.8.13
JACOCO_CLI     = $(TOOL_DIR)/jacococli.jar
JACOCO_AGENT   = $(TOOL_DIR)/jacocoagent-runtime.jar
JACOCO_BASE    = https://maven.org/maven2/org/jacoco

GJF_VERSION   = 1.28.0
GJF_JAR       = $(TOOL_DIR)/google-java-format.jar
GJF_URL       = https://maven.org/maven2/com/google/googlejavaformat/google-java-format/$(GJF_VERSION)/google-java-format-$(GJF_VERSION)-all-deps.jar

JAVA_SOURCES       = $(shell find $(SRC_MAIN) -name "*.java")
JAVA_TEST_SOURCES  = $(shell find $(SRC_TEST) -name "*.java")

DISTRO_JAR = org.x96.sys.foundation.cs.lexer.token.jar
CLI_JAR    = org.x96.sys.foundation.cs.lexer.token.cli.jar

lib:
	@mkdir -p lib

lib/cs/lexer/kind: lib
	@if [ ! -f $(CS_KIND_JAR) ]; then \
		echo "[📦] [🚛] [$(CS_KIND_JAR)]@[$(CS_KIND_VERSION)]"; \
			curl -s -L -o $(CS_KIND_JAR) $(CS_KIND_URL); \
    else \
			echo "[📦] [📍] [$(CS_KIND_JAR)]@[$(CS_KIND_VERSION)]"; \
    fi

# lib/cs/lexer/kind
build:
	@echo "[🔨] [build] Compiling..."
	@javac -cp $(CS_KIND_JAR) -d $(MAIN_BUILD) $(JAVA_SOURCES)
	@echo "[✅] [build] Compiled successfully! in [$(MAIN_BUILD)]"

# build tools-junit
build-test:
	@mkdir -p $(TEST_BUILD)
	@echo "[🔨] [test] Compiling tests..."
	@javac -cp $(MAIN_BUILD):$(CS_KIND_JAR):$(JUNIT_JAR) -d $(TEST_BUILD) $(JAVA_TEST_SOURCES)
	@echo "[✅] [test] Test compilation successful!"

# build-test
test:
	@echo "[🧪] [test] Running tests..."
	@java -jar $(JUNIT_JAR) --class-path $(MAIN_BUILD):$(TEST_BUILD):$(CS_KIND_JAR) --scan-class-path

tools-junit:
	@mkdir -p $(TOOL_DIR)
	@if [ ! -f "$(JUNIT_JAR)" ]; then \
		echo "[📦] [🚛] [junit]@[$(JUNIT_VERSION)]"; \
		curl -s -sSL -o $(JUNIT_JAR) $(JUNIT_URL); \
	else \
		echo "[📦] [📍] [junit]@[$(JUNIT_VERSION)]"; \
	fi

distro: build
	@echo "[📦] [distro] Creating distribution JAR..."
	@jar cf $(DISTRO_JAR) -C $(MAIN_BUILD) .
	@echo "[✅] [distro] Created $(DISTRO_JAR)"

# build-test tools/jacoco
coverage-run:
	java -javaagent:$(JACOCO_AGENT)=destfile=$(BUILD_DIR)/jacoco.exec \
       -jar $(JUNIT_JAR) \
       execute \
       --class-path $(TEST_BUILD):$(MAIN_BUILD):$(CS_KIND_JAR) \
       --scan-class-path

coverage-report:
	java -jar $(JACOCO_CLI) report \
     $(BUILD_DIR)/jacoco.exec \
     --classfiles $(MAIN_BUILD) \
     --sourcefiles $(SRC_MAIN) \
     --html $(BUILD_DIR)/coverage \
     --name "Coverage Report"

coverage: coverage-run coverage-report
	@echo "[✅] [relatório] de cobertura disponível em: build/coverage/index.html"
	@echo "[🌐] [abrir] com: open build/coverage/index.html"

tools/jacoco:
	@mkdir -p $(TOOL_DIR)
	@if [ ! -f $(JACOCO_CLI) ] || [ ! -f $(JACOCO_AGENT) ]; then \
       echo "[📦] [🚛] [JaCoCo]@[$(JACOCO_VERSION)]"; \
       curl -s -L -o $(JACOCO_CLI) $(JACOCO_BASE)/org.jacoco.cli/$(JACOCO_VERSION)/org.jacoco.cli-$(JACOCO_VERSION)-nodeps.jar && \
       curl -s -L -o $(JACOCO_AGENT) $(JACOCO_BASE)/org.jacoco.agent/$(JACOCO_VERSION)/org.jacoco.agent-$(JACOCO_VERSION)-runtime.jar; \
    else \
       echo "[📦] [📍] [JaCoCo]@[$(JACOCO_VERSION)]"; \
    fi

tools/gjf:
	@if [ ! -f $(GJF_JAR) ]; then \
      echo "[📦] [🚛] [Google Java Format]@[$(GJF_VERSION)]"; \
      curl -s -L -o $(GJF_JAR) $(GJF_URL); \
    else \
      echo "[📦] [📍] [Google Java Format]@[$(GJF_VERSION)]"; \
    fi

# tools/gjf
format:
	@find src -name "*.java" -print0 | xargs -0 java -jar $(GJF_JAR) --aosp --replace
	@echo "[✅] [format] Code formatted successfully!"

clean:
	@rm -rf $(FOUNDATION)/BuildInfo.java
	@rm -rf $(BUILD_DIR)
	@rm -rf $(TOOL_DIR)
	@rm -rf $(LIB_DIR)
	@rm -rf *.jar
	@echo "[🧹] [clean] Build directory cleaned."

.PHONY: all clean lib/cs/lexer/kind build tools-junit build-test test tools/jacoco coverage distro
all: clean lib/cs/lexer/kind build tools-junit build-test test tools/jacoco coverage distro
