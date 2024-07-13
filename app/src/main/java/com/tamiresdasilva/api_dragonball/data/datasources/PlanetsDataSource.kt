package com.tamiresdasilva.api_dragonball.data.datasources

import com.tamiresdasilva.api_dragonball.data.network.PlanetsApi
import com.tamiresdasilva.api_dragonball.data.network.responses.ItemsResponse
import javax.inject.Inject


class PlanetsDataSource @Inject constructor(private val api: PlanetsApi) {
    suspend fun fetchPlanets(): ItemsResponse {
        return api.fetchPlanets()
    }
}