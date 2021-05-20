package com.example.kotlinfundamentals

fun main(args: Array<String>) {
    var dog = Dogs("Black"," Pug ")
    //dog.breed = " Pug "
    //dog.color = "black"
}

open class Animals{
    //var color = ""
    /*init {
        println("From Animal Init: $color")
    }*/

    var color: String = ""

    constructor(color: String) {
        this.color = color
        println("From Animal: $color")
    }
}
 class Dogs  : Animals{
     //var breed = " "
     /*init {
         println("From Dog Init: $color and $breed")
     }*/
     var breed:String = " "

     constructor(color:String,  breed:String):super(color){
         this.breed = breed
         println("From Dog: $color and $breed")
     }

 }