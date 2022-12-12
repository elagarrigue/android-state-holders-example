package com.doximity.stateholder.presentation.billboard.board

import com.doximity.stateholder.domain.PulseUseCase
import com.doximity.stateholder.presentation.billboard.letters.LetterStateHolder
import com.doximity.stateholder.presentation.billboard.letters.row.LetterRowStateHolder
import com.doximity.stateholder.presentation.billboard.light.LightStateHolder

object BillboardStateHolderFactory {

    fun get() =
        BillboardStateHolder(
            getLetterStateHolder(),
            getLetterStateHolder(),
            getLetterStateHolder(),
            getLetterStateHolder(),
            getLetterStateHolder(),
        )
}

private fun getLetterStateHolder() =
    LetterStateHolder(
        LetterRowStateHolder(
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
        ),
        LetterRowStateHolder(
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
        ),
        LetterRowStateHolder(
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
        ),
        LetterRowStateHolder(
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
        ),
        LetterRowStateHolder(
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
            LightStateHolder(PulseUseCase()),
        ),
    )
