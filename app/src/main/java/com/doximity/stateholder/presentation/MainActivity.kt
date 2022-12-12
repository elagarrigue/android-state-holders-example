package com.doximity.stateholder.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.doximity.stateholder.presentation.billboard.BillboardScreen
import com.doximity.stateholder.presentation.billboard.board.BillboardStateHolderFactory
import com.doximity.stateholder.presentation.billboard.board.BillboardUiState
import com.doximity.stateholder.presentation.mosaic.MosaicScreen
import com.doximity.stateholder.presentation.mosaic.MosaicStateHolderFactory
import com.doximity.stateholder.presentation.mosaic.MosaicUiState
import com.doximity.stateholder.presentation.theme.StateHolderExamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BillboardExample()
            //MosaicExample()
        }
    }
}

@Composable
private fun BillboardExample() {
    val billboardStateHolder = remember {
        BillboardStateHolderFactory.get()
    }

    val billboardLetterUiState by billboardStateHolder.billboardUiStateFlow.collectAsState(
        BillboardUiState()
    )

    StateHolderExamplesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            BillboardScreen(billboardLetterUiState, billboardStateHolder)
        }
    }
}

@Composable
private fun MosaicExample() {
    val mosaicStateHolder = remember {
        MosaicStateHolderFactory.get()
    }

    val mosaicUiState by mosaicStateHolder.mosaicStateFlow.collectAsState(
        MosaicUiState()
    )

    StateHolderExamplesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            MosaicScreen(mosaicUiState, mosaicStateHolder)
        }
    }
}