package com.example.mosiacmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mosiacmusic.databinding.ActivityMainBinding
import com.example.mosiacmusic.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}