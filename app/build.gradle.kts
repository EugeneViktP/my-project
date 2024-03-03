import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    application
    id("java")
    id("checkstyle")
}

group = "project.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass = "project.code.App"
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("org.assertj:assertj-core:3.19.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.test {
    useJUnitPlatform()
    // https://technology.lastminute.com/junit5-kotlin-and-gradle-dsl/
    testLogging {
        exceptionFormat = TestExceptionFormat.FULL
        events = mutableSetOf(TestLogEvent.FAILED, TestLogEvent.PASSED, TestLogEvent.SKIPPED)
        // showStackTraces = true
        // showCauses = true
        showStandardStreams = true
    }
}