package com.doximity.stateholder.presentation.mosaic

import com.doximity.stateholder.presentation.mosaic.blue.BlueUiActions
import com.doximity.stateholder.presentation.mosaic.blue.BlueUiState
import com.doximity.stateholder.presentation.mosaic.green.GreenUiActions
import com.doximity.stateholder.presentation.mosaic.green.GreenUiState
import com.doximity.stateholder.presentation.mosaic.red.RedUiActions
import com.doximity.stateholder.presentation.mosaic.red.RedUiState

interface MosaicUiActions : GreenUiActions, RedUiActions, BlueUiActions

data class MosaicUiState(
    val greenUiState: GreenUiState = GreenUiState(),
    val redUiState: RedUiState = RedUiState(),
    val blueUiState: BlueUiState = BlueUiState()
)