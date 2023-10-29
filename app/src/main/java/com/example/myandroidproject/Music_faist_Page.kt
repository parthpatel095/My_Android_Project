package com.example.myandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Music_faist_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_faist_page)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,Music_mainActivity::class.java))
            finish()
        } , 3000)
    }
}