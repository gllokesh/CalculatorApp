package com.lokesh.calculatorapp.presentation

import com.lokesh.calculatorapp.domain.CalculatorAction
import com.lokesh.calculatorapp.domain.Operation

val calculatorActions = listOf(
    CalculatorUiAction(
        text = "AC",
        action = CalculatorAction.Clear
    ),
    CalculatorUiAction(
        text = "%",
        action = CalculatorAction.CalculateOperation(Operation.PERCENT)
    ),
    CalculatorUiAction(
        text = "+/-",
        action = CalculatorAction.CalculateOperation(Operation.PERCENT)
    ),
    CalculatorUiAction(
        text = "÷",
        action = CalculatorAction.CalculateOperation(Operation.DIVIDE)
    ),
    CalculatorUiAction(
        text = "7",
        action = CalculatorAction.Number(7)
    ),
    CalculatorUiAction(
        text = "8",
        action = CalculatorAction.Number(8)
    ),
    CalculatorUiAction(
        text = "9",
        action = CalculatorAction.Number(9)
    ),
    CalculatorUiAction(
        text = "x",
        action = CalculatorAction.CalculateOperation(Operation.MULTIPLY)
    ),
    CalculatorUiAction(
        text = "4",
        action = CalculatorAction.Number(4)
    ),
    CalculatorUiAction(
        text = "5",
        action = CalculatorAction.Number(5)
    ),
    CalculatorUiAction(
        text = "6",
        action = CalculatorAction.Number(6)
    ),
    CalculatorUiAction(
        text = "-",
        action = CalculatorAction.CalculateOperation(Operation.SUBTRACT)
    ),
    CalculatorUiAction(
        text = "1",
        action = CalculatorAction.Number(1)
    ),
    CalculatorUiAction(
        text = "2",
        action = CalculatorAction.Number(2)
    ),
    CalculatorUiAction(
        text = "3",
        action = CalculatorAction.Number(3)
    ),
    CalculatorUiAction(
        text = "+",
        action = CalculatorAction.CalculateOperation(Operation.ADD)
    ),
    CalculatorUiAction(
        text = "0",
        action = CalculatorAction.Number(0)
    ),
    CalculatorUiAction(
        text = ".",
        action = CalculatorAction.Decimal
    ),
    CalculatorUiAction(
        text = "<-",
        /*content = {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        },*/
        action = CalculatorAction.Delete
    ),
    CalculatorUiAction(
        text = "=",
        action = CalculatorAction.Calculate
    ),
)