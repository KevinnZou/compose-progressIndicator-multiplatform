# compose-progressIndicator-multiplatform
[![Maven Central](https://img.shields.io/maven-central/v/io.github.kevinnzou/compose-progressIndicator-multiplatform.svg)](https://search.maven.org/artifact/io.github.kevinnzou/compose-progressIndicator-multiplatform)
[![Kotlin](https://img.shields.io/badge/kotlin-v1.9.10-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Compose Multiplatform](https://img.shields.io/badge/Compose%20Multiplatform-v1.5.1-blue)](https://github.com/JetBrains/compose-multiplatform)

![badge-android](http://img.shields.io/badge/platform-android-6EDB8D.svg?style=flat)
![badge-ios](http://img.shields.io/badge/platform-ios-CDCDCD.svg?style=flat)
![badge-desktop](http://img.shields.io/badge/platform-desktop-DB413D.svg?style=flat)

This Library is a Multiplatform version of [compose-progressIndicator](https://github.com/KevinnZou/compose-progressIndicator) which
is designed to improve the [LinearProgressIndicator](https://foso.github.io/Jetpack-Compose-Playground/material/linearprogressindicator/) provided by Jetpack Compose. 
Beside the base functionality provided by LinearProgressIndicator, This library supports the round corners for progressbar, thumb at the end of the bar, and the animations when progress changed. 
Developers can customize the size, position, and the color of the thumb.

<img src="media/simple-indicator.gif" width=300>

# Usage
All functionalities mentioned above are implemented in one component: [SimpleProgressIndicatorWithAnim](https://github.com/KevinnZou/compose-progressIndicator-multiplatform/blob/main/progressIndicator/src/commonMain/kotlin/progressindicator/SimpleProgressIndicator.kt)
```kotlin
@Composable
fun SimpleProgressIndicatorWithAnim(
    modifier: Modifier = Modifier,
    progress: Float = 0.7f,
    progressBarColor: Color = Color.Red,
    cornerRadius: Dp = 0.dp,
    trackColor: Color = Color(0XFFFBE8E8),
    thumbRadius: Dp = 0.dp,
    thumbColor: Color = Color.White,
    thumbOffset: Dp = thumbRadius,
    animationSpec: AnimationSpec<Float> = SimpleProgressIndicatorDefaults.SimpleProgressAnimationSpec,
) {}
```
you can use it simply like that
```kotlin
SimpleProgressIndicatorWithAnim(
              modifier = Modifier
                  .padding(15.dp)
                  .fillMaxWidth()
                  .height(4.dp),
              progress,
              cornerRadius = 35.dp,
              thumbRadius = 1.dp,
              thumbOffset = 1.5.dp
          )
```
If you do not want to have animation, then you can use [SimpleProgressIndicator](https://github.com/KevinnZou/compose-progressIndicator-multiplatform/blob/main/progressIndicator/src/commonMain/kotlin/progressindicator/SimpleProgressIndicator.kt)
```kotlin
@Composable
fun SimpleProgressIndicator(
    modifier: Modifier = Modifier,
    progress: Float = 0.7f,
    progressBarColor: Color = Color.Red,
    cornerRadius: Dp = 0.dp,
    trackColor: Color = Color(0XFFFBE8E8),
    thumbRadius: Dp = 0.dp,
    thumbColor: Color = Color.White,
    thumbOffset: Dp = thumbRadius
) {}
```

## Download

[![Maven Central](https://img.shields.io/maven-central/v/io.github.kevinnzou/compose-progressIndicator-multiplatform.svg)](https://search.maven.org/artifact/io.github.kevinnzou/compose-progressIndicator-multiplatform)

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation "io.github.kevinnzou:compose-progressIndicator-multiplatform:1.1.0"
}
```