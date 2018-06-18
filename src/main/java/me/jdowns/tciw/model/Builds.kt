package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Builds {
    @field:Json(name = "builds")
    var builds: List<BuildAdditional>? = null
}