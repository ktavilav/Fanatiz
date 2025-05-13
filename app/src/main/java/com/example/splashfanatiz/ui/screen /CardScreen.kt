package com.example.splashfanatiz.ui.screen


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CardScreen() {
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(92.dp) // Ajusta la altura según necesites
            .padding(16.dp) // Opcional: añade padding alrededor
            .clip(RoundedCornerShape(8.dp)) // Opcional: redondea las esquinas
    ) {
        val width = size.width
        val height = size.height
        val backgroundColor = Color(0xFF5760A1) // Color azul claro
        val lineColor = Color.White
        val lineStrokeWidth = 2.dp.toPx()
        val cornerRadius = 8.dp.toPx() // Radio para las esquinas redondeadas

        // Dibujar el fondo redondeado
        drawRoundRect(
            color = backgroundColor,
            cornerRadius = CornerRadius(cornerRadius, cornerRadius)
        )

        // Dibujar la línea diagonal
        val path = Path().apply {
            moveTo(0f, 0f)
            lineTo(width, height)
        }
        drawPath(
            path = path,
            color = lineColor,
            style = Stroke(width = lineStrokeWidth)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardScreen() {
    CardScreen()
}
