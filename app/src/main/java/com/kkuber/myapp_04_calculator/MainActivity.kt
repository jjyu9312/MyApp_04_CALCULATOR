package com.kkuber.myapp_04_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(v : View) {
        when (v.id) {
            R.id.button0 -> numberButtonClicked("0")
            R.id.button1 -> numberButtonClicked("1")
            R.id.button2 -> numberButtonClicked("2")
            R.id.button3 -> numberButtonClicked("3")
            R.id.button4 -> numberButtonClicked("4")
            R.id.button5 -> numberButtonClicked("5")
            R.id.button6 -> numberButtonClicked("6")
            R.id.button7 -> numberButtonClicked("7")
            R.id.button8 -> numberButtonClicked("8")
            R.id.button9 -> numberButtonClicked("9")
            R.id.buttonPlus -> numberButtonClicked("")
            R.id.buttonMultiple -> numberButtonClicked("9")
            R.id.buttonDivision -> numberButtonClicked("9")
            R.id.buttonMinus -> numberButtonClicked("9")
        }
    }

    private fun numberButtonClicked(number : String) {

    }

    private fun

    fun resultButtonClicked(v : View) {

    }

    fun clearButtonClicked(v : View) {

    }

    fun uttonClicked(v : View) {

    }
}