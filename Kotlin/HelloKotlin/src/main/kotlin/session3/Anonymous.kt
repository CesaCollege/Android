package session3

fun main() {

    val greetingFunction: (name: String, age: Int) -> String = { name, age ->
        val currentYear = 2023
        "Welcom to $currentYear _ hello $name , you are $age "
    }

    calculateAge("Parsa", 1999, ::printAge, greetingFunction)

    calculateAge("Parsa", 1999, ::printAge) { name, age ->
        val currentYear = 2023
        "Welcom to $currentYear _ hello $name , you are $age "
    }

    calculateAge(
        "Ali",
        1990,
        ::printAge
    ) { name, age ->
        val currentYear = 2023
        "Welcom to $currentYear _ hello $name , you are $age "
    }


    println("Mississippi".count())

    println("Mississippi".count { char: Char -> char == 's' })

}


fun calculateAge(
    playerName: String,
    BirthYear: Int,
    printAge: (Int) -> Unit,
    greetingFunction: (String, Int) -> String
) {
    val currentYear = 2023
    val age = currentYear - BirthYear
    println(greetingFunction(playerName, age))
    printAge(25)
}

fun printAge(age: Int): Unit {
    print("You are $age")
}

