package com.example.kotlinfundamentals

/**
 *  PREDICATES
 * */
fun main(args: Array<String>) {
    val myNumbers = listOf(2, 3, 4, 6, 23, 90)

    val myPredicactes = {num:Int -> num>10}

    var check1 = myNumbers.all { num -> num > 10 } // Are all elements greater than 10?
    println(check1)

    var check2 = myNumbers.any { num -> num > 10 } // Does any of these elements satisfy the predicate?
    println(check2)

    var check3 = myNumbers.count{ num -> num > 10 } // Number of elements that satify the predicate.
    println(check3)

    var check4 = myNumbers.find { num -> num > 10 }  // Returns the first number that matches the predicate
    println(check4)
}