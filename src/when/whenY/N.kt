package `when`.whenY

fun main(){
    val yes = "yes"
    val no = "no"

    while(true){
        println("Please type Yes or No")
        val choice = readLine()
        when {
            choice.equals(yes, ignoreCase = true) -> {
                println("you choice Yes")
            }

            choice.equals(no, ignoreCase = true) ->
                println("you choice No")
            else -> println("please type Yes or No")
        }
    }
}