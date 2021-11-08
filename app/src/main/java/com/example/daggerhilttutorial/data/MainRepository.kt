package com.example.daggerhilttutorial.data

import retrofit2.Response

interface MainRepository {
    suspend fun getAllMovies() : Response<List<Movie>>
}