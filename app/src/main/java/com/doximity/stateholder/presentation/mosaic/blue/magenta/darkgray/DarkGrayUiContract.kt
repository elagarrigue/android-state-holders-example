package com.doximity.stateholder.presentation.mosaic.blue.magenta.darkgray

interface DarkGrayUiActions {
    fun updateDarkGray() {}
}

data class DarkGrayUiState(val blink: Boolean = true, val running: Boolean = true)