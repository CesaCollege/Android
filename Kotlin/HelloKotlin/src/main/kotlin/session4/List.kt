package session4

fun main() {

    val classList : MutableList<String> = mutableListOf("AlI","Mina","Amir")

    println(classList.first())
    println(classList.last())
    println(classList.get(1))
    println(classList[1])

    println(classList.getOrElse(3) { "Eroor" })
    val element4: String? = classList.getOrNull(3)
    println(element4)

//    println(classList[3])

    if (classList.contains("Parsa")){
        println("Yes, he is in class")
    }else{
        println("No")
    }

    if (classList.containsAll(listOf("Mina","Ali"))){
        println("Yes, they are in class")
    }else{
        println("No")
    }

    classList.add(0,"Zhra")
    println(classList)
    val removeReturn = classList.remove("Amir")
    println(classList)

    classList[0] = "Zahra"
    println(classList)

    val aliIndex = classList.indexOf("AlI")
    classList[aliIndex] = "Ali"
    println(classList)


    if ("Ali" in classList){
        println("Yes Ali is in class")
    }

    for (student in classList){
        println("Hello $student")
    }

    classList.forEach {
        println("Hello from for each $it")
    }

    classList.forEachIndexed {index,element->
        println("Hello from for each $element. You're index is $index")
    }

    for (i in 1 .. 10){
        print("$i , ")
    }


}