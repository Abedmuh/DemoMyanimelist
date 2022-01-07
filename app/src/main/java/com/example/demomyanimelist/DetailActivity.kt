package com.example.demomyanimelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demomyanimelist.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var detailBinding: ActivityDetailBinding? = null
    private val binding get() = detailBinding

    companion object {
        const val EXTRA_ANIMATION = "extra_animation"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}