plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.firebase.crashlytics.gradle)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "android-application-convention"
            implementationClass = "AndroidApplicationConvention"
        }
        register("androidLibrary") {
            id = "android-library-convention"
            implementationClass = "AndroidLibraryConvention"
        }
        register("kotlinLibrary") {
            id = "kotlin-library-convention"
            implementationClass = "KotlinLibraryConvention"
        }
    }
}
