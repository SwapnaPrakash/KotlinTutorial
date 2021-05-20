package com.example.kotlinfundamentals

fun main(args:Array<String>){
    findArea(length = 10,breath = 20)
}

fun findArea(length:Int, breath:Int, height:Int = 10){
    println("Length is $length")
    println("Breath is $breath")
    println("Height is $height")
}