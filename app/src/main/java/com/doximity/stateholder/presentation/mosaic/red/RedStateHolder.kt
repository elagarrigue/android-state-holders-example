package com.doximity.stateholder.presentation.mosaic.red

import androidx.compose.runtime.Stable
import com.doximity.stateholder.domain.PulseUseCase
import kotlinx.coroutines.flow.map

@Stable
class RedStateHolder(
    pulseUseCase: PulseUseCase
) : RedUiActions {
    private var on: Boolean = true

    val redStateFlow = pulseUseCase.pulseFlow.map { RedUiState(it, on) }

    override fun updateRed() {
        on = !on
    }
}