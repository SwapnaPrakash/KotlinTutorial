package com.example.kotlinfundamentals

/*
    EXAMPLE TWO
*   1. Lambda Expression
*   2. Higher-Order Function
* */
fun main(args: Array<String>) {
    val program = MyProgram()
    val myLambda:(Int,Int)->Int = {x:Int,y:Int -> x+y}
    //    val myLambda: (Int, Int) -> Int = { x, y -> x + y}  // Lambda Expression [ Function ]
// OR,
//    program.addTwoNumbers(2, 7, { x, y -> x + y })
// OR,
    program.addTwoNos(3,3){x, y -> x + y}
}

class MyProgram{
    fun addTwoNos(a:Int, b:Int, action:(Int,Int)->Int){   // High Level Function with Lambda as Parameter
        val res = action(a,b)
        println(res)
    }
}