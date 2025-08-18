BUILD_DIR     = build
MAIN_BUILD    = $(BUILD_DIR)/main
TEST_BUILD    = $(BUILD_DIR)/test
COVERAGE_DIR  = $(BUILD_DIR)/coverage

SRC_MAIN      = src/main
SRC_TEST      = src/test

TOOLS_DIR     = tools
LIB_DIR       = lib

FLUX_VERSION       = 1.0.1
FLUX_JAR           = $(LIB_DIR)/org.x96.sys.foundation.io.jar
FLUX_URL           = https://github.com/x96-sys/flux.java/releases/download/v$(FLUX_VERSION)/org.x96.sys.foundation.io.jar

JUNIT_VERSION = 1.13.4
JUNIT_JAR     = $(TOOLS_DIR)/junit-platform-console-standalone.jar
JUNIT_URL     = https://maven.org/maven2/org/junit/platform/junit-platform-console-standalone/$(JUNIT_VERSION)/junit-platform-console-standalone-$(JUNIT_VERSION).jar

JACOCO_VERSION   = 0.8.13
JACOCO_AGENT_JAR = $(TOOLS_DIR)/jacoco-agent.jar
JACOCO_AGENT_URL = https://repo1.maven.org/maven2/org/jacoco/org.jacoco.agent/$(JACOCO_VERSION)/org.jacoco.agent-$(JACOCO_VERSION)-runtime.jar
JACOCO_CLI_JAR   = $(TOOLS_DIR)/jacoco-cli.jar
JACOCO_CLI_URL   = https://repo1.maven.org/maven2/org/jacoco/org.jacoco.cli/$(JACOCO_VERSION)/org.jacoco.cli-$(JACOCO_VERSION)-nodeps.jar
JACOCO_EXEC      = $(TOOLS_DIR)/jacoco.exec

GJF_VERSION   = 1.28.0
GJF_JAR       = $(TOOLS_DIR)/google-java-format.jar
GJF_URL       = https://maven.org/maven2/com/google/googlejavaformat/google-java-format/$(GJF_VERSION)/google-java-format-$(GJF_VERSION)-all-deps.jar

JAVA_SOURCES := $(shell find $(SRC_MAIN) -name "*.java")


DISTRO_JAR = org.x96.sys.foundation.token.jar

all: clean build build-test coverage distro
.PHONY: all clean build build-test coverage distro

build: download-flux
	@mkdir -p $(MAIN_BUILD)
	@javac -d $(MAIN_BUILD) -cp $(FLUX_JAR) $(JAVA_SOURCES)
	@echo "[🔨][build] Main build completed."


build-test: build download-junit
	@mkdir -p $(TEST_BUILD)
	@javac -cp $(MAIN_BUILD):$(FLUX_JAR):$(JUNIT_JAR) -d $(TEST_BUILD) $(shell find src/test -name "*.java")
	@echo "[🔨][build] Test build completed."

test: build-test
	@java -jar $(JUNIT_JAR) --class-path $(MAIN_BUILD):$(TEST_BUILD):$(FLUX_JAR) --scan-class-path

coverage: download-jacoco test-with-agent report

test-with-agent: build-test
	@java -javaagent:$(JACOCO_AGENT_JAR)=destfile=$(JACOCO_EXEC) \
	     -jar $(JUNIT_JAR) \
	     --class-path $(MAIN_BUILD):$(TEST_BUILD):$(FLUX_JAR) \
	     --scan-class-path

report:
	@mkdir -p $(COVERAGE_DIR)
	@java -jar $(JACOCO_CLI_JAR) report \
	     $(JACOCO_EXEC) \
	     --classfiles $(MAIN_BUILD) \
	     --sourcefiles $(SRC_MAIN) \
	     --html $(COVERAGE_DIR) \
	     --name "Coverage Report"
	@echo "HTML report available at $(COVERAGE_DIR)/index.html"

download-flux:
	@mkdir -p $(LIB_DIR)
	@if [ ! -f "$(FLUX_JAR)" ]; then \
		echo "[📦][flux][🚛][$(FLUX_VERSION)] Downloading Flux"; \
		curl -sSL -o $(FLUX_JAR) $(FLUX_URL); \
	else \
		echo "[📦][flux][✅][$(FLUX_VERSION)] Flux is up to date."; \
	fi

download-junit:
	@mkdir -p $(TOOLS_DIR)
	@if [ ! -f "$(JUNIT_JAR)" ]; then \
		echo "[📦][junit][🚛][$(JUNIT_VERSION)] Downloading JUnit"; \
		curl -sSL -o $(JUNIT_JAR) $(JUNIT_URL); \
	else \
		echo "[📦][junit][✅][$(JUNIT_VERSION)] JUnit is up to date."; \
	fi

download-jacoco:
	@mkdir -p $(TOOLS_DIR)
	@if [ ! -f "$(JACOCO_CLI_JAR)" ]; then \
		echo "[📦][jacoco][🚛] Downloading JaCoCo CLI $(JACOCO_VERSION)"; \
		curl -sSL -o $(JACOCO_CLI_JAR) $(JACOCO_CLI_URL); \
	else \
		echo "[📦][jacoco][✅] JaCoCo CLI is up to date."; \
	fi
	@if [ ! -f "$(JACOCO_AGENT_JAR)" ]; then \
		echo "[📦][jacoco][🚛] Downloading JaCoCo Agent $(JACOCO_VERSION)"; \
		curl -sSL -o $(JACOCO_AGENT_JAR) $(JACOCO_AGENT_URL); \
	else \
		echo "[📦][jacoco][✅] JaCoCo Agent is up to date."; \
	fi

distro:
	@jar cf $(DISTRO_JAR) -C $(BUILD_DIR) .
	@echo "[📦][distro] Distribution JAR created at $(DISTRO_JAR)"

format: download-gjf
	@find src -name "*.java" -print0 | xargs -0 java -jar $(GJF_JAR) --aosp --replace
	@echo "[✨][format] Code formatted successfully!"

download-gjf:
	@mkdir -p $(TOOLS_DIR)
	@if [ ! -f "$(GJF_JAR)" ]; then \
		echo "[📦][gjf][🚛] Downloading Google Java Format $(GJF_VERSION)"; \
		curl -sSL -o $(GJF_JAR) $(GJF_URL); \
	else \
		echo "[📦][gjf][✅] Google Java Format is up to date."; \
	fi

clean:
	@rm -rf $(BUILD_DIR) $(LIB_DIR) $(TOOLS_DIR) $(DISTRO_JAR)
	@echo "[🧹][clean] Build directory cleaned."
