package com.tamiresdasilva.api_dragonball.data.network.responses

import com.google.gson.annotations.SerializedName
import com.tamiresdasilva.api_dragonball.data.Planets

data class PlanetsResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("image")
    val image: String
)

fun PlanetsResponse.toModel() = Planets(
    name = this.name, description = this.description, image = this.image
)
