package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Caches {
    @field:Json(name = "branch")
    var branch: String? = null

    @field:Json(name = "match")
    var match: String? = null
}