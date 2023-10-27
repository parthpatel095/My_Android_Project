package com.example.myandroidproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class loss_wight_ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loss_wight_ex)

        val myVideoview1: VideoView = findViewById(R.id.video)
        val mediaController1 = MediaController(this)
        val uri1: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myVideoview1.setMediaController(mediaController1)
        mediaController1.setAnchorView(myVideoview1)
        myVideoview1.setVideoURI(uri1)
        myVideoview1.requestFocus()
        myVideoview1.start()

        val myVideoview2: VideoView = findViewById(R.id.video2)
        val mediaController2 = MediaController(this)
        val uri2: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myVideoview2.setMediaController(mediaController2)
        mediaController2.setAnchorView(myVideoview2)
        myVideoview2.setVideoURI(uri2)
        myVideoview2.requestFocus()
        myVideoview2.start()

        val myVideoview3: VideoView = findViewById(R.id.video3)
        val mediaController3 = MediaController(this)
        val uri3: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myVideoview3.setMediaController(mediaController3)
        mediaController3.setAnchorView(myVideoview3)
        myVideoview3.setVideoURI(uri3)
        myVideoview3.requestFocus()
        myVideoview3.start()


    }
}