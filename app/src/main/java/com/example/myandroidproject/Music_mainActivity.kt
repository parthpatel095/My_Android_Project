package com.example.myandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Music_mainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_main)

        val Play1 : Button =findViewById(R.id.Button1)
        Play1.setOnClickListener {
            Intent(this,Music1::class.java).also { startActivity(it) }
        }

        val Play2 : Button =findViewById(R.id.Button2)
        Play2.setOnClickListener {
            Intent(this,Music2::class.java).also { startActivity(it) }
        }

        val Play3 : Button =findViewById(R.id.Button3)
        Play3.setOnClickListener {
            Intent(this,Music3::class.java).also { startActivity(it) }
        }

        val Play4 : Button =findViewById(R.id.Button4)
        Play4.setOnClickListener {
            Intent(this,Music4::class.java).also { startActivity(it) }
        }

        val Play5 : Button =findViewById(R.id.Button5)
        Play5.setOnClickListener {
            Intent(this,Music5::class.java).also { startActivity(it) }
        }

        val Play6 : Button =findViewById(R.id.Button6)
        Play6.setOnClickListener {
            Intent(this,Music6::class.java).also { startActivity(it) }
        }
    }
}