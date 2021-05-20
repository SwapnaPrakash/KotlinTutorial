package com.example.kotlinfundamentals

fun main(args:Array<String>){
    var students = Students("Swapna")
    println("The students got the name as ${students.names} and id is ${students.id}")
    students.names
    /*students.names = "Swapna"
    println("The students got the name as ${students.names}")*/


}
class Students (var name: String) {
    var names : String = "dummy"
    var id : Int = -1
    init{
        this.names = name
        println("The students got the name as ${name}")
    }

    constructor(n:String,id:Int):this(n){
        this.id = id
        //body of the secondary is called after the init block
    }

}