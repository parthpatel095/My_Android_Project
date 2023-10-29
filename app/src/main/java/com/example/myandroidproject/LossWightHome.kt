package com.example.myandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LossWightHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loss_wight_home)

        val dite: Button =findViewById(R.id.Button1)
        dite.setOnClickListener {
            Intent( this,loss_wight_diet::class.java).also { startActivity(it) }
        }

        val exasice: Button =findViewById(R.id.Button2)
        exasice.setOnClickListener {
            Intent(this, loss_wight_ex::class.java).also { startActivity(it) }
        }

        val register: Button =findViewById(R.id.Button3)
        register.setOnClickListener {
            Intent(this, Ragister_from::class.java).also { startActivity(it) }
        }
    }
}