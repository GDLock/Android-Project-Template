package com.rstagirov.mobileservicesfactory.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

private const val kotlinLanguageVersion = "1.8"

internal fun Project.configureKotlinBase(commonExtension: KotlinProjectExtension) {
    commonExtension.apply {
        tasks.withType<KotlinCompile>().all {
            kotlinOptions {
                allWarningsAsErrors = true
                jvmTarget = JavaVersion.VERSION_11.toString()
                languageVersion = kotlinLanguageVersion
                apiVersion = kotlinLanguageVersion
                freeCompilerArgs = freeCompilerArgs + listOf(
                    "-opt-in=kotlin.ExperimentalStdlibApi",
                    "-opt-in=kotlin.time.ExperimentalTime"
                )
            }
        }
    }
}
