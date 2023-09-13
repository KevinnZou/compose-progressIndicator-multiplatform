import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.ExperimentalResourceApi
import sample.BasicProgressIndicatorSample

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        BasicProgressIndicatorSample()
    }
}

expect fun getPlatformName(): String