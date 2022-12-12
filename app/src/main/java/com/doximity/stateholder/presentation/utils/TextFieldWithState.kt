package com.doximity.stateholder.presentation.utils

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable

@Composable
fun TextFieldWithState(onValueChange: (String) -> Unit) {

    val textFieldState = rememberTextFieldWithState()

    val text = textFieldState.text

    onValueChange(text)

    TextField(value = text, onValueChange = {
        textFieldState.setTheText(it)
    })
}