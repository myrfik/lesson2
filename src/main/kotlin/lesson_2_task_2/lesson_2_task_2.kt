package org.example.lesson_2_task_2

fun main() {

    var numberOfWorkers: Int = 50
    var salaryOfKeyWorkers: Int = 30000
    var numberOfTrainees: Int = 30
    var traineeSalary: Int = 20000

    //Расходы на выплату зарплаты постоянных сотрудников
    var payrollExpensesKeyWorkers: Int = numberOfWorkers * salaryOfKeyWorkers
    println("Расходы на выплату зарплаты постоянных сотрудников составили: $payrollExpensesKeyWorkers")

    // Общие расходы по ЗП после прихода стажеров
    var payrollExpenses: Int = payrollExpensesKeyWorkers + (numberOfTrainees * traineeSalary)
    println("Общие расходы по ЗП после прихода стажеров составили: $payrollExpenses ")

    //Среднюю ЗП одного сотрудника после устройства стажеров
    var averageSalary: Int = payrollExpenses / (numberOfWorkers + numberOfTrainees)
    println("Средняя ЗП одного сотрудника после устройства стажеров составила: $averageSalary")

}

