package session2

import kotlin.math.log

fun main() {

    val name: String = "Amir"
    var healthPoints = 80
    val isBlessed = true
    val isImmortal = true

    val auraVisible = (isImmortal) || (isBlessed && healthPoints > 50)

    //Aura
//    val auraStatus = if (auraVisible) "GREEN" else "RED"
    println("auraStatus : ${if (auraVisible) "GREEN" else "RED"}")

    val healthStatus = when (healthPoints) {
        in 90..99 ->  "is in excellent condition!"
        in 75..98 -> {
            if (isBlessed) {
                  "has some minor wounds but is healing quite quickly!"
            } else {
                  "has some minor wounds."
            }
        }

        in 15..74 -> name + " looks pretty hurt."
        else -> {
              "is in awful condition!"
        }
    }

    // Player status
    println("$name $healthStatus")



    // true && true -> true
    // true && false -> false
    // false && true -> false
    // false && false -> false

    // true  || true -> true
    // true  || false -> true
    // false ||  true -> true
    // false ||  false -> false


    // !false -> true
    // !true -> false
}
