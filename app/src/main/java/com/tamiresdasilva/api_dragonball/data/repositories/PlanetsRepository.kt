package com.tamiresdasilva.api_dragonball.data.repositories

import com.tamiresdasilva.api_dragonball.data.Planets
import com.tamiresdasilva.api_dragonball.data.datasources.PlanetsDataSource
import com.tamiresdasilva.api_dragonball.data.network.responses.toModel
import javax.inject.Inject

class PlanetsRepository @Inject constructor(private val planetsDataSource: PlanetsDataSource) {
    suspend fun fetchPlanets(): List<Planets> {
        return planetsDataSource
            .fetchPlanets()
            .planetsItem.map { item -> item.toModel() }
    }
}