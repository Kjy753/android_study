package com.kjy753.first_project.Kotiln

// 08. 제어 흐름
// -if, else


fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10
//  if/else 를 사용 하는 방법 (1)
/*
    println("1번 순서")
//      0
    if (a > b) {
//      1
        println("a가b보다 크다")
    } else {
//      2
        println("a가b보다 작다")
    }
    println("3번 순서")
//      3
*/

//  if/else를 사용하는 방법(2)
    if (a > b) {
        println("a가b보다 크다")
    }
    // if 는 else 없이 혼자 사용 가능

//  if/else if / else 사용 하는 방법 (3)
    if (a > b) {
        println("a가b보다 크다")
    } else if (a < b){
        println("a가b보다 작다")
    }else{
        println("a와b는 같다")
    }

    // 값을 리턴하는 if 사용 법

    val max = if(a>b){
        a // 5
    }else{
        b // 10
    }

    println()
    println(max)
}