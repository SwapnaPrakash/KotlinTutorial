package com.example.kotlinfundamentals

/*
*   1. 'with' function
*   2. 'apply' function
* */
fun main(args: Array<String>) {
    var persons = Persons()
    //person.age = 1

    with(persons){
        age = 27
        name = "Swapna"
    }

    persons.apply {
        age = 27
        name = "Swapna"
    }.startRun()

    println(persons.age )
    println(persons.name )

}
class Persons{
    var name : String = ""
    var age : Int = -1

    fun startRun(){
        println("I am started to run")
    }
}