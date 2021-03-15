package com.kjy753.first_project.Kotiln

//25. 상속
// 부모로부터 설명서를 물려 받는다.
fun main(args:Array<String>){
    val superCar1:SuperCar1 = SuperCar1()
    superCar1.drive()
    superCar1.stop()

    val bus1:Bus1 = Bus1()
    //bus1.drive()

}
// 부모 : SubCar
open class SubCar(){
    open fun drive(){
        println("달린다")
    }
    fun stop(){

    }
}

class SuperCar1():SubCar(){
    override fun drive() {
        println("더 빨리 달립니다")
        //super.drive()
    }
}

class Bus1():SubCar(){

}