package com.doximity.stateholder.presentation.mosaic.red

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Red(uiState: RedUiState, uiActions: RedUiActions) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(20.dp)
            .alpha(
                if (uiState.running && uiState.blink) 1f
                else .5f
            )
            .background(Color.Red)
            .clickable { uiActions.updateRed() }
    ) {

    }
}