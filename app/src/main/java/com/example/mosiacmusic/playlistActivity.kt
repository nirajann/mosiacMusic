package com.example.mosiacmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mosiacmusic.databinding.ActivityMainBinding
import com.example.mosiacmusic.databinding.ActivityPlaylistBinding


class playlistActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlaylistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}