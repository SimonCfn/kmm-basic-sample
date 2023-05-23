import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

plugins {
    id("com.chromaticnoise.multiplatform-swiftpackage") version "2.0.3"
}

kotlin {
    multiplatformSwiftPackage {
        packageName("MyCardKmm")
        swiftToolsVersion("5.6")
        targetPlatforms {
            iOS { v("14") }
        }
        outputDirectory(File(projectDir, "/"))
        zipFileName("MyCardKmm_iOS")
    }
}
