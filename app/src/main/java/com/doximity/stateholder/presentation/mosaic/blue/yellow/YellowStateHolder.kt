package com.doximity.stateholder.presentation.mosaic.blue.yellow

import androidx.compose.runtime.Stable
import com.doximity.stateholder.domain.PulseUseCase
import kotlinx.coroutines.flow.map

@Stable
class YellowStateHolder(
    pulseUseCase: PulseUseCase
) : YellowUiActions {
    private var on: Boolean = true

    val yellowStateFlow = pulseUseCase.pulseFlow.map { YellowUiState(it, on) }

    override fun updateYellow() {
        on = !on
    }
}