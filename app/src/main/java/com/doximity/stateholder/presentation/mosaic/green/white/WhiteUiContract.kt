package com.doximity.stateholder.presentation.mosaic.green.white

interface WhiteUiActions {
    fun updateWhite() {}
}

data class WhiteUiState(val blink: Boolean = true, val running: Boolean = true)