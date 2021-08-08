package com.example.appmovie.data.remote

import android.util.Log
import com.example.appmovie.model.Movie
import com.example.appmovie.model.MovieDetail

class MovieRemoteDataSource {

    private val apiEndpoint: ApiEndpoint = ApiRetrofit.getRetrofitInstance().create(ApiEndpoint::class.java)

    suspend fun fetchNowPlayingMovies(): Result<List<Movie>> {
        val response = apiEndpoint.fetchNowPlayingMovies()
        Log.d("Now",(response.body()?.results ?: emptyList()).toString())

        return if (response.isSuccessful) {
            Result.success(response.body()?.results ?: emptyList())
        } else {
            Result.failure(Throwable(response.message()))
        }
    }

    suspend fun fetchUpcomingMovies() : Result<List<Movie>> {
        val response = apiEndpoint.fetchUpcomingMovies()
        Log.d("Up",(response.body()).toString())

        return if(response.isSuccessful) {
            Result.success(response.body()?.results ?: emptyList())
        } else {
            Result.failure(Throwable(response.message()))
        }
    }

    suspend fun fetchPopularMovies() : Result<List<Movie>> {
        val response = apiEndpoint.fetchPopularMovies()
        Log.d("popular",(response.body()?.results ?: emptyList()).toString())

        return if(response.isSuccessful) {
            Result.success(response.body()?.results ?: emptyList())
        } else {
            Result.failure(Throwable(response.message()))
        }
    }

    suspend fun fetchTopRatedMovies() : Result<List<Movie>> {
        val response = apiEndpoint.fetchTopRatedMovies()
        Log.d("top",(response.body()?.results ?: emptyList()).toString())

        return if(response.isSuccessful) {
            Result.success(response.body()?.results ?: emptyList())
        } else {
            Result.failure(Throwable(response.message()))
        }
    }

    suspend fun searchMovies(query: String): Result<List<Movie>> {
        val response = apiEndpoint.searchMovie(query = query)

        return if (response.isSuccessful) {
            Result.success(response.body()?.results ?: emptyList())
        } else {
            Result.failure(Throwable(response.message()))
        }
    }

    suspend fun fetchDetailMovie(movieId: Int) : Result<MovieDetail> {
        val response = apiEndpoint.fetchDetailMovie(movieId = movieId)

        return if (response.isSuccessful) {
            Result.success(response.body() ?: MovieDetail())
        } else {
            Result.failure(Throwable(response.message()))
        }
    }
}