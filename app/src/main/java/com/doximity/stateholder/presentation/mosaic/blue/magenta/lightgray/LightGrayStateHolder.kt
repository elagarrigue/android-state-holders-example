package com.doximity.stateholder.presentation.mosaic.blue.magenta.lightgray

import androidx.compose.runtime.Stable
import com.doximity.stateholder.domain.PulseUseCase
import kotlinx.coroutines.flow.map

@Stable
class LightGrayStateHolder(
    pulseUseCase: PulseUseCase
) : LightGrayUiActions {
    private var on: Boolean = true

    val lightGrayStateFlow = pulseUseCase.pulseFlow.map { LightGrayUiState(it, on) }

    override fun updateLightGray() {
        on = !on
    }
}