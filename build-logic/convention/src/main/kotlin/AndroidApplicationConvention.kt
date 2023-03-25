import com.android.build.api.dsl.ApplicationExtension
import com.android.build.gradle.AppExtension
import com.android.build.gradle.LibraryExtension
import com.rstagirov.mobileservicesfactory.convention.configureAndroidBase
import com.rstagirov.mobileservicesfactory.convention.configureKotlinBase
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

class AndroidApplicationConvention : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("kotlin-android")
            }
            extensions.configure<AppExtension> {
                configureAndroidBase(this)
            }
            extensions.configure<KotlinAndroidProjectExtension> {
                configureKotlinBase(this)
            }
        }
    }
}
