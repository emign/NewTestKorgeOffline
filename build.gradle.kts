import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.0"
}

group = "me.emig"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    flatDir {
        dirs("libs")
    }
}

dependencies {
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
    testImplementation(kotlin("test-junit"))
    implementation(files("libs/korge-2.0.9.jar"))
    implementation(files("libs/korge-jvm-2.0.9.jar"))
    implementation(files("libs/klock-jvm-2.1.0.jar"))
    implementation(files("libs/korgw-2.0.9.jar"))
    implementation(files("libs/korgw-jvm-2.0.9.jar"))
    implementation(files("libs/korim-2.0.9.jar"))
    implementation(files("libs/korim-jvm-2.0.9.jar"))
    implementation(files("libs/korinject-2.0.7.jar"))
    implementation(files("libs/korinject-jvm-2.0.7.jar"))
    implementation(files("libs/korma-2.0.9.jar"))
    implementation(files("libs/korma-jvm-2.0.9.jar"))
    implementation(files("libs/korio-2.0.10.jar"))
    implementation(files("libs/korio-jvm-2.0.10.jar"))
    implementation(files("libs/kds-2.0.9.jar"))
    implementation(files("libs/kds-jvm-2.0.9.jar"))
    implementation(files("libs/klogger-2.0.8.jar"))
    implementation(files("libs/klogger-jvm-2.0.8.jar"))
    implementation(files("libs/kmem-2.0.10.jar"))
    implementation(files("libs/kmem-jvm-2.0.10.jar"))
    implementation(files("libs/korau-2.0.11.jar"))
    implementation(files("libs/korau-jvm-2.0.11.jar"))
    implementation(files("libs/krypto-2.0.7.jar"))
    implementation(files("libs/krypto-jvm-2.0.7.jar"))
    implementation(files("libs/jna-5.8.0.jar"))


}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.register<JavaExec>("runJvm") {
    group = "Ausführen"
    description = "Run the main class with JavaExecTask"
    classpath = sourceSets["main"].runtimeClasspath
    main = "me.emig.main.Main"
}

