package com.example.demomyanimelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.demomyanimelist.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var viewModel: DetailViewModel
    private var detailBinding: ActivityDetailBinding? = null
    private val binding get() = detailBinding

    companion object {
        const val EXTRA_ANIMATION = "extra_animation"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        viewModel = ViewModelProvider(this)[DetailViewModel::class.java]

        viewModel.packet = intent.getParcelableExtra(EXTRA_ANIMATION)

        detailBinding?.apply {
            rating.text = viewModel.packet?.rank
            aired.text = viewModel.packet?.aired
            studio.text = viewModel.packet?.studio
            description.text = viewModel.packet?.description
            poster.let{
                Glide.with(this@DetailActivity)
                    .load(viewModel.packet?.poster)
                    .apply(RequestOptions.circleCropTransform())
                    .into(it)
            }
        }
    }
}