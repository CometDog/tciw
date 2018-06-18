package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Broadcasts {
    @field:Json(name = "broadcasts")
    var broadcasts: List<Broadcast>? = null
}