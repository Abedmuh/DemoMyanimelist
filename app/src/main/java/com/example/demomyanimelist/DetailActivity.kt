package com.example.demomyanimelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.demomyanimelist.adapter.Animation
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
        val packetDetail = viewModel.packet

        viewModel.setpacket(packetDetail)
        viewModel.isNull = packetDetail == null
        setView(viewModel.isNull,packetDetail)
    }

    private fun setView(isNull: Boolean, packet: Animation?) {
        if (!isNull){
            binding?.apply {
                supportActionBar?.apply {
                    setDisplayHomeAsUpEnabled(true)
                    title =packet?.Name
                    elevation = 0f
                }
            }
            detailBinding?.apply {
                rating.text = packet?.rank
                aired.text = packet?.aired
                studio.text = packet?.studio
                description.text = packet?.description
                poster.let{
                    Glide.with(this@DetailActivity)
                        .load(packet?.poster)
                        .apply(RequestOptions.fitCenterTransform())
                        .into(it)
                }
            }
        } else {
            detailBinding?.apply {
                rating.visibility = View.INVISIBLE
                aired.visibility = View.INVISIBLE
                studio.visibility = View.INVISIBLE
                description.visibility = View.INVISIBLE
                poster.visibility = View.INVISIBLE
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}