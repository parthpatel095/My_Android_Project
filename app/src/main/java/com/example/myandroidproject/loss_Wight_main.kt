package com.example.myandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class loss_Wight_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loss_wight_main)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,LossWightHome::class.java))
            finish()
        } , 3000)
    }
}