package com.kjy753.first_project.Kotiln

import android.icu.number.IntegerWidth

//1. List를 두개 만든다.
// 첫번째 list 에는 0부터 9까지의 값을 넣는다.( 반복문 사용)
// 두번쨰 list 에는 첫번째 list의 값을 하나씩 확인한후
// 짝수면 True 홀무녀 False 를 넣어준다.


fun main(array: Array<String>) {
    first()
    println(second(50))
    println(third(52))
    gugudan()

}

fun first() {
    val list1 = MutableList(9, { 0 })
    val list2 = MutableList(9, { true })

    for (i in 0..8) {
        list1[i] = i + 1
        if (list1[i] % 2 == 0) {
            list2.set(i, true)
        } else {
            list2.set(i, false)
        }
    }
    println(list1)
    println(list2)

}

fun second(score:Int):String{


    when(score){
        in 80..90 ->{
            return "A"
        }
        in 70..79 ->{
            return "B"
        }
        in 60..69 ->{
            return "C"
        }
        else ->{
            return "F"
        }

    }
}

fun third(number:Int):Int{
    /*
    val text = number.toString().toCharArray()
    println("-----------")
    val sum1 = text.get(0).toString().toInt()
    val sum2 = text.get(1).toString().toInt()
    println(sum1 + sum2)
    println("-----------")
    */
    val a:Int = number / 10
    val b:Int = number % 10

    return a + b
}

fun gugudan(){
    for(x in 1..9){
        for(y in 1..9){
            println("$x x $y = ${x*y}")
        }
    }
}