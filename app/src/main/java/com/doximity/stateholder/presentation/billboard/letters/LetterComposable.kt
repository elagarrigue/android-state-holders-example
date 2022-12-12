package com.doximity.stateholder.presentation.billboard.letters

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.doximity.stateholder.presentation.billboard.letters.row.LetterRow
import com.doximity.stateholder.presentation.billboard.letters.row.LetterRowUiState
import com.doximity.stateholder.presentation.billboard.light.LightUiState

@Composable
fun Letter(letterUiState: LetterUiState) {

    Column(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
    ) {
        LetterRow(letterUiState.letterRowUiState1)
        LetterRow(letterUiState.letterRowUiState2)
        LetterRow(letterUiState.letterRowUiState3)
        LetterRow(letterUiState.letterRowUiState4)
        LetterRow(letterUiState.letterRowUiState5)
    }
}

@Preview
@Composable
fun LetterPreview() {
    Letter(
        LetterUiState(
            LetterRowUiState(
                LightUiState(blink = false, on = true),
                LightUiState(blink = false, on = true),
                LightUiState(blink = true, on = true),
                LightUiState(blink = false, on = true),
            ),
            LetterRowUiState(
                LightUiState(blink = true, on = true),
                LightUiState(on = false),
                LightUiState(on = false),
                LightUiState(on = false),
            ),
            LetterRowUiState(
                LightUiState(blink = true, on = true),
                LightUiState(blink = true, on = true),
                LightUiState(blink = false, on = true),
                LightUiState(blink = true, on = true),
            ),
            LetterRowUiState(
                LightUiState(blink = false, on = true),
                LightUiState(on = false),
                LightUiState(on = false),
                LightUiState(on = false),
            ),
            LetterRowUiState(
                LightUiState(blink = true, on = true),
                LightUiState(blink = false, on = true),
                LightUiState(blink = true, on = true),
                LightUiState(blink = true, on = true),
            ),
        )

    )
}
