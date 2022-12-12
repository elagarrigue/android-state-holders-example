package com.doximity.stateholder.presentation.mosaic.blue

import com.doximity.stateholder.presentation.mosaic.blue.magenta.MagentaUiActions
import com.doximity.stateholder.presentation.mosaic.blue.magenta.MagentaUiState
import com.doximity.stateholder.presentation.mosaic.blue.yellow.YellowUiActions
import com.doximity.stateholder.presentation.mosaic.blue.yellow.YellowUiState

interface BlueUiActions : YellowUiActions, MagentaUiActions

data class BlueUiState(
    val yellowUiState: YellowUiState = YellowUiState(),
    val magentaUiState: MagentaUiState = MagentaUiState(),
)