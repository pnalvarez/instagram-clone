plugins {
    id("android-application-setup")
    id("desktop-application-setup")
    id("compose-module-setup")
}

kotlin {
    sourceSets {
        val desktopMain by getting

        androidMain.dependencies {
            implementation(libs.compose.ui.tooling.preview)
            implementation(libs.androidx.activity.compose)
        }

        commonMain.dependencies {
            implementation(libs.voyager.navigator)
            implementation(libs.voyager.screenModel)
            implementation(libs.voyager.koin)
            implementation(libs.voyager.transitions)
            implementation(libs.voyager.bottomSheetNavigator)
            implementation(libs.kotlinx.coroutines.core)
        }
    }
}

android {
    dependencies {
        debugImplementation(libs.compose.ui.tooling)
    }
}
