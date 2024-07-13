package com.tamiresdasilva.api_dragonball.data.network.responses

import com.google.gson.annotations.SerializedName

data class ItemsResponse(
    @SerializedName("items")
    val planetsItem: List<PlanetsResponse>
)
