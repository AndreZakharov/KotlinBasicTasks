package module2

fun main(args: Array<String>) {
    val workPlaces:MutableMap<Int,String> = mutableMapOf(1 to "Ivanov Ivan Ivanovich",2 to "Petrov Petr Petrovich",3 to "Sidorov Sidor Sidorovich")
    while (true) {
        println(
            "You can use some words for control programm\n" +
                    "add - for adding new name and place\n" +
                    "find - get employee name by workplace number\n" +
                    "exit - exit from programm or from add function\n"
        )
        val command: String = readLine().toString()
        when (command) {
            "add" -> {
                println("enter workplace and name, to exit adding, enter: exit")
                while (true) {
                    println("enter workplace : Int")
                    val key = readLine()
                    if (key is String)
                    {
                        if (key.toString() == "exit") break
                    }
                    println("enter name : String")
                    val name = readLine()
                    if (name is String){
                        if (name.toString() == "exit") break
                    }
                    workPlaces.set(key.toString().toInt(), name.toString())
                }

            }
            "find" -> {
                println("enter workplace")
                val key = readLine()
                if (key is String){
                    if (key.toString() == "exit") break
                }
                println(workPlaces.getOrElse(key.toString().toInt()){"Not found"})
            }
            "exit"-> break
        }
    }


}