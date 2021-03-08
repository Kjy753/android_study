package com.kjy753.first_project.Kotiln

fun main(array: Array<String>){


    val a = mutableListOf<Int>(1,2,3)
    a.add(4)
    println(a)
    a.add(0,100)
    println(a)
    a.set(0,200) // 변경
    println(a)
    a.removeAt(1) // 인덱스 위치를 삭제
    println(a)

    val b = mutableSetOf<Int>(1,2,3,4)
    println()
    b.add(6)
    println(b)
    b.remove(2)
    println(b)
    b.remove(100) // 엘리멘트 값이 없어도 실행에 문제는 없음.
    println(b)

    val c = mutableMapOf<String,Int>("one" to 1)
    c.put("two",2)
    println(c)

    c.replace("two",3)
    println(c)
    println(c.keys) // 키 값만을 출력
    println(c.values) // 벨류 값만을 출력
    c.clear()   // map 초기화
    println(c)
}