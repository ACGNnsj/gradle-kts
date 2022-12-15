import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    val kotlinVersion: String by System.getProperties()
    id("org.springframework.boot") version "2.7.5"
    kotlin("jvm") version kotlinVersion
    application
    kotlin("plugin.spring") version kotlinVersion
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("plugin.serialization") version kotlinVersion
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
//    maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public/") }
    gradlePluginPortal()
    mavenLocal()
    mavenCentral()
}

dependencies {
    val kotlinVersion: String by System.getProperties()
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.alipay.oceanbase:oceanbase-client:1.1.10")
    implementation("com.baomidou:mybatis-plus-generator:3.5.3")
    implementation("org.noear:esearchx:1.0.17")
    implementation("com.google.code.gson:gson:2.10")
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation(kotlin("script-runtime"))
    testImplementation("org.jetbrains.kotlin:kotlin-script-util:$kotlinVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-scripting-dependencies:$kotlinVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("com.demo.MainKt")
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}