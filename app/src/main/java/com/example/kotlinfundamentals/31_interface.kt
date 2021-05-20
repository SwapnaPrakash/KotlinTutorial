package com.example.kotlinfundamentals

fun main(){
    var myBut = Button()
    myBut.onClick()
    myBut.onTouch()
}

interface MyInterfaceListener {  // You cannot create the instance of interface
    //var name:String
    fun onTouch()  // Methods in interface are abstract by default
    {
        println("MyInterfaceListener: onTouch")
    }
    fun onClick(){          // Normal methods are public and open by default but NOT FINAL
        println("MyInterfaceListener: onClick")
    }
}

interface MySecondInterface {
     // You cannot create the instance of interface
       // var name:String
         fun onTouch()  // Methods in interface are abstract by default
     {
         println("MySecondInterfaceListener: onTouch")
     }
        fun onClick(){          // Normal methods are public and open by default but NOT FINAL
            println("MySecondInterfaceListener: onClick")
        }
    }

class Button : MyInterfaceListener, MySecondInterface{

  //  override var name: String = "dummy name"

    override fun onTouch() {
        println("Button was Touched")
    }

    override fun onClick() {
        super<MyInterfaceListener>.onClick()
        println("Button was Clicked")
    }

}