package com.example.hw_04_25

class Triangle (
    sideOne: Double,
    sideTwo: Double,
): Shape(
    sideOne,
    sideTwo
) {

override fun calculateArea(){
    area = (sideOne * sideTwo) / 2
}

}