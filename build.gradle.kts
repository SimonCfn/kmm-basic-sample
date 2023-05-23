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
    id("org.jetbrains.kotlin.multiplatform") version "1.9.0-Beta"
    id("com.chromaticnoise.multiplatform-swiftpackage") version "2.0.3"
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
        iosX64()
    ).forEach {
        it.binaries.framework {
            baseName = "MyCardKmm"
            xcf.add(this)
        }
    }
}

