package com.example.kotlinfundamentals

/*
*   1. Closures
* */
fun main(args: Array<String>) {
    var result = 0
    val program = Programs()
    program.addTwoNumbers(3,3){x,y->result = x+y}
    println(result)

}

class Programs{
    fun addTwoNumbers(a:Int, b:Int, action:(Int,Int)->Unit){
        val res = action(a,b)
        //println(res)
    }
}