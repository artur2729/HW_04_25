package com.example.hw_04_25

import java.math.RoundingMode
import kotlin.math.PI

class Circle (
    sideOne: Double,
    sideTwo: Double,
): Shape(
    sideOne,
    sideTwo
) {

    override fun calculateArea(){
        area = ((sideOne/2)*(sideOne/2)* PI).toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
    }

}