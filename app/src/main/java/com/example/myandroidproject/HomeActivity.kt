package com.example.myandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

      val losswidht:Button=findViewById(R.id.Button1)
        losswidht.setOnClickListener {
            Intent( this,loss_Wight_main::class.java).also { startActivity(it) }
        }

        val getBody : Button=findViewById(R.id.Button2)
        getBody.setOnClickListener {
            Intent(this,GetBody::class.java).also { startActivity(it) }
        }

        val music:Button=findViewById(R.id.Button3)
        music.setOnClickListener {
            Intent(this,Music_mainActivity::class.java).also { startActivity(it) }
        }

    }
}