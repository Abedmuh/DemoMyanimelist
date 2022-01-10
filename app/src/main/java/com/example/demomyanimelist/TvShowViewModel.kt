package com.example.demomyanimelist

import androidx.lifecycle.ViewModel
import com.example.demomyanimelist.adapter.Animation

class TvShowViewModel : ViewModel() {

    var list = ArrayList<Animation>()

    fun setListData(data: List<Animation>?) {
        if (data != null) {
            list.clear()
            list.addAll(data)
        }
    }
}