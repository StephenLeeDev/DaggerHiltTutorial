package com.example.daggerhilttutorial.data

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("movielist.json")
    suspend fun getAllMovies() : Response<List<Movie>>
}