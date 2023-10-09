package com.kevinnzou.sample.shared

import androidx.compose.runtime.Composable

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()

@Composable
fun MainView() = App()