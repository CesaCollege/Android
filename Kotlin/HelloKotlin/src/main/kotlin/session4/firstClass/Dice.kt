package session4.firstClass

class Dice() {
    val rolledValue:Int
        get() {
           return (1..6).shuffled().first()
        }
}
