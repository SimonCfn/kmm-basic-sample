import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework




repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

plugins {
    java
    kotlin("multiplatform")
    id("com.chromaticnoise.multiplatform-swiftpackage") version "2.0.3"
}

kotlin {
    multiplatformSwiftPackage {
    swiftToolsVersion("5.3")
        targetPlatforms {
          iOS { v("13") }
        }
    }
}
