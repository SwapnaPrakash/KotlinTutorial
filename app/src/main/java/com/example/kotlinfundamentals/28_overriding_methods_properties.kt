package com.example.kotlinfundamentals

/*
*   1. Method Overriding
*   2. Property Overriding
* */
fun main(args: Array<String>) {
    var dog = MyDog()
    println(dog.color)
    dog.eats()
}

open class MyAnimal{
    open var color = "white"
    open fun eats(){
        println("Animal Eating")
    }
}

class MyDog : MyAnimal(){
    var breed = ""
    fun bark(){
        println("Bark")
    }

    override var color: String = "Black"

    override fun eats(){
        super<MyAnimal>.eats()
        println("Dog Eating")
    }
}