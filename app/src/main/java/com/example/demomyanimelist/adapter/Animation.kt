package com.example.demomyanimelist.adapter

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animation(
    var Name: String,
    var poster: Int,
    var rank: String,
    var aired: String,
    var studio: String,
    var description: String
): Parcelable