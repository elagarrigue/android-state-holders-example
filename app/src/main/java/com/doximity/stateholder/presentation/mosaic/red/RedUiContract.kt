package com.doximity.stateholder.presentation.mosaic.red

interface RedUiActions {
    fun updateRed() {}
}

data class RedUiState(val blink: Boolean = true, val running: Boolean = true)