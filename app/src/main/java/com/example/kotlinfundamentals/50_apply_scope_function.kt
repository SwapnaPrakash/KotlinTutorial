package com.example.kotlinfundamentals

fun main() {

    /** Scope Function: 'apply'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'context object'  */

    var person = PersonApply().apply {
        age = 26
        name = "Swapna"
    }
    with(person){
        println(name)
        println(age)
    }
    /*person.age = 26
    person.name = "Swapna"*/

    person.also {
        it.name = "swapna p"
        println("New name : ${it.name}")
    }

}

class PersonApply{
    var name:String = ""
    var age:Int = 0
}