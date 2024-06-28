package com.example.composelabs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.composelabs.basicApp.FirstComposeApp
import com.example.composelabs.databinding.ActivityMainBinding
import com.example.composelabs.realApp.RealWorldDesign
import com.example.composelabs.state.ComposeStateActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListener()
    }

    private fun setupListener() {
        binding.btnBasicApp.setOnClickListener {
            startActivity(FirstComposeApp.newIntent(this))
        }
        binding.btnStateApp.setOnClickListener {
            startActivity(ComposeStateActivity.newIntent(this))
        }
        binding.btnRealApp.setOnClickListener {
            startActivity(RealWorldDesign.newIntent(this))
        }
    }
}