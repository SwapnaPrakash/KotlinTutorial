package com.example.kotlinfundamentals

fun main(args:Array<String>){
    var str1 : String = "Hello"
    var str2 : String = "World"
    var str3 : String = "Hey"

    val str = str3.add(str1,str2)
    println(str)

    val x:Int = 6
    val y:Int = 7
    val z = x.greaterValue(7)
    println(z)
}

fun String.add(s1:String, s2:String):String{
    return this+s1+s2
}

fun Int.greaterValue(other:Int):Int{
    if(this>other)
        return this
    else
        return other
}