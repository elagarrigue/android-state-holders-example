package com.doximity.stateholder.presentation.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Stable
class TextFieldState {

    var text: String by mutableStateOf("")

    fun setTheText(value: String) {
        text = value.uppercase()
    }
}

@Composable
fun rememberTextFieldWithState() = remember { TextFieldState() }