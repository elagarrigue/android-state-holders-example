package com.doximity.stateholder.domain

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

class PulseUseCase {

    private val frequency = Random.nextInt(100, 1500)

    val pulseFlow: Flow<Boolean> = flow {
        while(true) {
            emit(true)
            delay(frequency.toLong())
            emit(false)
            delay(150L)
        }
    }
}