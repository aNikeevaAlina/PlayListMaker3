package com.example.playlistmaker3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.playlistmaker2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val imageSearch = findViewById<Button>(R.id.button_search)
        imageSearch.setOnClickListener {
            val displayIntent = Intent(this, SearchMediaActivity::class.java)
            startActivity(displayIntent)
        }


        val buttonMedia = findViewById<Button>(R.id.button_media)
        buttonMedia.setOnClickListener {
            val displayIntent = Intent(this, MediaActivity::class.java)
            startActivity(displayIntent)
        }

        val buttonSetting = findViewById<Button>(R.id.button_setting)
        buttonSetting.setOnClickListener {
            val displayIntent = Intent(this, SettingsActivity::class.java)
            startActivity(displayIntent)
        }
    }
}