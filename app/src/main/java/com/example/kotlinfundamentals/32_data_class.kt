package com.example.kotlinfundamentals

fun main(args:Array<String>){
    var user1 = User("Sam",10)
    var user2 = User("Sam",20)
    println(user1.toString())
    if(user1 == user2){
        println("Equal")
    }else{
        println("Not Equal")
    }
    var newUser = user1.copy(id=25)
    println(newUser)
}

data class User(var name:String, var id:Int)