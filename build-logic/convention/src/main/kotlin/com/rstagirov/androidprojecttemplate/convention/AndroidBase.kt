package com.rstagirov.mobileservicesfactory.convention

import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

internal fun Project.configureAndroidBase(baseExtension: BaseExtension) {
    baseExtension.apply {
        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
        setCompileSdkVersion(libs.findVersion("compileSdk").get().requiredVersion.toInt())
        defaultConfig {
            minSdk = libs.findVersion("minSdk").get().requiredVersion.toInt()
            targetSdk = libs.findVersion("targetSdk").get().requiredVersion.toInt()
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }
    }
}
