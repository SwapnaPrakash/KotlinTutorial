package com.example.kotlinfundamentals

fun main(args:Array<String>){
    val name :String = "Sam"
    val str = "Hello $name"
    println("The statement is $str")

    var rect = Rectangle()
    rect.lenght = 20
    rect.breadth = 30

    println("The lenght of rect is ${rect.lenght} and breadth is ${rect.breadth} . Area is ${rect.lenght * rect.breadth}")

}

class Rectangle{
    var lenght : Int = 0
    var breadth : Int = 0
}