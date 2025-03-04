package Ovning7


    fun renting (belopp : Int, år : Int, ränta : Int) : Int {
    return if (år == 0) belopp
    else renting (belopp + belopp * ränta/100 , år -1,ränta / 100) // ränta / 100 is %

}

    fun main(){
        println(renting(1000,5,10))
        println(renting(20000,10,15))
        println(renting(30000,5,10))



    }