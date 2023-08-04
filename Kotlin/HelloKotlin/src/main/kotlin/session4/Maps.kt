package session4

fun main() {
    val classMap: MutableMap<Int, String> = mutableMapOf(
        25 to "Amir",
        Pair(50, "Mina"),
        68 to "Ali",
        68 to "Sima"
    )
    var firstPair = Pair(25, "Ali")
    firstPair = 25 to "Ali"

    println(classMap)
    println(classMap[25])
    println(classMap.getOrDefault(70,"Not Find"))
    classMap.getOrPut(70){"Akbar"}
    println(classMap)

    classMap[90] = "Sina"
    println(classMap)

    classMap[90] = "Zahra"
    println(classMap)



}