package com.example.kotlinfundamentals

fun main(args:Array<String>){
    val a = 2
    val b = 5
    var maxValue:Int = if(a>b){
         a
    }else{
         b
    }
    println(maxValue)
}