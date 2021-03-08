package com.kjy753.first_project.Kotiln

//14.Collection
// -> list,set,map

// List

fun main(args:Array<String>){
    //Immutable Collection (병경 불가능한 컬렉션)
    //List -> 중복을 허용
    val numberList = listOf<Int>(1,2,3)
    println(numberList)
    val a = numberList.get(0)
    println(a)
    println(numberList[2])
    // Set(집합)
    // -> 중복을 허용하지 않음
    // -> 순서가 없다.
    val numberSet = setOf<Int>(1,2,3,3,3,3)
    println(numberSet)

    println()
    numberSet.forEach {
        println(it)
    }

    //Map ->Key,value 방식으로 관리한다
    val numberMap = mapOf<String,Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))

    // Mutable Collection(변경가능 컬렉션)

    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println()
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String,Int>("one" to 1)
    mNumberMap.put("two",2)
    println()
    println(mNumberMap)


}