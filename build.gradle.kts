plugins {
    id("groovy") 
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("io.micronaut.application") version "3.3.2"
}

version = "0.1"
group = "com.example"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut:micronaut-jackson-databind")
    implementation("io.micronaut.data:micronaut-data-mongodb")
    implementation("io.micronaut.groovy:micronaut-runtime-groovy")
    implementation("io.micronaut.mongodb:micronaut-mongo-reactive")
    compileOnly("io.micronaut:micronaut-http-validation")
    compileOnly("io.micronaut.data:micronaut-data-document-processor")
    runtimeOnly("ch.qos.logback:logback-classic")
    testImplementation("org.testcontainers:mongodb")
    testImplementation("org.testcontainers:spock")
    testImplementation("org.testcontainers:testcontainers")
    implementation("io.micronaut:micronaut-validation")
}


application {
    mainClass.set("com.example.Application")
}
java {
    sourceCompatibility = JavaVersion.toVersion("1.8")
    targetCompatibility = JavaVersion.toVersion("1.8")
}

graalvmNative.toolchainDetection.set(false)
micronaut {
    runtime("netty")
    testRuntime("spock2")
    processing {
        incremental(true)
        annotations("com.example.*")
    }
}


