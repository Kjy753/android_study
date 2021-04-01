package com.kjy753.second_project

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_permission.*

class PermissionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)

        ask.setOnClickListener {
            val cameraPermissionCheck = ContextCompat.checkSelfPermission(
                this@PermissionActivity,
                android.Manifest.permission.CAMERA
            )

            if(cameraPermissionCheck != PackageManager.PERMISSION_GRANTED){
                //없는 경우
                Log.d("permissionss","권한이 이미 있음")
                ActivityCompat.requestPermissions(
                    this, arrayOf(android.Manifest.permission.CAMERA),1000
                )
            }else{
                //있는경우
                Log.d("permissionss","권한이 이미 있음")
            }
        }
        }




    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 1000){
           if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
               // 승낙
               Log.d("permissionss","권한 승낙")
           }else{
               // 거부
               Log.d("permissionss","권한 거부")
           }
        }
    }
}