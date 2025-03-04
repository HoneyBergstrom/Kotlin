package Ovning1

    fun evenNumember() {
        for (i in 20 downTo 2 step 2)
            if (i % 2 == 0) // check if the number is even
                println("$i is even")
    }

    fun multipleNumber(table : Int,start : Int, stop:Int) {
        for (i in start..stop) {
            println(table * i)
        }
    }

fun isThisPrime(primeCandidate : Int): Boolean {
    if (primeCandidate < 2)

        return false
    for (i in 2..primeCandidate / 2) {
        if (primeCandidate % i == 0)
            return false
    }
    return true
}

fun main() {
    evenNumember()
    multipleNumber(13, 2, 10)
    println(isThisPrime(5))
}




