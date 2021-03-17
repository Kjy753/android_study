package com.kjy753.second_project

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_test1.*
import kotlin.math.log

class OpenInternet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)



        result.setOnClickListener {
            var text = inputUrl.text.toString()

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(text))
            startActivity(intent)
            Log.d("intent",text)
        }


    }
}