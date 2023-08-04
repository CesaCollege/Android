package session4

fun main() {
    val planets: MutableSet<String> = mutableSetOf("Earth","Mercury", "Venus", "Earth", "Earth", "Earth", "Earth")
    println(planets)

    println(planets.elementAt(0))
    println(planets.size)

    val listPlantes = listOf("Mercury", "Venus", "Earth", "Earth", "Earth", "Earth").distinct()
//    val listPlantes = listOf("Mercury", "Venus", "Earth", "Earth", "Earth", "Earth").toSet().toList()

    var i = 0
    while (i < planets.size) {
        if (planets.elementAt(i) == "Venus") {
            println("Venus index is $i")
            break
        }
        i++
    }

    val numbers: MutableSet<Int> = mutableSetOf(10, 8, 4, 1, 10, 5, 4)
    numbers.add(2)
    numbers.add(7)
    numbers.add(2)
    println(numbers)

}