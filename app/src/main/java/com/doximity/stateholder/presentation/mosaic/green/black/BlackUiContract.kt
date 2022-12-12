package com.doximity.stateholder.presentation.mosaic.green.black

interface BlackUiActions {
    fun updateBlack() {}
}

data class BlackUiState(val blink: Boolean = true, val running: Boolean = true)