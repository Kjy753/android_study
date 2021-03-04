package com.kjy753.first_project.Kotiln

// 12. 배열

// 배열이 필요한 이유
// -그룹(모음집)이 필요할 경우

fun main(args:Array<String>){

    // 배열을 생성하는 방법(1) -> 배열의 타입 명시
    var group1 = arrayOf<Int>(1,2,3,4,5)// int 형 배열 group1 생성

    println(group1 is Array)

    // 배열을 생성하는 방법 (2) 타입을 명시 하지 않을경우 배열의 타임 다양하게 정의 가능은 함.
    var group2 = arrayOf(1,2,3.5,4,"Hello")

    //Index 란
    // [1,2,3,4,5]
    // 0부터 시작(순서,번쨰)
    // index= 1 ->  1 index = 1 -> 2

    //배열의 값을 꺼내는 방법
    val test1  = group1.get(0)
    val test2  = group1.get(4)
    println(test1)
    println(test2)

    //배열의 값을 꺼내는 방법(2)
    val test3 = group1[0]
    println(test3)

    //배열의 값을 바꾸는 방법(1)
    group1.set(0,100) //-> (바꿀 자리, 바꿀값)
    println(group1[0])

    //배열을 바꾸는 방법 (2)
    group1[0] = 200  //-> group1 의 0번쨰 인덱스 자리를 200으로 변경



}