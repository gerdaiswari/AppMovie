package com.example.appmovie.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
data class Movie(
    val title: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("vote_average")
    val voteAverage: Double,
    val id: Int
)