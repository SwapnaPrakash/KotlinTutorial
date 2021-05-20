package com.example.kotlinfundamentals

/*
*   1. 'it' keyword
* */
fun main(args: Array<String>) {
    val program = Progarm()
    program.reverseAndDisplay("Hello" , {it.reversed()})

}

class Progarm{
    fun reverseAndDisplay(str:String, myFunc:(String)->String){
        var res = myFunc(str) // it.reversed() // str.reversed() // "hello".reversed()
        println(res)
    }
}