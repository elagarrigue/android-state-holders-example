package com.doximity.stateholder.presentation.mosaic

import androidx.compose.runtime.Stable
import com.doximity.stateholder.presentation.mosaic.blue.BlueStateHolder
import com.doximity.stateholder.presentation.mosaic.blue.BlueUiActions
import com.doximity.stateholder.presentation.mosaic.green.GreenStateHolder
import com.doximity.stateholder.presentation.mosaic.green.GreenUiActions
import com.doximity.stateholder.presentation.mosaic.green.black.BlackStateHolder
import com.doximity.stateholder.presentation.mosaic.green.white.WhiteStateHolder
import com.doximity.stateholder.presentation.mosaic.red.RedStateHolder
import com.doximity.stateholder.presentation.mosaic.red.RedUiActions
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

@Stable
class MosaicStateHolder(
    greenStateHolder: GreenStateHolder,
    redStateHolder: RedStateHolder,
    blueStateHolder: BlueStateHolder,
) : MosaicUiActions,
    GreenUiActions by greenStateHolder,
    RedUiActions by redStateHolder,
    BlueUiActions by blueStateHolder {

    val mosaicStateFlow: Flow<MosaicUiState> = combine(
        greenStateHolder.greenStateFlow,
        redStateHolder.redStateFlow,
        blueStateHolder.blueStateFlow
    ) { greenUiState, redUiState, blueUiState ->
        MosaicUiState(greenUiState, redUiState, blueUiState)
    }
}