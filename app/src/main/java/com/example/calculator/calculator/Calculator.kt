package com.example.calculator.calculator

class Calculator {

    fun addNumber(a:Int,b:Int):Int= Operators.add(a, b)

    fun subtractTwoNumbers(a: Int, b: Int): Int = Operators.subtract(a, b)

    fun multiplyTwoNumbers(a: Int, b: Int): Int = Operators.multiply(a, b)

    fun divideTwoNumbers(a: Int, b: Int): Int = Operators.divide(a, b)

}