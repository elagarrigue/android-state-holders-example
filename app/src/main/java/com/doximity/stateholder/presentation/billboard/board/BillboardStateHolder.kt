package com.doximity.stateholder.presentation.billboard.board

import androidx.compose.runtime.Stable
import com.doximity.stateholder.presentation.billboard.letters.LetterStateHolder
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

@Stable
class BillboardStateHolder(
    private val letter1StateHolder: LetterStateHolder,
    private val letter2StateHolder: LetterStateHolder,
    private val letter3StateHolder: LetterStateHolder,
    private val letter4StateHolder: LetterStateHolder,
    private val letter5StateHolder: LetterStateHolder,
) : BillboardUiActions {

    val billboardUiStateFlow: Flow<BillboardUiState> = combine(
        letter1StateHolder.letterUiStateFlow,
        letter2StateHolder.letterUiStateFlow,
        letter3StateHolder.letterUiStateFlow,
        letter4StateHolder.letterUiStateFlow,
        letter5StateHolder.letterUiStateFlow,
    ) { letter1UiState, letter2UiState, letter3UiState, letter4UiState, letter5UiState ->

        BillboardUiState(
            listOf(
                letter1UiState,
                letter2UiState,
                letter3UiState,
                letter4UiState,
                letter5UiState,
            )
        )
    }

    override fun updateWord(word: String) {
        letter1StateHolder.updateLetter(word.getOrNull(0) ?: ' ')
        letter2StateHolder.updateLetter(word.getOrNull(1) ?: ' ')
        letter3StateHolder.updateLetter(word.getOrNull(2) ?: ' ')
        letter4StateHolder.updateLetter(word.getOrNull(3) ?: ' ')
        letter5StateHolder.updateLetter(word.getOrNull(4) ?: ' ')
    }
}