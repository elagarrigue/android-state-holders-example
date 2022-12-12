package com.doximity.stateholder.presentation.mosaic.blue.magenta

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.doximity.stateholder.presentation.mosaic.blue.magenta.darkgray.DarkGray
import com.doximity.stateholder.presentation.mosaic.blue.magenta.lightgray.LightGray

@Composable
fun Magenta(modifier: Modifier, uiState: MagentaUiState, uiActions: MagentaUiActions) {

    Row(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.Magenta)
    ) {

        LightGray(modifier, uiState.lightGrayUiState, uiActions)

        DarkGray(modifier, uiState.darkGrayUiState, uiActions)

    }

}