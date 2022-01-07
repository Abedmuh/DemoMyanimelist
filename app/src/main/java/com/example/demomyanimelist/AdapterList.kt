package com.example.demomyanimelist

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.demomyanimelist.databinding.ItemListBinding

class AdapterList (private val listAnime: ArrayList<Animation>): RecyclerView.Adapter<AdapterList.ListHolder>() {
    class ListHolder (private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(anime: Animation?) {
            with(binding){
                Glide.with(itemView.context)
                    .load(anime?.poster)
                    .apply(RequestOptions().override(55, 55))
                    .into(poster)
                tvItemAnimation.text = anime?.Name
            }
            itemView.setOnClickListener{
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_ANIMATION, anime)
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