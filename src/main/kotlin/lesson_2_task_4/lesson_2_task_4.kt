package org.example.lesson_2_task_4

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val bonus: Double = 0.2

    val bonusCrystalOre: Int = (crystalOre * 20) / 100
    val bonusIronOre: Int = (ironOre * 20) / 100

    println("Количество бонусных материалов кристаллической руды составляет: $bonusCrystalOre ")
    println("Количество бонусных материалов железной руды составляет: $bonusIronOre ")

}

