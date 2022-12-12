package com.doximity.stateholder.presentation.billboard.letters

import androidx.compose.runtime.Stable
import com.doximity.stateholder.domain.toLetterArray
import com.doximity.stateholder.presentation.billboard.letters.row.LetterRowStateHolder
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

@Stable
class LetterStateHolder(
    private val lightRowStateHolder1: LetterRowStateHolder,
    private val lightRowStateHolder2: LetterRowStateHolder,
    private val lightRowStateHolder3: LetterRowStateHolder,
    private val lightRowStateHolder4: LetterRowStateHolder,
    private val lightRowStateHolder5: LetterRowStateHolder,
) {

    val letterUiStateFlow: Flow<LetterUiState> = combine(
        lightRowStateHolder1.letterRowUiStateFlow,
        lightRowStateHolder2.letterRowUiStateFlow,
        lightRowStateHolder3.letterRowUiStateFlow,
        lightRowStateHolder4.letterRowUiStateFlow,
        lightRowStateHolder5.letterRowUiStateFlow,
    ) { letterRowUiState1, letterRowUiState2, letterRowUiState3, letterRowUiState4, letterRowUiState5 ->
        LetterUiState(
            letterRowUiState1,
            letterRowUiState2,
            letterRowUiState3,
            letterRowUiState4,
            letterRowUiState5
        )
    }

    fun updateLetter(letter: Char) {
        lightRowStateHolder1.updateRowLightsOn(letter.toLetterArray()[0])
        lightRowStateHolder2.updateRowLightsOn(letter.toLetterArray()[1])
        lightRowStateHolder3.updateRowLightsOn(letter.toLetterArray()[2])
        lightRowStateHolder4.updateRowLightsOn(letter.toLetterArray()[3])
        lightRowStateHolder5.updateRowLightsOn(letter.toLetterArray()[4])


    }
}
