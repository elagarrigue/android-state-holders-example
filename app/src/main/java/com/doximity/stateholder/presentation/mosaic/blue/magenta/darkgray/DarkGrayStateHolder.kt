package com.doximity.stateholder.presentation.mosaic.blue.magenta.darkgray

import androidx.compose.runtime.Stable
import com.doximity.stateholder.domain.PulseUseCase
import kotlinx.coroutines.flow.map

@Stable
class DarkGrayStateHolder(
    pulseUseCase: PulseUseCase
) : DarkGrayUiActions {
    private var on: Boolean = true

    val darkGrayStateFlow = pulseUseCase.pulseFlow.map { DarkGrayUiState(it, on) }

    override fun updateDarkGray() {
        on = !on
    }
}