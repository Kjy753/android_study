package com.kjy753.first_project.Kotiln

// 16.Iterable

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법(1)
    for (item in a) {
        if (item == 5) {
            println("item is Five")

        } else {
            println("item is not five")
        }
        //println(item)
    }

    println()
    //반복하는 방법 (2) index 를 구하고 싶을떄
    for ((index, item) in a.withIndex()) {
        println("index:" + index + "value" + item)
    }
    println()
    //반복하는 방법 (3) 람다 방식
    a.forEach {
        println(it)
    }
    // 반복하는 방법 (4) // it 을 item 이라고 설정하고 하는법
    a.forEach { item ->
        println(item)
    }

    //반복하는 방법(5) index를 같이 반환하는 법 (index,it)
    a.forEachIndexed { index, item ->
        println("index:" + index + "value" + item)
    }
    println(a.size)
    println()
    //반복하는 방법 (6) 인덱스만을 출력
    for (i in 0 until a.size) {
        //unti 은 마지막 인덱스를 포함하지 않는다.
        //0부터 8까지만
        println(a.get(i))
    }
    println()
    // 반복하는 방법(7) // step 만큼 뛰어서 출력
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }
    println()
    //반복하는 방법 (8) // 역순으로 출력
    for (i in a.size - 1 downTo (0)) {
        //8부터 0까지
        println(a.get(i))
    }
    println()
    //반복하는 방법(9)
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }
    println()
    //반복하는 방법 (10)
    for (i in 0..a.size) {
        //.. 은 마지막을 포함한다
        println(i)
    }
    println()

    //반복하는 방법 (11)
    var b: Int = 0
    var c: Int = 4

    while (b < c) {
        b++
        println("b")
    }

    println()
    //반복하는 방법(12)
    var d: Int = 0
    var f: Int = 4
    do{
        println("hello")
        d++
    } while (d<f)
}