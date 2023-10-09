import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.kevinnzou.sample.shared.MainView

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        MainView()
    }
}