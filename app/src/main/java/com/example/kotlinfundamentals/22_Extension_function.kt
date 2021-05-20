package com.example.kotlinfundamentals

fun main(args:Array<String>){
    var student = Student()
    println("the passed status : "+student.hasPassed(75))
    println("the scholar status : "+student.isScholar(75))
}

fun Student.isScholar(marks:Int):Boolean{
    return marks > 95
}

class Student{
    fun hasPassed(marks:Int):Boolean{
        return marks > 40
    }
}