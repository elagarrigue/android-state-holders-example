package com.doximity.stateholder.presentation.mosaic.blue.yellow

interface YellowUiActions {
    fun updateYellow() {}
}

data class YellowUiState(val blink: Boolean = true, val running: Boolean = true)