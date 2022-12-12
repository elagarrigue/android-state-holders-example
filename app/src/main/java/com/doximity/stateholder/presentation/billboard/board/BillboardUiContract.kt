package com.doximity.stateholder.presentation.billboard.board

import com.doximity.stateholder.presentation.billboard.letters.LetterUiState

interface BillboardUiActions {
    fun updateWord(word: String)
}

data class BillboardUiState(
    val lettersUiState: List<LetterUiState> = listOf()
)