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
    id("com.chromaticnoise.multiplatform-swiftpackage") version "2.0.3"
}

kotlin {
    multiplatformSwiftPackage {
        swiftToolsVersion("5.4")
        packageName("MyCardKmm")
        zipFileName("MyCardKmm")
        outputDirectory(File(rootDir, "/"))
        distributionMode { local() }
        targetPlatforms {
            iOS { v("14") }
        }
    }
}

