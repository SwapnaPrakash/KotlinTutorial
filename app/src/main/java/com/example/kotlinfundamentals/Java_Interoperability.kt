@file:JvmName("MyCustomKotlinFile")
package com.example.kotlinfundamentals

fun main(args:Array<String>){
    var area = MyJavaFile.area(10,20)
    println("Printing area from kotlin : $area")
    
    var areas = area(10,20)
    println("The area is $areas")
}

fun addNo(a:Int, b:Int):Int{
    return a+b
}

@JvmOverloads
fun area(l:Int, b:Int, h:Int =10):Int{
    return l*b*h
}

/*
public class JavaInteroperabilityKt{
    public static void main(String[] args){

    }

    public static int addNo(int a, int b){
        return a+b;
    }
 }

 */