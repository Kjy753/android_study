package com.kjy753.second_project

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        // SharedPreference 선언
        val sharedPreference = getSharedPreferences("sp1",Context.MODE_PRIVATE)

        // SharedPreference 값 저장
        val editor : SharedPreferences.Editor = sharedPreference.edit()
        editor.putString("hello","안녕하세요")
        editor.commit()

        button.setOnClickListener {
            // SharedPreference 사용
            val sharedPreference = getSharedPreferences("sp1",Context.MODE_PRIVATE)

            val value = sharedPreference.getString("hello","nondata")

            Log.d("key-value",value.toString())
        }

        load_btn.setOnClickListener {
            // SharedPreference 불러오기
            val sharedPreference = getSharedPreferences("sp1",Context.MODE_PRIVATE)

            val value1 = sharedPreference.getString("hello1","nondata")
            val value2 = sharedPreference.getString("goodbye","nondata")

            Log.d("key-value",value1.toString())
            Log.d("key-value",value2.toString())
        }

        save_btn.setOnClickListener {
            val editor:SharedPreferences.Editor = sharedPreference.edit()
            editor.putString("hello1","안녕하세요")
            editor.putString("goodbye","안녕히가세요")
            editor.commit()
        }

        delete_btn.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1",Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.remove("hello1")
            editor.commit()
        }

        delete_all_btn.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1",Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.clear()
            editor.commit()
        }




    }
}