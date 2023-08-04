package session4.firstClass

class Player {

    var playerName: String = "ali"
        get() { return field.capitalize() }
        set(value) {  field = value.trim()  }


    fun castFireball(numFireballs: Int = 2) {
        println("A glass of Fireball springs into existence. (x$numFireballs)")
    }

}