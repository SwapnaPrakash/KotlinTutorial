package com.example.kotlinfundamentals

fun main(args:Array<String>){


    val x:Int = 6
    val y:Int = 7
    val z = x greaterValues y
    println(z)
}

infix fun Int.greaterValues(other:Int):Int{ // infix func also extension funx
    if(this>other)
        return this
    else
        return other
}