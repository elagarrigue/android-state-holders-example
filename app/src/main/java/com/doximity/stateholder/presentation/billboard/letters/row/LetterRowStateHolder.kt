package com.doximity.stateholder.presentation.billboard.letters.row

import androidx.compose.runtime.Stable
import com.doximity.stateholder.presentation.billboard.light.LightStateHolder
import com.doximity.stateholder.presentation.billboard.light.LightUiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

@Stable
class LetterRowStateHolder(
    private val lightStateHolder1: LightStateHolder,
    private val lightStateHolder2: LightStateHolder,
    private val lightStateHolder3: LightStateHolder,
    private val lightStateHolder4: LightStateHolder,
) {

    val letterRowUiStateFlow: Flow<LetterRowUiState> = combine(
        lightStateHolder1.lightStateFlow,
        lightStateHolder2.lightStateFlow,
        lightStateHolder3.lightStateFlow,
        lightStateHolder4.lightStateFlow,
    ) { lightUiState1: LightUiState, lightUiState2: LightUiState, lightUiState3: LightUiState, lightUiState4: LightUiState ->
        LetterRowUiState(lightUiState1, lightUiState2, lightUiState3, lightUiState4)
    }

    fun updateRowLightsOn(state: Array<Char>) {
        lightStateHolder1.updateOn(state[0] == '1')
        lightStateHolder2.updateOn(state[1] == '1')
        lightStateHolder3.updateOn(state[2] == '1')
        lightStateHolder4.updateOn(state[3] == '1')
    }
}