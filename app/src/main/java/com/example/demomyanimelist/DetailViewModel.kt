package com.example.demomyanimelist

import androidx.lifecycle.ViewModel
import com.example.demomyanimelist.adapter.Animation

class DetailViewModel: ViewModel() {

    var packet: Animation? = null
    var isNull = false

    fun setpacket(packet: Animation?) {
        if (packet != null) {
            isNull = false
        } else {
            isNull = true
        }
    }}