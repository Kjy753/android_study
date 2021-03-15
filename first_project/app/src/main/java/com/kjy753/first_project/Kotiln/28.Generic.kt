package com.kjy753.first_project.Kotiln

// 28. Generic(제너릭)
// 목적 : 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에서 컴파일시에 타입을 체크해주는 기능.
// -> 타입을 체크!
// - 제너릭은 만들기 어렵고 실제로 만들일이 거의 없기 떄문에 사용하는 방법만.

fun main(args: Array<String>){
    // 제너릭을 사용하지 않은 경우
    // 사용시 형변환을 해줘야 한다.
    val list1 = listOf(1,2,3)
    val b:String = list1[2].toString()  // toString() 같이 형변환(타입변환)을 해줘야 함.

    //제너릭을 사용하는 경우 -> 타입이 안전하다.
    val list2 = listOf<String>("a","b","c")
    val c:String = list2[2] // String 타입이라는 것을 보장받는다

    // 강한 타입을 체크 할수 있다.
    val list3 = listOf(1,2,3,4,"가","나",3.0)
    //val list4 = listOf<Int>(1,2,3,"가") // Int 형 타입만을 받기떄문에 강한 타입 체크가 가능

    // 제너릭을 사용하지 않은 경우
    val list5 = listOf(1,2,3,"가") // -> Any 모든 타입의 부모이므로 어느 타입이나 가능.

    // 부모 : any
    // 자식 : String, Int, Float


}