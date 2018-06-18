package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class LogMinimal {
    @field:Json(name = "id")
    var id: Int = -1
}

class Log : LogMinimal() {
    @field:Json(name = "content")
    var content: String? = null

    @field:Json(name = "log_parts")
    var logParts: List<String>? = null
}