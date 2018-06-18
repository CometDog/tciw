package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Active {
    @field:Json(name = "builds")
    var builds: List<String>? = null
}