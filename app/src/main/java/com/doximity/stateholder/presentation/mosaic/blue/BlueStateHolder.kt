package com.doximity.stateholder.presentation.mosaic.blue

import androidx.compose.runtime.Stable
import com.doximity.stateholder.presentation.mosaic.blue.magenta.MagentaStateHolder
import com.doximity.stateholder.presentation.mosaic.blue.magenta.MagentaUiActions
import com.doximity.stateholder.presentation.mosaic.blue.yellow.YellowStateHolder
import com.doximity.stateholder.presentation.mosaic.blue.yellow.YellowUiActions
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

@Stable
class BlueStateHolder(
    yellowStateHolder: YellowStateHolder,
    magentaStateHolder: MagentaStateHolder,
) : BlueUiActions,
    YellowUiActions by yellowStateHolder,
    MagentaUiActions by magentaStateHolder {

    val blueStateFlow: Flow<BlueUiState> = combine(
        yellowStateHolder.yellowStateFlow,
        magentaStateHolder.magentaStateFlow
    ) { yellowUiState, magentaUiState ->
        BlueUiState(yellowUiState, magentaUiState)
    }
}