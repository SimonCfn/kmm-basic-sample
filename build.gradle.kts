repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}
plugins {
    // For the Github action & iOS, add : version("1.8.10")
    id("org.jetbrains.kotlin.multiplatform") version ("1.8.10")
    id("com.android.library") version ("8.0.0")
    id("org.jetbrains.kotlin.plugin.serialization") version ("1.8.10")
    // For Android => no version

    /*id("org.jetbrains.kotlin.multiplatform")
    id("com.android.library")
    id("org.jetbrains.kotlin.plugin.serialization")*/

    id("co.touchlab.faktory.kmmbridge") version "0.3.7"
}

kmmbridge {
    mavenPublishArtifacts()
    spm()
    frameworkName.set("KmmSample")
}

kotlin {
    android {
        publishAllLibraryVariants()
    }
    val ios = listOf(iosX64(), iosArm64(), iosSimulatorArm64())
    configure(ios) {
        binaries {
            framework {
                baseName = "KmmSample"
            }
        }
    }
}
