package com.tamiresdasilva.api_dragonball.data.network

import com.tamiresdasilva.api_dragonball.data.network.responses.ItemsResponse
import retrofit2.http.GET

interface PlanetsApi {
    @GET("planets")

    suspend fun fetchPlanets(): ItemsResponse
}