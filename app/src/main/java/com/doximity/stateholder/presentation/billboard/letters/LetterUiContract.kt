package com.doximity.stateholder.presentation.billboard.letters

import com.doximity.stateholder.presentation.billboard.letters.row.LetterRowUiState

data class LetterUiState(
    val letterRowUiState1: LetterRowUiState = LetterRowUiState(),
    val letterRowUiState2: LetterRowUiState = LetterRowUiState(),
    val letterRowUiState3: LetterRowUiState = LetterRowUiState(),
    val letterRowUiState4: LetterRowUiState = LetterRowUiState(),
    val letterRowUiState5: LetterRowUiState = LetterRowUiState(),
)
