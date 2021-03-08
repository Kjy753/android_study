package com.kjy753.first_project.Kotiln

//(2) 은행계좌 만들기
//    -계좌 생성 기능(이름,생년 월일, 초기금액)
//    -잔고를 확인하는 기능
//    -출금 기능
//    -예금 기능


fun main(array:Array<String>){
    val account : Account = Account("고진영","1995/02/06",1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(1500))
    println(account.checkBalance())
}


class Account{

    val name:String
    val birth:String
    var balance: Int

    constructor(name: String,birth:String,balance:Int) {
        this.name = name
        this.birth = birth
        if(balance >= 0) {
            this.balance = balance
        }else{
            this.balance = 0
        }
    }

    fun checkBalance():Int{
        return balance
    }

    fun withdraw(amount:Int):Boolean{
        if(balance >= amount ){
            balance = balance - amount
            return true
        } else{
            return false
        }
    }

    fun save(amount: Int){
        balance += amount
    }
}


