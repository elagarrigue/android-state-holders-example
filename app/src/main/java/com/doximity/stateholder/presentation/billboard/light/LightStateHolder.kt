package com.doximity.stateholder.presentation.billboard.light

import androidx.compose.runtime.Stable
import com.doximity.stateholder.domain.PulseUseCase
import kotlinx.coroutines.flow.map

@Stable
class LightStateHolder(
    pulseUseCase: PulseUseCase
) {
    private var on: Boolean = false

    val lightStateFlow = pulseUseCase.pulseFlow.map { LightUiState(it, on) }

    fun updateOn(value: Boolean) {
        on = value
    }
}