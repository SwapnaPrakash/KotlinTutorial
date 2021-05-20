package com.example.kotlinfundamentals

fun main(args: Array<String>) {
    val country = Country()
    // country.name = "India"
    //println(country.name)
    country.setUP()
}

class Country{
    lateinit var name:String
    fun setUP(){
        name = "USA"
        println("The name of the country $name")
    }
}

// lateinit used only with mutable data type [ var ]
// lateinit used only with non-nullable data type
// lateinit values must be initialised before you use it

// If you try to access lateinit variable without initializing it then it throws UninitializedPropertyAccessException