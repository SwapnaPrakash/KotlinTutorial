package com.example.kotlinfundamentals

fun main() {

    /** Scope Function: 'also'              'ALSO PERFORM THE FOLLOWING EXTRA OPERATION'
    Property 1: Refer to context object by using 'it'
    Property 2: The return value is the 'context object'  */

    // Initialise numbersList
    val numbersList:MutableList<Int> = mutableListOf(1,2,3)

// Some other code... may be a function call or program to swap numbers (doesn't matter what code)

// Operations on the 'numbersList'

    val dupliacteNumbers = numbersList.also {
        println("The list elements are : $numbersList")

        it.add(4)
        println("The list elements after adding 4 are : $numbersList")

        it.remove(2)
        println("The list elements after removing 2 are : $numbersList")
    }

    println("Originaal number $numbersList")
    println("Duplicate number $dupliacteNumbers")

}