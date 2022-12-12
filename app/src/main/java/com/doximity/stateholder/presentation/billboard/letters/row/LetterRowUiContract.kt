package com.doximity.stateholder.presentation.billboard.letters.row

import com.doximity.stateholder.presentation.billboard.light.LightUiState

data class LetterRowUiState(
    val lightUiState1: LightUiState = LightUiState(),
    val lightUiState2: LightUiState = LightUiState(),
    val lightUiState3: LightUiState = LightUiState(),
    val lightUiState4: LightUiState = LightUiState(),
)