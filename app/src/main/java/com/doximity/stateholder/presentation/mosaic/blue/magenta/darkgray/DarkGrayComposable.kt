package com.doximity.stateholder.presentation.mosaic.blue.magenta.darkgray

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DarkGray(modifier: Modifier, uiState: DarkGrayUiState, uiActions: DarkGrayUiActions) {

    Box(
        modifier = modifier
            .fillMaxHeight()
            .padding(10.dp)
            .alpha(
                if (uiState.running && uiState.blink) 1f
                else .5f
            )
            .background(Color.Gray)
            .clickable { uiActions.updateDarkGray() }
    )
}