package com.example.demomyanimelist

import androidx.lifecycle.ViewModel
import com.example.demomyanimelist.adapter.Animation

class MovieViewModel : ViewModel() {

    var list = ArrayList<Animation>()
    var isNull = false

    fun setListData(data: List<Animation>?) {
        if (data != null) {
            list.clear()
            list.addAll(data)
            isNull = false
        } else {
            isNull = true
        }
    }
}