package org.example.lesson_2_task_5

fun main() {
    var depositAmount: Double = 70_000.000
    var interestRate: Double = 16.7 / 100
    var depositTerm: Double = 20.0

    var compoundInterestMultiplier = Math.pow((1 + interestRate), (depositTerm))
    var endDepositAmount = depositAmount * compoundInterestMultiplier

    println("Размер вклада через 20 лет составит: ${"%.3f".format(endDepositAmount)}")
}