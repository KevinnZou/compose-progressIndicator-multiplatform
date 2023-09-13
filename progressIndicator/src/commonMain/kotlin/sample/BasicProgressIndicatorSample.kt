package sample

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import progressindicator.SimpleProgressIndicatorWithAnim

/**
 * Created By Kevin Zou On 2023/9/13
 */
@Composable
internal fun BasicProgressIndicatorSample() {
    var progress by remember { mutableStateOf(0.5f) }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(
                modifier = Modifier.wrapContentSize(),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text("Simple ProgressIndicator Examples", fontSize = 16.sp)
                LinearProgressIndicator(
                    progress, modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth()
                        .height(12.dp)
                )
                SimpleProgressIndicatorWithAnim(
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth()
                        .height(12.dp),
                    progress = progress,
                    trackColor = Color(0XFFFBE8E8),
                    progressBarColor = Color.Yellow,
                    thumbColor = Color.Magenta,
                    cornerRadius = 15.dp,
                    thumbRadius = 6.dp,
                    thumbOffset = 6.dp,
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessVeryLow,
                        visibilityThreshold = 0.4f,
                    )
                )
                SimpleProgressIndicatorWithAnim(
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth()
                        .height(12.dp),
                    progress,
                    cornerRadius = 15.dp,
                    thumbRadius = 5.dp,
                    thumbOffset = 6.dp
                )
                Row(
                    modifier = Modifier
                        .height(50.dp)
                        .wrapContentWidth(),
                    horizontalArrangement = Arrangement.spacedBy(50.dp)
                ) {
                    Button(
                        onClick = {
                            progress = (progress - 0.1f).coerceAtLeast(0f)
                        },
                        shape = RoundedCornerShape(10.dp),
                    ) {
                        Text(text = "Decrease")
                    }
                    Button(
                        onClick = {
                            progress = (progress + 0.1f).coerceAtMost(1f)
                        },
                        shape = RoundedCornerShape(10.dp),
                    ) {
                        Text(text = "Increase")
                    }
                }
            }
        }

    }
}