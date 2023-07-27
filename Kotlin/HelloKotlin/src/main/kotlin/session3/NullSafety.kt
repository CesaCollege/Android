package session3

fun main() {
    var age: Int? = null
    var b: Boolean? = null
    age = null

    var city: String? = null


    if (city != null) {
        city = "Defualt"
        println(city!!.capitalize().count())
    } else {
        println("city is null")
    }


    println(city?.capitalize()?.count())
    println(city!!.capitalize().count())

    println(city?.count() ?: 25+45)

    var name = readLine()?.capitalize()
    println(name)

}
