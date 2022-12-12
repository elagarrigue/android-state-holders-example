package com.doximity.stateholder.presentation.mosaic.green

import androidx.compose.runtime.Stable
import com.doximity.stateholder.presentation.mosaic.green.black.BlackStateHolder
import com.doximity.stateholder.presentation.mosaic.green.black.BlackUiActions
import com.doximity.stateholder.presentation.mosaic.green.white.WhiteStateHolder
import com.doximity.stateholder.presentation.mosaic.green.white.WhiteUiActions
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

@Stable
class GreenStateHolder(
    blackStateHolder: BlackStateHolder,
    whiteStateHolder: WhiteStateHolder,
) : GreenUiActions,
    BlackUiActions by blackStateHolder,
    WhiteUiActions by whiteStateHolder {

    val greenStateFlow: Flow<GreenUiState> = combine(
        whiteStateHolder.whiteStateFlow,
        blackStateHolder.blackStateFlow
    ) { whiteUiState, blackUiState ->
        GreenUiState(whiteUiState, blackUiState)
    }
}