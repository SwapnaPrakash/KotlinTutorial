package com.example.kotlinfundamentals

fun main(args:Array<String>){
    // Ranges
    val r1 = 1..5
    //This ranges contains the number 1 2 3 4 5

    val r2 = 5 downTo 1
    // This ranges contains the number 5 4 3 2 1

    val r3 = 5 downTo 1 step 2
    // This ranges contains the number 5 3 1

    var r4 = 'a'..'z'
    // This range contains the values from "a", "b", "c" . . . "z"

    var isPrent = 'a' in r4

    val countDown = 5.downTo(1)
    // This ranges contains the number 5 4 3 2 1

    val moveon = 1.rangeTo(5)
    //This ranges contains the number 1 2 3 4 5
}