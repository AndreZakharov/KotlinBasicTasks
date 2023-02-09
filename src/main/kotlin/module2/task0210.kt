package module2

fun main(args: Array<String>) {

    val cities: MutableList<String> = mutableListOf()
    while (true) {
        println(
            "You can use some words for control programm\n" +
                    "add - for adding city\n" +
                    "all - show all cities in List\n" +
                    "diff - show different cities in List\n" +
                    "exit - exit from programm or from add function"
        )
        val command: String = readLine().toString()
        when (command) {
            "add" -> {
                println("enter city/cities name to exit adding, enter: exit")
                while (true) {
                    val city: String = readLine().toString()
                    if (city == "exit") break
                    cities.add(city)
                }

            }

            "all" -> {
                cities.forEach { element -> println(element) }
                println()
            }

            "diff" -> {
                cities.distinctBy { it }.forEach { element -> println(element) }
                println()
            }

            "exit" -> break
            else -> println("wrong command, try again\n")
        }

    }
}