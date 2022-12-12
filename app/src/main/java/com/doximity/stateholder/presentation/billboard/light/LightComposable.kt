package com.doximity.stateholder.presentation.billboard.light

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Light(uiState: LightUiState) {
    Box(
        modifier = Modifier
            .padding(2.dp)
            .size(20.dp)
            .clip(CircleShape)
            .background(
                if (uiState.on && uiState.blink) Color.Red
                else Color.Black
            )
            .border(
                3.dp, if (uiState.on) Color.Yellow
                else Color.Black, CircleShape
            )
    )
}

@Preview
@Composable
fun LightBlinkOnPreview() {
    Light(LightUiState(blink = true, on = true))
}

@Preview
@Composable
fun LightBlinkOffPreview() {
    Light(LightUiState(blink = false, on = true))
}

@Preview
@Composable
fun LightOffPreview() {
    Light(LightUiState(on = false))
}