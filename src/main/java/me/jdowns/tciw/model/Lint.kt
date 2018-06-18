package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Lint {
    @field:Json(name = "warnings")
    var warnings: List<String>? = null
}