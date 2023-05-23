import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("maven-publish")
    kotlin("plugin.serialization") version "1.8.10"
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.multiplatform.spm)
    alias(libs.plugins.detekt)
}

multiplatformSwiftPackage {
    packageName("MyCardKmm")
    swiftToolsVersion("5.6")
    targetPlatforms {
        iOS { v("14") }
    }
    outputDirectory(File(projectDir, "/"))
    zipFileName("MyCardKmm_iOS")
}

kotlin {
    android {
    }

    multiplatformSwiftPackage {
        packageName("MyCardKmm")
        swiftToolsVersion("5.6")
        targetPlatforms {
            iOS { v("14") }
        }
        outputDirectory(File(projectDir, "/"))
        zipFileName("MyCardKmm_iOS")
    }

    val xcf = XCFramework()
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "MyCardKmm"
            xcf.add(this)
        }
    }
    
    val iosX64Main by getting
    val iosArm64Main by getting
    val iosSimulatorArm64Main by getting
    val iosMain by creating {
        dependsOn(commonMain)
        iosX64Main.dependsOn(this)
        iosArm64Main.dependsOn(this)
        iosSimulatorArm64Main.dependsOn(this)
        dependencies {
            implementation(libs.ktor.ios)
        }
    }
}

