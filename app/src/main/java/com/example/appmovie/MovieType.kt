package com.example.appmovie

enum class MovieType(val value: String, val id: Int) {
    NOW_PLAYING("Now Playing", 1),
    UPCOMING("Upcoming", 2),
    POPULAR("Popular", 3),
    TOP_RATED("Top Rated", 4)
}