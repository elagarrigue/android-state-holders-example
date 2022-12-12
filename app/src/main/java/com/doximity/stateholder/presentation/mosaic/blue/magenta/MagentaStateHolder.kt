package com.doximity.stateholder.presentation.mosaic.blue.magenta

import androidx.compose.runtime.Stable
import com.doximity.stateholder.presentation.mosaic.blue.magenta.darkgray.DarkGrayStateHolder
import com.doximity.stateholder.presentation.mosaic.blue.magenta.darkgray.DarkGrayUiActions
import com.doximity.stateholder.presentation.mosaic.blue.magenta.lightgray.LightGrayStateHolder
import com.doximity.stateholder.presentation.mosaic.blue.magenta.lightgray.LightGrayUiActions
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

@Stable
class MagentaStateHolder(
    lightGrayStateHolder: LightGrayStateHolder,
    darkGrayStateHolder: DarkGrayStateHolder,
) : MagentaUiActions,
    LightGrayUiActions by lightGrayStateHolder,
    DarkGrayUiActions by darkGrayStateHolder {

    val magentaStateFlow: Flow<MagentaUiState> = combine(
        lightGrayStateHolder.lightGrayStateFlow,
        darkGrayStateHolder.darkGrayStateFlow
    ) { lightGrayUiState, darkGrayUiState ->
        MagentaUiState(darkGrayUiState, lightGrayUiState)
    }
}