package com.doximity.stateholder.domain

fun Char.toLetterArray() =
    when(this) {
        'A' -> letterA
        'B' -> letterB
        'C' -> letterC
        'D' -> letterD
        'E' -> letterE
        'F' -> letterF
        'G' -> letterG
        'H' -> letterH
        'I' -> letterI
        'J' -> letterJ
        'K' -> letterK
        'L' -> letterL
        'M' -> letterM
        'N' -> letterN
        'O' -> letterO
        'P' -> letterP
        'Q' -> letterQ
        'R' -> letterR
        'S' -> letterS
        'T' -> letterT
        'U' -> letterU
        'U' -> letterU
        'V' -> letterV
        'W' -> letterW
        'X' -> letterX
        'Y' -> letterY
        'Z' -> letterZ
        else -> empty
    }

private val empty = arrayOf(
    arrayOf('0', '0', '0', '0'),
    arrayOf('0', '0', '0', '0'),
    arrayOf('0', '0', '0', '0'),
    arrayOf('0', '0', '0', '0'),
    arrayOf('0', '0', '0', '0'),
)

private val letterA = arrayOf(
    arrayOf('0', '1', '1', '0'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '1', '1'),
    arrayOf('1', '0', '0', '1'),
)

private val letterB = arrayOf(
    arrayOf('1', '1', '1', '0'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '1', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '1', '0'),
)

private val letterC = arrayOf(
    arrayOf('0', '1', '1', '1'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('0', '1', '1', '1'),
)

private val letterD = arrayOf(
    arrayOf('1', '1', '1', '0'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '1', '0'),
)

private val letterE = arrayOf(
    arrayOf('1', '1', '1', '1'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '1', '1', '1'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '1', '1', '1'),
)

private val letterF = arrayOf(
    arrayOf('1', '1', '1', '1'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '1', '1', '1'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '0', '0', '0'),
)

private val letterG = arrayOf(
    arrayOf('0', '1', '1', '1'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '0', '1', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('0', '1', '1', '1'),
)

private val letterH = arrayOf(
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '1', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
)

private val letterI = arrayOf(
    arrayOf('1', '1', '1', '0'),
    arrayOf('0', '1', '0', '0'),
    arrayOf('0', '1', '0', '0'),
    arrayOf('0', '1', '0', '0'),
    arrayOf('1', '1', '1', '0'),
)

private val letterJ = arrayOf(
    arrayOf('1', '1', '1', '1'),
    arrayOf('0', '0', '0', '1'),
    arrayOf('0', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('0', '1', '1', '0'),
)

private val letterK = arrayOf(
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '1', '0'),
    arrayOf('1', '1', '0', '0'),
    arrayOf('1', '0', '1', '0'),
    arrayOf('1', '0', '0', '1'),
)

private val letterL = arrayOf(
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '1', '1'),
)

private val letterM = arrayOf(
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '1', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
)

private val letterN = arrayOf(
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '0', '1'),
    arrayOf('1', '0', '1', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
)

private val letterO = arrayOf(
    arrayOf('0', '1', '1', '0'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('0', '1', '1', '0'),
)

private val letterP = arrayOf(
    arrayOf('1', '1', '1', '0'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '1', '0'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '0', '0', '0'),
)

private val letterQ = arrayOf(
    arrayOf('0', '1', '1', '0'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '1', '1'),
    arrayOf('0', '1', '1', '1'),
)

private val letterR = arrayOf(
    arrayOf('1', '1', '1', '0'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '1', '0'),
    arrayOf('1', '0', '1', '0'),
    arrayOf('1', '0', '0', '1'),
)

private val letterS = arrayOf(
    arrayOf('0', '1', '1', '1'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '1', '1', '1'),
    arrayOf('0', '0', '0', '1'),
    arrayOf('1', '1', '1', '0'),
)

private val letterT = arrayOf(
    arrayOf('1', '1', '1', '0'),
    arrayOf('0', '1', '0', '0'),
    arrayOf('0', '1', '0', '0'),
    arrayOf('0', '1', '0', '0'),
    arrayOf('0', '1', '0', '0'),
)

private val letterU = arrayOf(
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('0', '1', '1', '0'),
)

private val letterV = arrayOf(
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('0', '1', '1', '0'),
    arrayOf('0', '1', '1', '0'),
)

private val letterW = arrayOf(
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '0', '0', '1'),
    arrayOf('1', '1', '1', '1'),
    arrayOf('1', '1', '1', '1'),
    arrayOf('0', '1', '1', '0'),
)

private val letterX = arrayOf(
    arrayOf('1', '0', '0', '1'),
    arrayOf('0', '1', '1', '0'),
    arrayOf('0', '1', '1', '0'),
    arrayOf('0', '1', '1', '0'),
    arrayOf('1', '0', '0', '1'),
)

private val letterY = arrayOf(
    arrayOf('1', '0', '1', '0'),
    arrayOf('0', '1', '0', '0'),
    arrayOf('0', '1', '0', '0'),
    arrayOf('0', '1', '0', '0'),
    arrayOf('0', '1', '0', '0'),
)

private val letterZ = arrayOf(
    arrayOf('1', '1', '1', '1'),
    arrayOf('0', '0', '1', '0'),
    arrayOf('0', '1', '0', '0'),
    arrayOf('1', '0', '0', '0'),
    arrayOf('1', '1', '1', '1'),
)