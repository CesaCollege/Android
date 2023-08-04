package session4

import java.io.File
val filePath = "src\\main\\kotlin\\session4\\testText.txt"

fun main() {
    //------------------------------------------------------------------apply
    val textFile : File = File(filePath)

    textFile.apply {
        setWritable(true)   // file.setWritable(true)
        setReadable(true)       // file.setReadable(true)
        setExecutable(false) //    file.setExecutable(false)
    }

    //------------------------------------------------------------------let

    var numbers:List<Int>? = listOf(6,2,3,4)
//    val firstElement = numbers.first()
//    println(firstElement * firstElement)

    val powerFirstElement = numbers?.let {
        if (it[1] == 5){
            5
        }else{
            10
        }
    }
//------------------------------------------------------------------ run

    textFile.run { this.readText() }
        .run (::nameIsLong)
        .run ( ::println )

    run {
        val x = 25
        kotlin.io.println(x - 45)
    }
//------------------------------------------------------------------ with

    val withString = with(textFile.readText()) {
        length >=20
    }
    println(withString)


//------------------------------------------------------------------ also

    var fileContents: List<String>
    File(filePath)
        .also {
            print(it.name)
        }.also {
            fileContents = it.readLines()
        }
    println(fileContents)
//------------------------------------------------------------------ takeIf

    val textFileIf:String? = textFile.takeIf { it.canRead() && it.canWrite() }?.readText()
//    val textFileUnless:String? = textFile.takeIf { !it.isHidden }?.readText()
    val textFileUnless:String? = textFile.takeUnless { it.isHidden }?.readText()
    println("take if : $textFileIf")
    println("take if : $textFileUnless")
}


fun nameIsLong(name: String) = name.length >= 20


fun formatGreeting(vipGuest: String?): String {

    return vipGuest?.let {
        "Welcome, $it. Please, go straight back - your table is ready."
    } ?: "Welcome to the tavern. You'll be seated shortly."

//    return if (vipGuest != null) {
//        "Welcome, $vipGuest. Please, go straight back - your table is ready."
//    } else {
//        "Welcome to the tavern. You'll be seated shortly."
//    }
}
