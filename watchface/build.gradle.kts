plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

    // Use the locally-defined validator to demonstrate validation on-build.
    id("com.google.wff.validatorplugin")
}

android {
    namespace = "dev.zyplos.mcclock"
    compileSdk = 34

    defaultConfig {
        applicationId = "dev.zyplos.mcclock"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

//dependencies {
//    implementation(libs.play.services.wearable)
//}