@file:OptIn(InternalComposeApi::class)

package deb_starthelper

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.InternalComposeApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

private val minWidth = 100.dp

@Composable
@Preview
fun SharpButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier.widthIn(min = minWidth),
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    shape: Shape = RoundedCornerShape(1.dp),
    border: BorderStroke? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    contentPadding: PaddingValues = PaddingValues(horizontal = 8.dp),
    content: @Composable (RowScope.() -> Unit),
){
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = colors,
        shape = shape,
        contentPadding = contentPadding,
    ) {
        content()
    }
}