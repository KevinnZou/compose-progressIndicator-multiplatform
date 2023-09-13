package progressindicator

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring

/**
 * Created By Kevin Zou On 2023/9/13
 */
/**
 * Contains the default values used for [SimpleProgressIndicator].
 */
object SimpleProgressIndicatorDefaults {
    /**
     * The default [AnimationSpec] that should be used when animating between progress in a
     * determinate progress indicator.
     */
    val SimpleProgressAnimationSpec: AnimationSpec<Float> = spring(
        dampingRatio = Spring.DampingRatioNoBouncy,
        stiffness = Spring.StiffnessLow,
        visibilityThreshold = null,
    )
}