package com.multiplatform.progressindicator

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import sample.BasicProgressIndicatorSample

@Composable
fun App() {
    MaterialTheme {
        BasicProgressIndicatorSample()
    }
}

expect fun getPlatformName(): String