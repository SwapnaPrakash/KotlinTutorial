package com.example.kotlinfundamentals

fun main(args:Array<String>){
    var a = 2
    var str = when(a){
        in 1..20 -> "a is 1 in 20"
        0,1 -> "a is 0 or 1"
        2 -> "a is 2"
        else -> {
            "value is unknown"
        }
    }
    println(str)
}