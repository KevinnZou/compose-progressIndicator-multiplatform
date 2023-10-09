package com.kevinnzou.sample.shared

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable

class DesktopPlatform: Platform {
    override val name: String = "Desktop"
}
actual fun getPlatform(): Platform {
    return DesktopPlatform()
}

@Composable
fun MainView() = App()

@Preview
@Composable
fun AppPreview() {
    App()
}