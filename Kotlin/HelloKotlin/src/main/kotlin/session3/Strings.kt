package session3

const val BAR_NAME = "Pasra's Bar"
fun main(args: Array<String>) {
    println(BAR_NAME[BAR_NAME.length - 1])
    println(BAR_NAME.substring(0 until 5))
    println(BAR_NAME.substring(0 .. 5))

    val replaceData = BAR_NAME.replace('s','x')
    println("from replace : $replaceData")
    placeOrder("food,pizza,20.54")

    val num = 25L
    val ponit = 25.6


}


private fun placeOrder(menuData: String) {
    val data = menuData.split(',')
    val type = data[0]
    val name = data.get(1)
    val price = data[2]
    println("type : $type , name : $name , price : $price")

   var floatPrice =  price.toFloat()
    println("floatPrice : $floatPrice")

    var intPrice:Int = price.toIntOrNull() ?: -1
    println("intPrice : $intPrice")

    intPrice = floatPrice.toInt()
    println("intPrice with flot : $intPrice")

    floatPrice = intPrice.toFloat()
    println("floatPrice with int : $floatPrice")



    val indexOfApostrophe = BAR_NAME.indexOf('\'')
    val barMaster = BAR_NAME.substring(0 until indexOfApostrophe)
    println("Amir speaks with $barMaster about their order.")
}
