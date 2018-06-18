package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Crons {
    @field:Json(name = "crons")
    var crons: List<Cron>? = null
}