package progressindicator

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Created By Kevin Zou On 2023/9/13
 */

/**
 * Determinate <a href="https://material.io/components/progress-indicators#linear-progress-indicators" class="external" target="_blank">Material Design linear progress indicator</a>.
 *
 * Progress indicators express an unspecified wait time or display the length of a process.
 *
 * @param progress The progress of this progress indicator, where 0.0 represents no progress and 1.0
 * represents full progress. Values outside of this range are coerced into the range.
 * @param progressBarColor The color of the progress indicator.
 * @param cornerRadius The corner radius of the progress indicator.
 * @param trackColor The color of the background behind the indicator, visible when the
 * progress has not reached that area of the overall indicator yet.
 * @param thumbRadius The radius of the thumb of the progress indicator.
 * @param thumbColor The color of the thumb of the  progress indicator.
 * @param thumbOffset The offset of the thumb of the  progress indicator. It determines the center of the
 * thumb. If the offset is zero, the center of the thumb will be at the end of the progress. By default, it is
 * set to [thumbRadius] so that it will coerce into the progressbar.
 * @param animationSpec The animation specifics for progress change.
 */
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
) {
    val mProgress: Float by animateFloatAsState(
        targetValue = progress,
        animationSpec = animationSpec
    )
    SimpleProgressIndicator(
        modifier,
        mProgress,
        progressBarColor,
        cornerRadius,
        trackColor,
        thumbRadius,
        thumbColor,
        thumbOffset
    )
}


/**
 * Determinate <a href="https://material.io/components/progress-indicators#linear-progress-indicators" class="external" target="_blank">Material Design linear progress indicator</a>.
 *
 * Progress indicators express an unspecified wait time or display the length of a process.
 *
 * By default there is no animation between [progress] values. You can use
 * [SimpleProgressIndicatorWithAnim] to animate progress.
 *
 * @param progress The progress of this progress indicator, where 0.0 represents no progress and 1.0
 * represents full progress. Values outside of this range are coerced into the range.
 * @param progressBarColor The color of the progress indicator.
 * @param cornerRadius The corner radius of the progress indicator.
 * @param trackColor The color of the background behind the indicator, visible when the
 * progress has not reached that area of the overall indicator yet.
 * @param thumbRadius The radius of the thumb of the progress indicator.
 * @param thumbColor The color of the thumb of the  progress indicator.
 * @param thumbOffset The offset of the thumb of the  progress indicator. It determines the center of the
 * thumb. If the offset is zero, the center of the thumb will be at the end of the progress. By default, it is
 * set to [thumbRadius] so that it will coerce into the progressbar.
 */
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
) {
    Canvas(modifier.progressSemantics(progress)) {
        val progressWidth = size.width * progress
        drawLinearIndicatorBackground(trackColor, cornerRadius)
        drawLinearIndicator(progress, progressBarColor, cornerRadius)
        val thumbCenter = progressWidth - thumbOffset.toPx()
        if (thumbCenter > 0) {
            drawThumb(
                thumbRadius,
                thumbColor,
                Offset(progressWidth - thumbOffset.toPx(), size.height / 2f)
            )
        }

    }
}