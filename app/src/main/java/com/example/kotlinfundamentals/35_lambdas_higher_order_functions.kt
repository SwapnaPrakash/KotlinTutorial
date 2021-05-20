package com.example.kotlinfundamentals
/*
    EXAMPLE ONE
*   1. Lambda Expression
*   2. Higher-Order Function
* */
fun main(args:Array<String>){
    val program = Program()
    program.addTwoNumbers(2,3)
    program.addTwoNumbers(2,3,object :MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val test:String = "Hello"
    var myLambda:(Int)->Unit = {s:Int -> println(s)}  // Lambda Expression [ Function ]
    program.addTwoNumbers(2,2,myLambda)
}

class Program{
    fun addTwoNumbers(a:Int, b:Int){
        val sum = a+b
       // println(sum)
    }

    fun addTwoNumbers(a:Int, b:Int, action:MyInterface) {  // Using Interface / Object Oriented Way
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a:Int, b:Int, action: (Int)->Unit){  // High Level Function with Lambda as Parameter
        val sum = a+b
        action(sum)
        // println(sum)
    }
}

interface MyInterface{
    fun execute(sum:Int)
}