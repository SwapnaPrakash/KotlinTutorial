package com.example.kotlinfundamentals

fun main() {

    /** Scope Function: 'run'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'  */

// 'run' is combination of 'with' and 'let'
// If you want to operate on a Nullable object and avoid NullPointerException then use 'run'

    var person : PersonRun? = null
    val age = person?.run {
        println(name)
        println(age)
        age+5
    }
    println(age)

}

class PersonRun(){
    var name:String = " Swapna P "
    var age:Int = 27
}