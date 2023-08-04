package session1

import java.io.File

const val MAX_EXPERIENCE : Int = 500
fun main(){

    var experiencePoints: Int  = 12
    experiencePoints += 45

    val playerName = "Amir"

    val isGameStart = true

    println(isGameStart)
    println(experiencePoints)
    println(playerName)
    println(MAX_EXPERIENCE)

    val fileContents = File("myfile.txt").takeUnless { it.isHidden }?.readText()

}