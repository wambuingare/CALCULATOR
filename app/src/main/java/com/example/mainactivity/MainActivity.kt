package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etnumber1: EditText
    lateinit var etnumber2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var btnResult: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etnumber1 = findViewById(R.id.etnumber1)
        etnumber2 = findViewById(R.id.etnumber2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        btnResult = findViewById(R.id.btnResult)

        btnAdd.setOnClickListener {
            var number1 = etnumber1.toString().toDouble()
            var number2 = etnumber2.toString().toDouble()
            add(number1, number2)
        }
        btnSubtract.setOnClickListener {
            var number1 = etnumber1.toString().toDouble()
            var number2 = etnumber2.toString().toDouble()
            subtract(number1, number2)
        }
        btnMultiply.setOnClickListener {
            var number1 = etnumber1.toString().toDouble()
            var number2 = etnumber2.toString().toDouble()
            multiply(number1, number2)
        }
        btnModulus.setOnClickListener {
            var number1 = etnumber1.toString().toDouble()
            var number2 = etnumber2.toString().toDouble()
            modulus(number1, number2)
        }
    }
        fun add(number1:Double,number2:Double){
            var sum=number1+number2
            btnResult.text=sum.toString()
        }
        fun subtract(number1:Double,number2:Double){
            var minus=number1-number2
            btnResult.text=minus.toString()
        }
        fun multiply(number1:Double,number2:Double){
            var times=number1*number2
            btnResult.text=times.toString()
        }
        fun modulus(number1:Double,number2:Double){
            var remainder=number1%number2
            btnResult.text=remainder.toString()
        }
    }
