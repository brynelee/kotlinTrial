//data Class demo

data class UserData(val name: String, val age: Int)

fun demoUserData(){

    val jane = UserData("Jane", 35)
    val (name, age) = jane

    println("$name, $age years of age")

}

fun main(args: Array<String>) {

    val jack = UserData(name = "Jack", age = 1)

    println(jack)

    val olderJack = jack.copy(age = 2)

    println(olderJack)

    demoUserData()

}