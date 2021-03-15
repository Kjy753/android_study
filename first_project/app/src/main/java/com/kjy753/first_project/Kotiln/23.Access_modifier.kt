package com.kjy753.first_project.Kotiln

// 23. 접근 제어자

fun main(array:Array<String>){
     val testAccess:TestAccess = TestAccess("아무개")
        //private 로 인해 클래스 외부에서 접근 불가
//    testAccess.test()
//    println(testAccess.name)
//    testAccess.name = "아무개 투"
//    println(testAccess.name)
    testAccess.changeName("하이요")


    val reward:Reward = Reward()
    reward.rewardAmount = 2000

    val runningCar:RunningCar = RunningCar()
    runningCar.runFast()
}

class TestAccess{
    private var name:String = "홍길동"
    constructor(name:String){
    this.name = name
    }

    fun changeName(newName: String){
        this.name = newName
    }
    private fun test(){
        println("test")
    }
}

class Reward(){
    var rewardAmount: Int = 1000

}

class RunningCar(){

    fun runFast(){
        run()
    }

    private fun run(){

    }
}