pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KmmSample"

include(":androidApp")
include(":shared")

gradlePlugin {
    plugins {
        id("com.chromaticnoise.multiplatform-swiftpackage") version "2.0.3"
    }
}

multiplatformSwiftPackage {
    swiftToolsVersion("5.3")
    targetPlatforms {
      iOS { v("13") }
    }
}

packageName("SwiftPackage")
