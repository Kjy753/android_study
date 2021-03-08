package com.kjy753.first_project.Kotiln

// 18.Class
// OOP -> Object Oriented Programing (객체지향 프로그래밍)

// 객체란 뭘까?
// -> 이름이 있는 모든 것

// 절차지향 프로그래밍 문제 해결 방법
// - 코드를 위에서 부터 아래로 실행을 하면 문제가 해결된다.

// 객체지향 프로그래밍 문제 해결 방법
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다.
//  ex) 선수, 심판, 경기장, 관중 -> 축구 게임
//

// 객체를 만드는 방법
// - 설명서가 있어야 합니다

fun main(array: Array<String>) {

    //클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")
    val bigCar = Car("v8 engine", "big")
    //우리가 만든 클래스(설명서)는 자료형이 된다.
    val bigCar1: Car = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("goodengin", "big", "white")

    //인스턴스가 가지고 있는 기능을 사용하는 벙법.
    val runableCar: RunableCar = RunableCar("simple engine", "simple body")
    // RunnableCar.ride() 불가능.
    runableCar.ride()
    runableCar.navi("서울")
    runableCar.drive()


    // 인스턴스의 멤버 변수에 접근하는 방법
    val runablecar2: RunableCar2 = RunableCar2("nice engin", "second body")
    println(runablecar2.engine)
    println(runablecar2.body)

    //오버로딩
    //-> 이름이 같지만 받는 파라미터가 다른 함수
    println()
    val testclass = TestClass()
    testclass.test(1)
    testclass.test(1,2)

}

//클래스(설명서) 만드는 방법 (1)
class Car(var engine: String, var body: String) {

}

//클래스(설명서) 만드는 방법(2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

//클래스(설명서) 만드는 방법(3) -> 1번 방법의 확장
class Car1(engine: String, body: String) {
    var door: String = ""

    //생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

//클래스(설명서) 만드는 방법 (4) -> 2번 방법의 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}


class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승하였습니다.")
    }

    fun drive() {
        println("달립니다 !")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정 되었습니다.")
    }
}

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init {
        // 객체화 할떄 가장먼저 하는 함수
        // 객체가 만들어질떄 초기 셋팅에 유용한 함수 init
        println("RunableCar2 가 만들어졌습니다.")
    }

    fun ride() {
        println("탑승하였습니다.")
    }

    fun drive() {
        println("달립니다 !")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정 되었습니다.")
    }
}

// 오버로딩
//-> 이름이 같지만 받는 파라미터가 다른 함수
class TestClass() {

    fun test(a:Int) {
    println("up")
    }

    fun test(a:Int,b:Int) {
    println("down")
    }
}