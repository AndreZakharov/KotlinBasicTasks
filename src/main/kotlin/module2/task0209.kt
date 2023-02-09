package module2

import java.util.Arrays

fun main (args:Array<String>) {
    val table:Array<Array<String>> = Array(3,{Array(3,{""})})
    table[0] = arrayOf("Austria","USA","England")
    table[1] = arrayOf("Vienna","Washington","London")
    table[2] = arrayOf("EUR","USD","GBR")
    var i=0
    while (i<table.size) {
        for (j in 0..2) {
            print(table[j][i] + " ")
        }
        println()
        i++
    }

}