# Jetpack Compose - Movie App
Get a unique baby name from the list.

# Installation
## 1. Add it to your settings.gradle.kts
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

# Functions
<table>
  <tr>
   <td><strong>Function Name</strong>
   </td>
   <td><strong>Responsibilities</strong>
   </td>
   <td><strong>Use</strong>
   </td>
  </tr>
    
  <tr>
   <td><code>getRandomBabyName()</code>
   </td>
   <td>It will provide a random name from the list of baby names.
   </td>
   <td><code>BabyNameManager().getRandomBabyName()</code><br>
   </td>
  </tr>

  <tr>
   <td><code>getBabyNames()</code>
   </td>
   <td>It will provide a list of baby names.
   </td>
   <td><code>BabyNameManager().getBabyNames()</code><br>
   </td>
  </tr>

  <tr>
   <td><code>addBabyName(name: String)</code>
   </td>
   <td>It will add a new baby name to the list of baby names.
   </td>
   <td><code>BabyNameManager().addBabyName("john")</code><br>
   </td>
  </tr>

  <tr>
   <td><code>removeBabyName(name: String)</code>
   </td>
   <td>It will remove a baby name from the list of baby names.
   </td>
   <td><code>BabyNameManager().removeBabyName("john")</code><br>
   </td>
  </tr>

  <tr>
   <td><code>getBabyNameAtIndex(index: Int)</code>
   </td>
   <td>It will return the index of a baby name in the list.
   </td>
   <td><code>BabyNameManager().getBabyNameAtIndex(0)</code><br>
   </td>
  </tr>

  <tr>
   <td><code>getBabyNameIndex(name: String)</code>
   </td>
   <td>It will return the index of a baby name in the list.
   </td>
   <td><code>BabyNameManager().getBabyNameIndex("john")</code><br>
   </td>
  </tr>

  <tr>
   <td><code>getBabyNamesStartingWith(letter: Char)</code>
   </td>
   <td>It will return the index of a baby name in the list.
   </td>
   <td><code>BabyNameManager().getBabyNamesStartingWith('j')</code><br>
   </td>
  </tr>

  <tr>
   <td><code>getBabyNamesEndingWith(letter: Char)</code>
   </td>
   <td>It will return the index of a baby name in the list.
   </td>
   <td><code>BabyNameManager().getBabyNamesEndingWith('j')</code><br>
   </td>
  </tr>

  <tr>
   <td><code>getBabyNamesContaining(substring: String)</code>
   </td>
   <td>It will return the index of a baby name in the list.
   </td>
   <td><code>BabyNameManager().getBabyNamesContaining("jh")</code><br>
   </td>
  </tr>

  <tr>
   <td><code>getBabyNamesSortedByLength()</code>
   </td>
   <td>It will provide a list of baby names sorted by length.
   </td>
   <td><code>BabyNameManager().getBabyNamesSortedByLength()</code><br>
   </td>
  </tr>
</table>
