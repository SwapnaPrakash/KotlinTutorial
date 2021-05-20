package com.example.kotlinfundamentals

/*
*   1. Arrays
* */
fun main(args: Array<String>) {

// Elements :   32  0   0   54  0
// Index    :   0   1   2   3   4

    var myArray = Array<Int>(5){0} // Mutable, fixed size
    myArray[0] = 32
    myArray[3] = 54
    println(myArray[3])

    for( a in myArray){
        println(a)
    }

    for(index in 0..myArray.size-1){
        println(myArray[index])
    }
}