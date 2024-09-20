plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("maven-publish")
}

android {
    namespace = "com.rk.uniquebabyname"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

// Maven Publish Script for the local test library. It help to reduce versioning
// You can test from Gradle Menu -> Baby Name SDK(Root Folder of Project) -> Unique Baby Names(Our Library Name) -> Tasks -> Publishing -> publishToMavenLocal
afterEvaluate {
    android.libraryVariants.forEach {
            libraryVariant ->
        publishing.publications.create<MavenPublication>(libraryVariant.name) {
            from(components[libraryVariant.name])
            groupId = "com.github.ramkishoreprajapat"
            artifactId = "uniquebabynamelocal"
            version = "0.0.1"
        }
    }
}