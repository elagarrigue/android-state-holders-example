package com.doximity.stateholder.presentation.mosaic.green

import com.doximity.stateholder.presentation.mosaic.green.black.BlackUiActions
import com.doximity.stateholder.presentation.mosaic.green.black.BlackUiState
import com.doximity.stateholder.presentation.mosaic.green.white.WhiteUiActions
import com.doximity.stateholder.presentation.mosaic.green.white.WhiteUiState

interface GreenUiActions : WhiteUiActions, BlackUiActions

data class GreenUiState(
    val whiteUiState: WhiteUiState = WhiteUiState(),
    val blackUiState: BlackUiState = BlackUiState(),
)