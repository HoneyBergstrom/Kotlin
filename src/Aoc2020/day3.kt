package Aoc2020

import java.io.File

val data3 : List<String> = File("src/Aoc2020/day3Input.txt").readLines()

//QDAY3 : how many trees would you encounter?
//counting all the trees you would encounter for the slope right 3, down 1

fun countTrees(rightStep: Int, downStep: Int): Int {
    var treeCount = 0
    var horisontalPos = 0

    // Start from the top and go down by downStep until reach the bottom
    for (verticalPos in downStep until data3.size step downStep) {

        //Modulo-operatorn (%) wraping
        horisontalPos = (horisontalPos + rightStep) % data3[0].length

        // Check if there's a tree at the current position
        if (data3[verticalPos][horisontalPos] == '#') {
            treeCount++
        }
    }

    return treeCount
}

fun main() {
    // Part 1: Count trees with slope right 3, down 1
    val part1TreeCount = countTrees(3, 1)
    println("Part 1 - Number of trees encountered: $part1TreeCount")

    // Part 2: Check multiple slopes and multiply the results
    val slopes = listOf(
        Pair(1, 1),  // Right 1, down 1
        Pair(3, 1),  // Right 3, down 1 (same as Part 1)
        Pair(5, 1),  // Right 5, down 1
        Pair(7, 1),  // Right 7, down 1
        Pair(1, 2)   // Right 1, down 2
    ) //Pair är en enkel klass och object i Kotlin som håller ihop två värden.
      //arrayOf ( använa en 2D -array)
    // //två separat listor val rightSteps = listOf(1, 3, 5, 7, 1),val downSteps = listOf(1, 1, 1, 1, 2)
    // Calculate tree count for each slope and multiply them together
    val part2Result = slopes.map { (right, down) ->
        countTrees(right, down).toLong() // Convert to Long to prevent integer overflow
    }.reduce { acc, count -> acc * count }

    println("Part 2 - Product of tree counts: $part2Result")
}

