import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "br.edu.maurigvs"
version = "1.0-SNAPSHOT"

// Add jcenter as a repository for dependencies
repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.amshove.kluent:kluent:1.68")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}