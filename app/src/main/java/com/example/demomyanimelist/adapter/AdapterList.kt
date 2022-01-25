package com.example.demomyanimelist.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.demomyanimelist.DetailActivity
import com.example.demomyanimelist.DetailActivity.Companion.EXTRA_ANIMATION
import com.example.demomyanimelist.databinding.ItemListBinding

class AdapterList (private val listAnime: ArrayList<Animation>): RecyclerView.Adapter<AdapterList.ListHolder>() {
    class ListHolder (private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(anime: Animation?) {
            with(binding){
                Glide.with(itemView.context)
                    .load(anime?.poster)
                    .into(poster)
                tvItemAnimation.text = anime?.Name
            }
            itemView.setOnClickListener{
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(EXTRA_ANIMATION, anime)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ListHolder(binding)
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(listAnime[position])
    }

    override fun getItemCount(): Int = listAnime.size
}