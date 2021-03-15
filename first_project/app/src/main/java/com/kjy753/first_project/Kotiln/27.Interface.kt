package com.kjy753.first_project.Kotiln

// 27. Interface
// - 인터페이스는 약속
// - 생성자가 없다 -> 인스턴스화 시킬수 없다 -> 설명서가 아니다.
// - 지침서 -> 니가 이것을 구현하고 싶다면 반드시 아래 기능을 구현해라

// 상속과 다른점
// - 상속은 조상을 찾아가는 느낌
// - 인터페이스는 종의 특징
fun main(array: Array<String>){
    val student_ :Student_ = Student_()
    student_.eat()
    student_.sleep()
}

interface Person_{
    fun eat()
    fun sleep()
}

class Student_:Person_{
    override fun eat() {

    }

    override fun sleep() {

    }
}

open class Person(){
    open fun eat(){

    }
    fun sleep(){

    }
}

class Student():Person(){

    override fun eat() {
        super.eat()
    }
}

class Teacher():Person(){

}

class SoccerPaly : Person_{
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }
}