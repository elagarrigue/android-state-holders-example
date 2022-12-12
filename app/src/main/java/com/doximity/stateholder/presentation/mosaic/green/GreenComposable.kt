package com.doximity.stateholder.presentation.mosaic.green

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.doximity.stateholder.presentation.mosaic.green.black.Black
import com.doximity.stateholder.presentation.mosaic.green.white.White

@Composable
fun Green(greenUiState: GreenUiState, uiActions: GreenUiActions) {

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp)
        .padding(20.dp)
        .background(Color.Green)) {

        White(Modifier
            .weight(1f), greenUiState.whiteUiState, uiActions)
        Black(Modifier
            .weight(1f), greenUiState.blackUiState, uiActions)

    }
}