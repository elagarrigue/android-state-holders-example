package com.doximity.stateholder.presentation.mosaic.blue.magenta.lightgray

interface LightGrayUiActions {
    fun updateLightGray() {}
}

data class LightGrayUiState(val blink: Boolean = true, val running: Boolean = true)