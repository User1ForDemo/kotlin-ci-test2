plugins {
    application
    kotlin("jvm") version "1.6.10"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib"))
    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
    runtimeOnly("org.apache.logging.log4j:log4j-api:2.17.1")
    runtimeOnly("org.apache.logging.log4j:log4j-core:2.17.1")
    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:2.17.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<Test> {
    this.testLogging {
        this.showStandardStreams = true
    }
}

application {
    mainClass.set("MainKt")
}
