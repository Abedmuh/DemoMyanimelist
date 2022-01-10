package com.example.demomyanimelist

import android.content.res.TypedArray
import com.example.demomyanimelist.adapter.Animation

object DataAnimation {

    private lateinit var nameList: Array<String>
    private lateinit var rankList: Array<String>
    private lateinit var airedList: Array<String>
    private lateinit var studioList: Array<String>
    private lateinit var descriptionList: Array<String>
    private lateinit var posterList: TypedArray

    private fun dataMovie(context: MovieFragment) {
        nameList = context.resources.getStringArray(R.array.movie)
        rankList = context.resources.getStringArray(R.array.movie_rank)
        airedList = context.resources.getStringArray(R.array.movie_aired)
        studioList = context.resources.getStringArray(R.array.movie_studio)
        descriptionList = context.resources.getStringArray(R.array.movie_description)
        posterList = context.resources.obtainTypedArray(R.array.movie_poster)
    }

    private fun dataTvShow(context: TvShowFragment) {
        nameList = context.resources.getStringArray(R.array.tv_show)
        rankList = context.resources.getStringArray(R.array.tv_show_rank)
        airedList = context.resources.getStringArray(R.array.tvshow_aired)
        studioList = context.resources.getStringArray(R.array.tv_show_studio)
        descriptionList = context.resources.getStringArray(R.array.tvshow_description)
        posterList = context.resources.obtainTypedArray(R.array.tvshow_poster)
    }

    fun listOfMovie(context: MovieFragment): ArrayList<Animation> {
        val listOfMovie = ArrayList<Animation>()
        dataMovie(context)

        for (position in nameList.indices) {
            val user = Animation(
                Name = nameList[position],
                poster = posterList.getResourceId(position, 0),
                rank = rankList[position],
                aired = airedList[position],
                studio = studioList[position],
                description = descriptionList[position]
            )
            listOfMovie.add(user)
        }
        return listOfMovie
    }

    fun listOfTvShow(context: TvShowFragment): ArrayList<Animation> {
        val listOfTvShow = ArrayList<Animation>()
        dataTvShow(context)

        for (position in nameList.indices) {
            val user = Animation(
                Name = nameList[position],
                poster = posterList.getResourceId(position, 0),
                rank = rankList[position],
                aired = airedList[position],
                studio = studioList[position],
                description = descriptionList[position]
            )
            listOfTvShow.add(user)
        }

        return listOfTvShow
    }
}