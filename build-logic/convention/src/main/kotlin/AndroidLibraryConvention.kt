import com.android.build.gradle.LibraryExtension
import com.rstagirov.mobileservicesfactory.convention.configureAndroidBase
import com.rstagirov.mobileservicesfactory.convention.configureKotlinBase
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

class AndroidLibraryConvention : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("kotlin-android")
            }
            extensions.configure<LibraryExtension> {
                configureAndroidBase(this)
            }
            extensions.configure<KotlinAndroidProjectExtension> {
                configureKotlinBase(this)
            }
        }
    }
}
