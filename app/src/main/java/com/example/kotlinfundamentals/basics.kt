package com.example.kotlinfundamentals

import com.shreks.Person

fun main(args:Array<String>){

    var person = Person("Steve")
    //person.name = "Steve"
    person.diaplay()

    //println("The name of the person is  ${person.name}")
}

/*
class Person{
    var name : String = ""

    fun display(name:String){
        println(name)
    }
}
*/
