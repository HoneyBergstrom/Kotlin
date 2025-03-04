package Inlämnning2

import java.io.File

    val data : List<Int> = File("src/Inlämnning2/input.txt").readLines().map { it.toInt()}

    fun funktionPartOne (numbers : List<Int>) {
        for (i in numbers.indices) {
            for(j in i + 1 until numbers.size) {
                if(numbers[i] + numbers[j] == 2020) {
                    val num1 = numbers[i]
                    val num2 = numbers[j]
                    val result = num1 * num2
                    println("$num1 * $num2 = $result")
                }
            }

        }

    }

    fun funktionPartTwo (numbers : List<Int>) {
        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                for (k in j + 1 until numbers.size) {
                    if(numbers[i] + numbers[j] + numbers[k] == 2020) {
                        val num1 = numbers[i]
                        val num2 = numbers[j]
                        val num3 = numbers[k]
                        val result = num1 * num2 * num3
                        println("$num1 * $num2 * $num3 = $result")
                    }
                }
            }

        }
    }


fun main () {
    funktionPartOne(data)
    funktionPartTwo(data)
}