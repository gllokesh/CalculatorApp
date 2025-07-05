package com.lokesh.calculatorapp.domain

enum class Operation(val symbol: String) {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("x"),
    DIVIDE("/"),
    PERCENT("%"),
    PLUS_MINUS("+/-")
}