package com.example.kotlinfundamentals

import android.os.Build
import androidx.annotation.RequiresApi


/*
*   1. Map and HashMap
* */
@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

    // Map = key-value pair

    var map = mapOf<Int,String>(2 to "Yogi", 43 to "Modi", 7 to "Manmohan")  // Immutable , fixed size, read only
    for(key in map.keys){
        //println(key)
       // println(map[key])  // map.get(key)
        println("Element at key : $key = ${map.get(key)} ")
    }

    var hashMap = HashMap<Int, String>()
    hashMap.put(2,"Yogi")
    hashMap.put(43,"Modi")
    hashMap.put(7,"Manmohan")

    hashMap.replace(43,"Vajpayee")  // you can use put
    for(element in hashMap.keys){
        println("Element at key $element : ${hashMap.get(element)}")
    }

    var mutableMapOf = mutableMapOf<Int, String>() // LinkedHashMap
    var hashMapOf = hashMapOf<Int, String>()
}