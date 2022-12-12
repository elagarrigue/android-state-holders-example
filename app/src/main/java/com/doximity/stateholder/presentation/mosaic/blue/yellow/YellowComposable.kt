package com.doximity.stateholder.presentation.mosaic.blue.yellow

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Yellow(modifier: Modifier, uiState: YellowUiState, uiActions: YellowUiActions) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
            .alpha(
                if (uiState.running && uiState.blink) 1f
                else .5f
            )
            .background(Color.Yellow)
            .clickable { uiActions.updateYellow() }
    )

}