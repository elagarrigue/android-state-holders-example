package com.doximity.stateholder.presentation.mosaic.green.black

import androidx.compose.runtime.Stable
import com.doximity.stateholder.domain.PulseUseCase
import kotlinx.coroutines.flow.map

@Stable
class BlackStateHolder(
    pulseUseCase: PulseUseCase
) : BlackUiActions {
    private var on: Boolean = true

    val blackStateFlow = pulseUseCase.pulseFlow.map { BlackUiState(it, on) }

    override fun updateBlack() {
        on = !on
    }
}