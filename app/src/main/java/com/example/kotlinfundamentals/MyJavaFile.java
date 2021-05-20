package com.example.kotlinfundamentals;

public class MyJavaFile {
    public static void main(String[] args){
        int sum = MyCustomKotlinFile.addNo(3,4);
        System.out.println("Printing sum from java files: "+sum);

        MyCustomKotlinFile.area(10,20);
        int r = MyCustomKotlinFile.area(10,20,1);
        System.out.println(r);
    }

    public static int area(int l, int b){
        return l*b;
    }
}
