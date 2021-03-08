package com.kjy753.first_project.Kotiln

// 사칙 연산

fun main(array:Array<String>){
    val calculator1 = Calculator1()

    println(calculator1.plus(4,5))
    println(calculator1.minus(4,5))
    println(calculator1.mutply(4,5))
    println(calculator1.divide(4,5))

    println("---------------")

    val calculator2 = Calculator2()
    println(calculator2.plus(1,2,3,4,5))
    println(calculator2.minus(10,1,2,3))
    println(calculator2.multiply(1,2,3))
    println(calculator2.divide(10,2,3))

    println("-------------")

    val calculator3 = Calculator3(3)

    calculator3.plus(5).minus(2)


}
// 두수 간의 사칙연산만 가능
class Calculator1(){
    fun plus(a:Int, b:Int):Int{
        return a+b
    }

    fun minus(a:Int, b:Int):Int{
        //먼저 들어온 수에서 뒤에 들어온 수를 뺸다.
        return a-b
    }

    fun mutply(a:Int, b:Int):Int{
        return a*b
    }

    fun divide(a:Int, b:Int):Int{
        //먼저 들어온 수에서 뒤에 들어온 수를 나눈다.
        return a/b
    }
}
//여러 숫자의 사칙연산 가능
class Calculator2(){
    fun plus(vararg numbers:Int):Int{   // 가변인자인 varargs 를 통해 숫자를 받는다.
        var result = 0

        numbers.forEach {
            result = result + it    // 가변인자인 numbers를 foreach 문을 통해 숫자를 더한다.
        }
        return result
    }

    fun minus(vararg numbers: Int):Int{
        var result:Int = numbers[0]
        for(i in 0 until numbers.size){ // 0부터 마지막인덱스 바로 전까지
            if(i != 0){
                result = result -numbers[i]
            }

        }
        return result
    }

    fun multiply(vararg numbers:Int):Int {
        var result: Int = 1 // 0곱하기 x 는 무조건 0이기 떄문에 첫 result 값을 1로 설정
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result

    }

    fun divide(vararg numbers:Int):Int{ // 10,2,3
        var result:Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            //10,2,3
            if(index != 0){
                if(value != 0){
                    result = result / value
                }
            }

        }
        return result
    }
}

// 다른 방법
class Calculator3(val initialValue:Int){

    fun plus(number:Int):Calculator3{
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number:Int):Calculator3{
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number:Int):Calculator3{
        val result = this.initialValue * number
        return Calculator3(result)
    }
    fun divide(number:Int):Calculator3{
        val result = this.initialValue / number
        return Calculator3(result)
    }
}