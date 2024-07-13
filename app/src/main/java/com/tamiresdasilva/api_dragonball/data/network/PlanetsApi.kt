package com.tamiresdasilva.api_dragonball.data.network

import com.tamiresdasilva.api_dragonball.data.network.responses.ItemsResponse
import retrofit2.http.GET

//É o CharactersApi
interface PlanetsApi {
    @GET("planets")

    //é o fetchCharacters
    suspend fun fetchPlanets(): ItemsResponse
}