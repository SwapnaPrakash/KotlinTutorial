package com.example.kotlinfundamentals

/*
*   1. List and ArrayList
* */
fun main(args: Array<String>) {
    var list = listOf<String>("Yogi","Vajpayee") // ImMutable, fixed size, read only

    for(element in list){
        println(element)
    }
    for(index in 0..list.size-1){
        println(list.get(index)) // list[index]
    }
    println()

    var mutablelist = mutableListOf<String>() // Mutable, fixed size, read and write
    mutablelist.add("Monmohan") // 0
    mutablelist.add("Yogi")     // 1
    mutablelist.add("Vajpayee") // 2

    mutablelist.remove("Monmohan")
    mutablelist.add(1,"Modi")
    mutablelist[2] = "Indira"

    for(element in mutablelist){
        println(element)
    }

    var arrayListOf = arrayListOf<String>() // Mutable, fixed size, read and write
    var arrayList = ArrayList<String>() // Mutable, fixed size, read and write

}