package com.example.mosiacmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mosiacmusic.databinding.ActivityFavoriteBinding
import com.example.mosiacmusic.databinding.ActivityMainBinding

class FavoriteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}