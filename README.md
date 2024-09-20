# Jetpack Compose - Movie App
Get a unique baby name from the list.

# Installation
## 1. Add it to your root build.gradle at the end of repositories:
```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal()// it for testing our library locally without pushing it.
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
        }
    }
}
```

 ## 2. Add the dependency
```
 implementation 'com.github.ramkishoreprajapat:uniquebabyname:0.0.4'
```
