package session2

fun main() {
    val playerName: String = "Ali"
    var healthPoints = 80
    val isBlessed = true
    val isImmortal = true

    //aura
    val auraColor = auraColor(isImmortal, isBlessed, healthPoints)

    //health status
    // val healthStatus = formatHealthStatus(healthPoints, isBlessed, playerName)
    val healthStatus = formatHealthStatus(isBlessed = isBlessed, name =  playerName,healthPoints =  healthPoints,)

    // Player status
    printPlayerStatus(auraColor,isBlessed,playerName,healthStatus)

    castFireball()
    castFireball(5)


    performCombat()
    performCombat("Ulrich")
    performCombat("Hildr", true)


}


fun performCombat() {
    println("You see nothing to fight!")
}
fun performCombat(enemyName: String) {
    println("You begin fighting $enemyName.")
}
fun performCombat(enemyName: String, isBlessed: Boolean) {
    if (isBlessed) {
        println("You begin fighting $enemyName. You are blessed with 2X damage!")
    } else {
        println("You begin fighting $enemyName.")
    }
}



private fun castFireball(numFireballs: Int = 2) {
    println("A glass of Fireball springs into existence. (x$numFireballs)")
}


private fun printPlayerStatus(auraColor: String,
                              isBlessed: Boolean,
                              name: String,
                              HS: String) {
    println("Aura: $auraColor Blessed: ${if (isBlessed) "YES" else "NO"}")
    println("$name $HS")
}

private fun auraColor(isImmortal: Boolean, isBlessed: Boolean, HP: Int): String {
    val auraVisible = (isImmortal) || (isBlessed && HP > 50)
    return if (auraVisible) {
        "GREEN"
    } else {
        "RED"
    }
}



private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean, name: String) :String {
   val healthStatus= when (healthPoints) {
        in 90..99 -> "is in excellent condition!"
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
    return healthStatus
}

