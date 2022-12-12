package com.doximity.stateholder.presentation.mosaic.green.white

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun White(modifier:Modifier, uiState: WhiteUiState, uiActions: WhiteUiActions) {

    Box(modifier = modifier
        .height(150.dp)
        .padding(20.dp)
        .alpha(
            if (uiState.running && uiState.blink) 1f
            else .5f
        )
        .background(Color.White)
        .clickable { uiActions.updateWhite() }
    )
}