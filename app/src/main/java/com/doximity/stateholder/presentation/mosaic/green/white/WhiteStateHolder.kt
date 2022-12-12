package com.doximity.stateholder.presentation.mosaic.green.white

import androidx.compose.runtime.Stable
import com.doximity.stateholder.domain.PulseUseCase
import kotlinx.coroutines.flow.map

@Stable
class WhiteStateHolder(
    pulseUseCase: PulseUseCase
) : WhiteUiActions {
    private var on: Boolean = true

    val whiteStateFlow = pulseUseCase.pulseFlow.map { WhiteUiState(it, on) }

    override fun updateWhite() {
        on = !on
    }
}