package Ovning4
class animal (val sort : String, val totalLegs : Int) {
//    fun printAll() {
//        println("sort : $sort totalLegs : $totalLegs")}

    fun animalSort(){}
    fun totalLegs(){}
    fun allInfoOfOneAnimal(){}
}
 fun main () {

     var dog = animal("dog",4)
     var kangaroo = animal("kangaroo", 3)
     var bird = animal("bird", 2)
     var owls = animal("owl", 2)
     var flamningo  = animal("flamningo", 1)
     var starfish = animal("starfish", 0)
     var octopus = animal("octopus", 8)

        //List Animal in their own group
     var landAnimal = listOf(dog,kangaroo,flamningo)
     var flyAnimal = listOf(bird,owls)
     var seaAnimal = listOf(starfish,octopus)


     //Give k and V into Map
     val forEachAnimal = mapOf(
         "dog" to 1,
         "kangaroo" to 2,
         "bird" to 3,
         "owl" to 4,
         "flamningo" to 5,
         "starfish" to 6,
         "octopus" to 7)

     for ((key,value) in forEachAnimal)
         println("$key = $value")

     val group = mapOf("landAnimal" to 101,
         "flyAnimal" to 102,
         "seaAnimal" to 103)



     for ((key,value) in group)
         println("$key = $value")


     // print all from ListOf
     landAnimal.forEach{e -> println(e.sort)}
     flyAnimal.forEach{e -> println(e.sort)}
     seaAnimal.forEach{e -> println(e.sort)}

 }
