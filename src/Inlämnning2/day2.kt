package Inlämnning2

import java.io.File
//How many passwords are valid according to their policies?
//1-3 a means that the password must contain a at least 1 time and at most 3 times.

val data2 : List<String> = File("src/Inlämnning2/day2Input.txt").readLines().map { it.toString()}

fun validPassword() : Int {
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

fun main() {
    val result = validPassword()
    println("Number of valid passwords: $result")
}