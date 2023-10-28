package com.example.myandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Music1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music1)

        val start : FloatingActionButton = findViewById(R.id.play_button)
        start.setOnClickListener {
            play()
        }

        val stop : FloatingActionButton = findViewById(R.id.stop_button)
        stop.setOnClickListener {
            pause()
        }
    }

    fun play(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERCONSTANT,"abc").apply { startService(this) }
    }

    fun pause(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERCONSTANT,"xyz").apply { stopService(this) }

    }
}