package Inlämnning2

import java.io.File
//How many passwords are valid according to their policies?
//1-3 a means that the password must contain a at least 1 time and at most 3 times.

val data2 : List<String> = File("src/Inlämnning2/day2Input.txt").readLines().map { it.toString()}

fun validPasswordPart1() : Int {
    var validCount = 0 // begin counting from 0

    for (entry in data2) { //Parse policy and password
        val parts = entry.split(": ")   // Split by colon and space
        val policy = parts[0]           // Get policy part
        val password = parts[1]         // Get password part

        // Split the policy to get range and letter
        val policyParts = policy.split(" ")

        // Split the range to get min and max
        val rangeParts = policyParts[0].split("-")

        // Convert String to Int
        val minCount = rangeParts[0].toInt()
        val maxCount = rangeParts[1].toInt()

        // Get the letter
        val letter = policyParts[1].single()

        // Count how many times the letter appears in the password
        val letterCount = password.count { it == letter }

        // Check if the count is within the allowed range
        if (letterCount >= minCount && letterCount <= maxCount) {
            validCount++
        }
    }
    return validCount
}

fun validPasswordPart2() : Int {
    var validCount = 0

    for (entry in data2) {
        val parts = entry.split(": ")
        val policy = parts[0]
        val password = parts[1]

        // Split the policy to get positions and letter
        val policyParts = policy.split(" ")
        val positions = policyParts[0].split("-")

        // Convert to positions (adjusting for 1-based indexing)
        val firstPos = positions[0].toInt() - 1  // Convert to 0-based index
        val secondPos = positions[1].toInt() - 1 // Convert to 0-based index
        val letter = policyParts[1].single()

        // Check if exactly one of the positions contains the letter
        val firstMatch = firstPos < password.length && password[firstPos] == letter
        val secondMatch = secondPos < password.length && password[secondPos] == letter

        // Valid if exactly one position matches (XOR operation)
        if (firstMatch != secondMatch) {
            validCount++
        }
    }
    return validCount
}

fun main() {
    val part1Result = validPasswordPart1()
    println("Part 1 - Number of valid passwords: $part1Result")

    val part2Result = validPasswordPart2()
    println("Part 2 - Number of valid passwords: $part2Result")
}