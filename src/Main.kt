fun main(args: Array<String>){
    val ints = listOf(2,3,20,50)
    println(ints.filter { it>10 })

    val ages = listOf(10, 13, 15, 20, 45, 50, 70, 75, 80)
    println("Teenager : ${ages.filter { it>=10 && it<=20 }}")
    println("Adult : ${ages.filter { it>50 }}")

    val brands = listOf("Nestle", "BCP", "Continental", "Gloria")
    println("Bank : ${brands.filter { it == "BCP" }}")

    val myStringList = listOf("Sam","Suzzy", "George", "Kevin", "Jhon")
    val updateStringList = myStringList.filter { it.length > 4 }.sortedBy { it }
    println(updateStringList)

    //Lambda
    fun handleInteger(myInt: Int, operation: (Int) -> Unit){
        operation(myInt)
    }

    handleInteger(5, { println("My Result is ${it*10}")})
    handleInteger(5, {_-> println("My Result is 10")})

    fun printResult(myInt : Int){
        println("My result is : $myInt")
    }
    handleInteger(4, ::printResult)

    //Challenge
    val values = listOf(24,5,10,4)
    println("Sum : ${values.filter { it>5 }.sum()}")

    data class Person(val name: String, val age: Int)
    val Sam = Person("Sam", 30)
    val (name, age) = Sam
    println("$name is $age years old.")

    val names = mapOf<String, Int>("John" to 34, "Fred" to 24, "Sam" to 30, "Suzzy" to 29)
    for ((name, age) in names){
        println("$name is $age years old.")
    }


}