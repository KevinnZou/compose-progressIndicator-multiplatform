import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.multiplatform.progressindicator.MainView

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        MainView()
    }
}