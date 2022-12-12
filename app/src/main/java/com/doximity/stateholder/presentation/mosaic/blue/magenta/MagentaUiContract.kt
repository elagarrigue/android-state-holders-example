package com.doximity.stateholder.presentation.mosaic.blue.magenta

import com.doximity.stateholder.presentation.mosaic.blue.magenta.darkgray.DarkGrayUiActions
import com.doximity.stateholder.presentation.mosaic.blue.magenta.darkgray.DarkGrayUiState
import com.doximity.stateholder.presentation.mosaic.blue.magenta.lightgray.LightGrayUiActions
import com.doximity.stateholder.presentation.mosaic.blue.magenta.lightgray.LightGrayUiState

interface MagentaUiActions : DarkGrayUiActions, LightGrayUiActions

data class MagentaUiState(
    val darkGrayUiState: DarkGrayUiState = DarkGrayUiState(),
    val lightGrayUiState: LightGrayUiState = LightGrayUiState(),
)