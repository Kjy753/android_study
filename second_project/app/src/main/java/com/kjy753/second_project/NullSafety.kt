package com.kjy753.second_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafety : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number : Int = 10
        val number1 : Int? = null

        // val number3 : number? + number1

        val number3 = number1?.plus(number)
        Log.d("number","number3:" + number3)
    }

    fun plus(a:Int, b:Int?):Int{
        if(b != null) return a+b
        else return a
    }

    fun plus2(a:Int,b:Int?): Int? {
        return b?.plus(a)
    }
}