package com.example.kotlinfundamentals

/** FILTER
 * Returns a list containing only elements matching the given [predicate]
 * */

/** MAP
 * Returns a list containing the results of applying the given [transform] function
 * to each element in the original collection
 * */

fun main(args: Array<String>) {
    val myNumbers : List<Int> = listOf(2, 3, 4, 6, 23, 90)
    /*val mySmallNumber = myNumbers.filter{it<10}    // { v -> v < 10 }
    for(element in mySmallNumber){
        println(element)
    }

    val squaredNo = myNumbers.map { num-> num*num }
    for(element in squaredNo){
        println(element)
    }*/

    val mySmallSquaredNo = myNumbers.filter {  it<10 }.map { num-> num*num   }
    for(element in mySmallSquaredNo){
        println(element)
    }

    var person = listOf<PersonList>(PersonList(10,"swapna"),PersonList(20,"pavan"))
    var names = person.filter { personList -> personList.name.startsWith("s")   }.map { it.name }
    for(name in names)
        println(name)
}

class PersonList(var age:Int, var name:String){

}