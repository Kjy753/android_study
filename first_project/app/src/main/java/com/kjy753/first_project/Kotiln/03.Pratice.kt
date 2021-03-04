package com.kjy753.first_project.Kotiln

var a = 1+2+3+4+5 // 연산의 결과값을 변수에 넣어줄수 있다.
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "john"
var f = "My name is $e Nice to meet you"

// Null
// - 존재 하지 않는다.

//var abc : Int = null
var abc1 : Int? = null // 자료형 뒤에 ? 를 넣으면 null 가능.
fun main(args: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
}