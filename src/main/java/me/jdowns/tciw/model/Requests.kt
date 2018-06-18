package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Requests {
    @field:Json(name = "requests")
    var requests: List<Request>? = null
}