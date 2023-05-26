plugins {
    id("org.jetbrains.kotlin.multiplatform") version "1.9.0-Beta"
    id("com.android.application") version "7.2.2" apply false
    id("com.android.library") version "7.2.2" apply false
}

kotlin {
    ios()
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }
}

kmmbridge {
    mavenPublishArtifacts()
    githubReleaseVersions()
    spm()
    versionPrefix.set("0.8")
}

android {
    compileSdk = 31
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 21
        targetSdk = 31
    }
}






