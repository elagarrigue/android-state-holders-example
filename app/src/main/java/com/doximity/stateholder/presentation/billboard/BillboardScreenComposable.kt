package com.doximity.stateholder.presentation.billboard

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.doximity.stateholder.presentation.billboard.board.Billboard
import com.doximity.stateholder.presentation.billboard.board.BillboardUiActions
import com.doximity.stateholder.presentation.billboard.board.BillboardUiState
import com.doximity.stateholder.presentation.utils.TextFieldWithState

@Composable
fun BillboardScreen(billboardLetterUiState: BillboardUiState, billboardUiActions: BillboardUiActions) {

    Column {
        TextFieldWithState(billboardUiActions::updateWord)
        Billboard(billboardLetterUiState)
    }
}