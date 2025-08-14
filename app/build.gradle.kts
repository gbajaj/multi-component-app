plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.gauravbajaj.pluggableComponents"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.gauravbajaj.interviewready"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
    buildFeatures {
        compose = true
    }
}

dependencies {
    // Core Android & Kotlin
    implementation(libs.androidx.core.ktx) // Kotlin extensions for Android framework
    implementation(libs.androidx.lifecycle.runtime.ktx) // Lifecycle KTX for coroutines and LiveData
    implementation(libs.lifecycleRuntime) // Lifecycle runtime components
    implementation(libs.lifecycleViewModel) // ViewModel library for managing UI-related data
    implementation(libs.lifecycleViewModelCompose) // ViewModel integration with Jetpack Compose
    implementation(libs.androidx.activity.compose) // Activity integration with Jetpack Compose

    // Jetpack Compose - UI Toolkit
    implementation(platform(libs.androidx.compose.bom)) // Bill of Materials for Compose versions
    implementation(libs.androidx.ui) // Core Compose UI library
    implementation(libs.androidx.ui.graphics) // Graphics library for Compose
    implementation(libs.androidx.ui.tooling.preview) // Tooling for Compose previews in Android Studio
    debugImplementation(libs.androidx.ui.tooling) // Debug implementation for Compose tooling
    implementation(libs.androidx.material3) // Material Design 3 components for Compose
    implementation(libs.androidx.material.icons.extended.v143)// Extended Material Icons for Compose

    // Dependency Injection - Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)

    // Asynchronous Programming - Coroutines
    implementation(libs.coroutinesCore) // Core Kotlin coroutines library
    implementation(libs.coroutinesAndroid) // Android-specific coroutine support

    // Navigation - Jetpack Navigation for Compose
    implementation(libs.navigationCompose) // Navigation components for Jetpack Compose
    implementation(libs.androidx.hilt.navigation.compose)

    // Networking - Making HTTP requests and parsing responses
    implementation(libs.okhttp) // HTTP client
    implementation(libs.okhttpLoggingInterceptor) // Interceptor for logging OkHttp requests/responses
    implementation(libs.retrofit) // Type-safe HTTP client for Android and Java
    implementation(libs.retrofitConverterMoshi) // Moshi converter for Retrofit
    implementation(libs.moshi) // JSON library for Android and Java
    implementation(libs.moshiKotlin) // Kotlin support for Moshi

    // Image Loading - Efficiently loading and displaying images
    implementation(libs.coil) // Image loading library for Android backed by Kotlin Coroutines
    implementation(libs.coilCompose) // Coil integration with Jetpack Compose

    // Testing - Unit, Integration, and UI tests
    // Unit Testing
    testImplementation(libs.junit) // JUnit framework for unit testing
    testImplementation(libs.turbine) // Testing Flow emissions

    // Android Instrumentation Testing (UI & Integration)
    androidTestImplementation(libs.androidx.junit) // AndroidX Test Library for JUnit
    androidTestImplementation(libs.androidx.espresso.core) // Espresso for UI testing

    // Debugging and Testing Utilities for Compose
    // Note: Some of these might be duplicated from the Compose UI section, ensure only necessary ones are kept.
    // debugImplementation(libs.androidx.ui.tooling) // Already included above for Compose Previews
    debugImplementation(libs.androidx.ui.test.manifest) // Test manifest for Compose UI tests
    debugImplementation(libs.androidx.ui.test.junit4) // JUnit 4 rules for Compose UI tests
    // debugImplementation(libs.androidx.ui.test.manifest) // Duplicate, can be removed
}
