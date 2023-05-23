repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

plugins {
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

