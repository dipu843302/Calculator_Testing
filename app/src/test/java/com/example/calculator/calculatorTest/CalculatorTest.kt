package com.example.calculator.calculatorTest

import com.example.calculator.calculator.Calculator
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {

    lateinit var calculator: Calculator

    @Before
    fun onSetup() {
        calculator = Calculator()
    }

    @Test
    fun givenValidInput_whenAdd() {
        val a = 10
        val b = 10
        val result = calculator.addNumber(a, b)
        assertThat(result).isNotNull()
    }

    @Test
    fun givenValidInput_whenSubtract() {
        val a = 10
        val b = 10
        val result2 = calculator.subtractTwoNumbers(a, b)
        assertThat(result2).isNotNull()
    }

    @Test
    fun givenValidInput_whenMultiple() {
        val a = 10
        val b = 10
        val result3 = calculator.multiplyTwoNumbers(a, b)
        assertThat(result3).isNotNull()
    }

    @Test
    fun givenValidInput_whenDivide() {
        val a = 10
        val b = 10
        val result4 = calculator.divideTwoNumbers(a, b)
        assertThat(result4).isNotNull()
    }
}