package com.kjy753.first_project.Kotiln

// 10 제어흐름
// when

fun main(args: Array<String>){

    val value: Int = 3

        // value 가 ? 일떄
    when(value){
        1 ->{
            // value 가 1 일경우 실행
            println("value is 1")
        }
        2->{
            println("value is 2")
        }
        3->{
            println("value is 3")
        }
        else ->{
            println("I do not value")
        }

    }
    // if else 문으로 변경

    if(value == 1){
        println("value is 1")
    }else if(value == 2){
        println("value is 2")
    }else if(value == 3){
        println("value is 3")
    }else{
        println("I do not value")
    }

    // when 을 이용해 값을 리턴 하는 방법
    val value2 = when(value){
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)
}