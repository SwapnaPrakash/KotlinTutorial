package com.example.kotlinfundamentals

fun add(a:Int, b:Int):Int{
    return a+b
}

fun main(args:Array<String>){
    var sum = add(10,20)
    print("Sum is $sum")
}