package com.kjy753.first_project.Kotiln

//3)TV 클래스
//        -on/off 기능
//        -채널을 돌리는 기능
//        -초기 채널은 (k,s,m)

fun main(args: Array<String>){
    val tv = TV(listOf<String>("k","m","s"))
    tv.switch()
    println(tv.onOrOff)
    tv.switch()
    println(tv.onOrOff)
    println("-------")
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())


}

class TV(val channels:List<String>){

    var onOrOff : Boolean = false
    var currentChannelNumber = 0
        set(value) { //값을 할당 하는 함수
            field = value
            //currentChannelNumber = value => 계속 벨류를 할당하게 되므로 무한루프에 빠짐.
            if(field >2){
                field = 0
            }
        }

    fun switch(){
        onOrOff = !onOrOff
    }

    fun channelUp(){
        channels.forEachIndexed{index,value ->
                currentChannelNumber = currentChannelNumber +1
        }
    }

    fun channelDown(){
        channels.forEachIndexed{index,value ->
            if(currentChannelNumber == index){ // 없어져도 상관 없음.
                currentChannelNumber = currentChannelNumber - 1
                return
            }
        }
    }

    fun checkCurrentChannel():String{
        return channels[currentChannelNumber]
    }

}