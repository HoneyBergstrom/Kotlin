package `when`
fun main(){
    while(true){
        val choice = readLine()!!.toInt()
        when(choice){
            1,3,5,7,9 -> println("เลขขี่")
            2,4,6,8 -> println("เลขคู่")
            else -> println("what is that")
        }
    }

}