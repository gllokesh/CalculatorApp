package com.lokesh.calculatorapp.presentation

import com.lokesh.calculatorapp.domain.CalculatorAction

data class CalculatorUiAction(
    val text: String?,
    val action: CalculatorAction,
)