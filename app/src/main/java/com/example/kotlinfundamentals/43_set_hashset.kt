package com.example.kotlinfundamentals

/*
*   1. Set and HashSet
* */
fun main(args: Array<String>) {

// "Set" contains unique elements
// "HashSet" also contains unique elements but sequence is not guaranteed in output
    var mySet = setOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8) //Immutable , read only
    for(elements in mySet){
        println(elements)
    }

    var mutableSetOf = mutableSetOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8) //mutable , read only
    mutableSetOf.remove(54)
    mutableSetOf.add(100)
    for(elements in mutableSetOf){
        println(elements)
    }

    var hashSetOf = hashSetOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8) //mutable , read only
}