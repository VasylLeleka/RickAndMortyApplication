package com.example.rickandmortyapplication.data.network

import android.telecom.Call
import com.example.myapp.data.model.CharacterResponse
import com.example.rickandmortyapplication.data.model.EpisodeDTO
import com.example.rickandmortyapplication.data.model.EpisodeResponse
import com.example.rickandmortyapplication.data.model.LocationResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    //запрос на получение листа всех персонажей
    @GET("character")
    fun getAllCharacters(@Query("page") page: Int): CharacterResponse

    //запрос на получение листа всех эпизодов
    @GET("episode")
    fun getAllEpisodes(@Query("page") page: Int): EpisodeResponse

    //запрос на получение листа всех локаций
    @GET("location")
    fun getAllLocations(@Query("page") page: Int): LocationResponse
}