package com.example.kotlinfundamentals

fun main(args:Array<String>){
    var largeVal = max(5,6)
    println("The greater number is $largeVal")
}

fun max(a:Int, b:Int):Int = if(a>b) {
                                    println("a is greater")
                                    a
                                    } else{
                                    println("a is greater")
                                    b
                                    }