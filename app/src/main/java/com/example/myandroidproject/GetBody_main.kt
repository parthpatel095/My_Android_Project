package com.example.myandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button

class GetBody_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_body_main)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,GetBody::class.java))
            finish()
        } , 3000)


    }
}