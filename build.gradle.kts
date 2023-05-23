import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

plugins {
    java
    kotlin("multiplatform")
    id("com.github.pagr0m.kotlin.native.spm")
}

kotlin {
    iosArm64 {
        binaries {
            framework {
                baseName = "KlibIOS"
            }
        }
    }

    spm {
        ios("14") { }
    }
}
