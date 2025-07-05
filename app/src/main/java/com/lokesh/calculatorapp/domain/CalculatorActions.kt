package com.lokesh.calculatorapp.domain

sealed interface CalculatorAction {
    data class Number(val number: Int) : CalculatorAction
    data class CalculateOperation(val operation: Operation) : CalculatorAction
    data object Clear : CalculatorAction
    data object Delete : CalculatorAction
    data object Calculate : CalculatorAction
    data object Decimal : CalculatorAction
}