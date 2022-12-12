package com.doximity.stateholder.presentation.mosaic.blue

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.doximity.stateholder.presentation.mosaic.blue.magenta.Magenta
import com.doximity.stateholder.presentation.mosaic.blue.yellow.Yellow

@Composable
fun Blue(uiState: BlueUiState, uiActions: BlueUiActions) {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.Blue)
    ) {

        Yellow(modifier = Modifier.weight(1f), uiState = uiState.yellowUiState, uiActions)

        Magenta(modifier = Modifier.weight(1f), uiState = uiState.magentaUiState, uiActions)
    }

}