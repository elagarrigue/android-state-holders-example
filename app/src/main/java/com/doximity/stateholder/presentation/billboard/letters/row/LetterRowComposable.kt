package com.doximity.stateholder.presentation.billboard.letters.row

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.doximity.stateholder.presentation.billboard.light.Light
import com.doximity.stateholder.presentation.billboard.light.LightUiState

@Composable
fun LetterRow(letterRowUiState: LetterRowUiState) {

    Row {
        Light(letterRowUiState.lightUiState1)
        Light(letterRowUiState.lightUiState2)
        Light(letterRowUiState.lightUiState3)
        Light(letterRowUiState.lightUiState4)
    }
}

@Preview
@Composable
fun LetterRowPreview() {
    LetterRow(
        LetterRowUiState(
            LightUiState(blink = true, on = true),
            LightUiState(blink = false, on = true),
            LightUiState(blink = true, on = true),
            LightUiState(on = false),
        )
    )
}