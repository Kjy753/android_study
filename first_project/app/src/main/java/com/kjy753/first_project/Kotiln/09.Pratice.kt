package com.kjy753.first_project.Kotiln

fun main(args:Array<String>){

    val a :Int? =null
    val b: Int = 10
    val c: Int = 100

    if(a == null){
        println("a is null")
    } else{
        println("a is not null")
    }

    if(b+c ==110){
        println("b plus c is 110")
    }else{
        println("b plus c is not 110")
    }

    // 엘비스 연산자
    val number:Int? = null
    val number2 = number ?: 10
    println()
    println(number2)

    val num1 = 10
    val num2 = 20
    val max = if(num1>num2){
        num1 // 5
    }else{
        num2 // 10
    }
}
