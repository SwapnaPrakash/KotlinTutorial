package com.example.kotlinfundamentals

fun main(args:Array<String>){

    var myNumber = 10         //Int
    var myDecimal = 9.5       // Float

    var myString :String      // Mutable String
    myString = "Hello World"
    println(myString)

    val myAnotherString = "My constant string value"    // Immutable String
//    myAnotherString = "some value"  // NOT ALLOWED, since it is immutable

}