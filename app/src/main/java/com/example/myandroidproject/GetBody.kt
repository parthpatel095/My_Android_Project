package com.example.myandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetBody : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_body)

        val getBodyex : Button =findViewById(R.id.Button2)
        getBodyex.setOnClickListener {
            Intent(this,Get_body_ex::class.java).also { startActivity(it) }
        }

        val getBodydiet : Button =findViewById(R.id.Button1)
        getBodydiet.setOnClickListener {
            Intent(this,Get_Body_Diet::class.java).also { startActivity(it) }
        }
    }
}