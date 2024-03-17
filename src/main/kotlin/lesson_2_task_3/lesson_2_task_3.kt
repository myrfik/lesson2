package org.example.lesson_2_task_3

fun main() {
    var departureHour: Int = 9
    var departureMinute: Int = 39
    var travelTime: Int = 457

    var arrivalHour = (departureHour * MINUTE_IN_HOUR + travelTime) / MINUTE_IN_HOUR
    var arrivalMinute = (departureHour * MINUTE_IN_HOUR + travelTime) % MINUTE_IN_HOUR

    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))
}

const val MINUTE_IN_HOUR = 60