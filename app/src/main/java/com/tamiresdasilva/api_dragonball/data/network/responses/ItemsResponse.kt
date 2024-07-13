package com.tamiresdasilva.api_dragonball.data.network.responses

import com.google.gson.annotations.SerializedName

data class ItemsResponse(
    //results vira items
    @SerializedName("items")
    //charactersResult vira planetsItem e CharactersResponse vira PlanetsResponse
    val planetsItem: List<PlanetsResponse>
)
