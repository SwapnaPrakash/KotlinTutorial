package com.example.kotlinfundamentals

fun main(args: Array<String>) {

    //    var person = MyPerson()   // Not allowed. You cannot create instance of abstract class

    var person = Indian()

}

abstract  class Person{
    abstract fun eat()      // abstract properties are 'open' by default
    abstract var name :String

    open fun getHeight() {} // A 'open' function ready to be overridden
    fun goToSchool(){ } // Normal function by default Public n final }
}

class Indian : Person(){
    override var name: String = ""
    override fun eat() {

    }

}