package com.kjy753.second_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resource.*

class Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 1번 유형
        val ment = resources.getString(R.string.hello)
        Log.d("Ment","ment:"+ ment)
        // getString를 이용한 직접 접근
        val ment2 = getString(R.string.hello)
        Log.d("Ment","Ment: "+ ment2)

        val color = getColor(R.color.textview_color)
        Log.d("Ment","color :" + color)

        button.setBackgroundColor(getColor(R.color.textview_color))
    }
}