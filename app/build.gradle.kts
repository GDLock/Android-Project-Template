@file:Suppress("UnstableApiUsage")

plugins {
    id("android-application-convention")
}

android {
    defaultConfig {
        applicationId = "com.rstagirov.androidprojecttemplate"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(libs.androidx.coreKtx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintLayout)
    implementation(libs.material)
}
