package com.kjy753.first_project.Kotiln

fun main(args: Array<String>){

    val array = arrayOf<Int>(1,2,3)

    // get, set
    val number = array.get(0)
    println(number)
//    val number1 = array.get(100) // 인덱스에 주의 해야 한다.

    array.set(0,100)
    val number2 = array.get(0)
    println(number2)

//    array.set(100.100)

    //array 의 Bounds(범위)
    // - 처음 만들떄 결정 된다.

    //Array 를 만드는 방법(3)
    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('b','c') // char ->'', string -> ""
    val a3 = doubleArrayOf(1.2,100.345)
    val a4 = booleanArrayOf(true,false,true)

    //Array를 만드는 방법(4)  -> {0} lambda 를 활용한 방법
    var a5 = Array(10,{ 0 })
    var a6 = Array(5,{1;2;3;4;5})



}