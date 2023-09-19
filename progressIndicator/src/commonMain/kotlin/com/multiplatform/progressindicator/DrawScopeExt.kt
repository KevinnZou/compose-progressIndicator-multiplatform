package com.multiplatform.progressindicator

import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.Dp

/**
 * Created By Kevin Zou On 2023/9/13
 */
internal fun DrawScope.drawLinearIndicatorBackground(
    color: Color,
    cornerRadius: Dp
) {
    drawLinearIndicator(1f, color, cornerRadius)
}

internal fun DrawScope.drawLinearIndicator(
    widthFraction: Float,
    color: Color,
    cornerRadius: Dp,
) {
    drawRoundRect(
        color = color,
        size = drawContext.size.copy(width = size.width * widthFraction),
        cornerRadius = CornerRadius(cornerRadius.toPx(), cornerRadius.toPx())
    )
}

internal fun DrawScope.drawThumb(radius: Dp, color: Color, center: Offset) {
    drawCircle(
        color,
        radius = radius.toPx(),
        center = center
    )
}