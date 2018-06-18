package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Settings {
    @field:Json(name = "settings")
    var settings: List<Setting>? = null
}