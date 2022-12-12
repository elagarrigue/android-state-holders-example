package com.doximity.stateholder.presentation.billboard.board

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doximity.stateholder.presentation.billboard.letters.Letter
import com.doximity.stateholder.presentation.billboard.letters.LetterUiState
import com.doximity.stateholder.presentation.billboard.letters.row.LetterRowUiState
import com.doximity.stateholder.presentation.billboard.light.LightUiState

@Composable
fun Billboard(billboardLetterUiState: BillboardUiState) {

    Row {
        billboardLetterUiState.lettersUiState.forEach {
            Spacer(modifier = Modifier.size(16.dp))
            Letter(it)
        }
    }
}


@Preview
@Composable
fun BillboardPreview() {
    Billboard(
        BillboardUiState(
            listOf(
                LetterUiState(
                    LetterRowUiState(
                        LightUiState(blink = true, on = true),
                        LightUiState(on = false),
                        LightUiState(on = false),
                        LightUiState(on = false),
                    ),
                    LetterRowUiState(
                        LightUiState(blink = false, on = true),
                        LightUiState(on = false),
                        LightUiState(on = false),
                        LightUiState(on = false),
                    ),
                    LetterRowUiState(
                        LightUiState(blink = true, on = true),
                        LightUiState(on = false),
                        LightUiState(on = false),
                        LightUiState(on = false),
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
                ),
                LetterUiState(),
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
                ),
            )
        )
    )
}

