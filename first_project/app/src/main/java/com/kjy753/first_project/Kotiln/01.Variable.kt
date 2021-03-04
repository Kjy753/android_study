package com.kjy753.first_project.Kotiln

// 01.Variable -> 변수
//

// 변수를 선안하는 방법
// var&val 변수명 = 값
// var = Variable 의 축약어  val = Value 의 축약어
// 내 마음대로 원하는 것을 넣을 수 있는 변수 -> Variable
// 한번 넣으면 바꿀수 없는 변수 -> Value

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20
fun main(args:Array<String>){
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4
    println(num)
    println(hello)
    println(point)

    //fix = 500 안됩니다.

}