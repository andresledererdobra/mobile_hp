package com.example.harrypotterapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.harrypotterapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_HarryPotterApp)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
