package com.doximity.stateholder.presentation.mosaic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doximity.stateholder.presentation.mosaic.blue.Blue
import com.doximity.stateholder.presentation.mosaic.green.Green
import com.doximity.stateholder.presentation.mosaic.red.Red

@Composable
fun MosaicScreen(uiState: MosaicUiState, uiActions: MosaicUiActions) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(20.dp)
    ) {

        Green(uiState.greenUiState, uiActions)

        Red(uiState.redUiState, uiActions)

        Blue(uiState.blueUiState, uiActions)
    }
}

@Preview
@Composable
fun MosaicPreview() {
    MosaicScreen(MosaicUiState(), object : MosaicUiActions {})
}