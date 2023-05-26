import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

plugins {
    id("maven-publish")
    kotlin("plugin.serialization") version "1.8.10"
    id("org.jetbrains.kotlin.multiplatform") version "1.9.0-Beta"
    id("co.touchlab.faktory.kmmbridge") version "0.3.7"
}

