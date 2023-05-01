package com.example.hw_04_25

open class Shape(
    val sideOne: Double,
    val sideTwo: Double
) {
    var area: Double = 0.00
        protected set




    open fun calculateArea(){
        area = sideOne * sideTwo
    }

    override fun toString(): String{
        return "Jusu figuros plotas yra $area kv.cm"
    }
}
