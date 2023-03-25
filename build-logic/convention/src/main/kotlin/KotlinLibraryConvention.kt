import com.android.build.gradle.LibraryExtension
import com.rstagirov.mobileservicesfactory.convention.configureKotlinBase
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

class KotlinLibraryConvention : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.jvm")
            }
            extensions.configure<KotlinJvmProjectExtension> {
                configureKotlinBase(this)
            }
        }
    }
}
