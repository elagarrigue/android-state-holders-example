package com.doximity.stateholder.presentation.mosaic

import com.doximity.stateholder.domain.PulseUseCase
import com.doximity.stateholder.presentation.mosaic.blue.BlueStateHolder
import com.doximity.stateholder.presentation.mosaic.blue.magenta.MagentaStateHolder
import com.doximity.stateholder.presentation.mosaic.blue.magenta.darkgray.DarkGrayStateHolder
import com.doximity.stateholder.presentation.mosaic.blue.magenta.lightgray.LightGrayStateHolder
import com.doximity.stateholder.presentation.mosaic.blue.yellow.YellowStateHolder
import com.doximity.stateholder.presentation.mosaic.green.GreenStateHolder
import com.doximity.stateholder.presentation.mosaic.green.black.BlackStateHolder
import com.doximity.stateholder.presentation.mosaic.green.white.WhiteStateHolder
import com.doximity.stateholder.presentation.mosaic.red.RedStateHolder

object MosaicStateHolderFactory {

    fun get() = MosaicStateHolder(
        GreenStateHolder(
            BlackStateHolder(PulseUseCase()),
            WhiteStateHolder(PulseUseCase()),
        ),
        RedStateHolder(PulseUseCase()),
        BlueStateHolder(
            YellowStateHolder(PulseUseCase()),
            MagentaStateHolder(
                LightGrayStateHolder(PulseUseCase()),
                DarkGrayStateHolder(PulseUseCase())
            )
        )
    )
}