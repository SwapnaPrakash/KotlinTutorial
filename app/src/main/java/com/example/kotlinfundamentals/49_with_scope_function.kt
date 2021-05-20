package com.example.kotlinfundamentals

fun main() {

    /** Scope Function: 'with'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'  */

    var person = PersonWith()
    println(person.name)

    val bio:String = with(person){
        println(this.name)
        println(this.age)
        age+5
        "He is a freak who loves to teach in his own way" // will be returned and stored in 'bio' String variable
    }

   // println("Age after 5 years is $ageAfterFiveYears")
    println("bio is $bio")

}

class PersonWith(){
    var name:String = "Swapna"
    var age:Int = 27
}