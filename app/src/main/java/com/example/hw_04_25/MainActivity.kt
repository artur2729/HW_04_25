package com.example.hw_04_25

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG = "hw"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val obj1 = Square(5.00, 3.00)
        val obj2 = Triangle(5.00, 3.00)
        val obj3 = Circle(5.00, 3.00)

        chooseShape(obj1)
        chooseShape(obj2)
        chooseShape(obj3)

    }

    fun chooseShape(shape: Shape){
       shape.calculateArea()
        Log.i(TAG, "onCreate: $shape")
    }
}