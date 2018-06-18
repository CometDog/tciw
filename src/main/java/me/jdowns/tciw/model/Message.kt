package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Message {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "level")
    var level: String? = null

    @field:Json(name = "key")
    var key: String? = null

    @field:Json(name = "code")
    var code: String? = null

    @field:Json(name = "args")
    var args: String? = null
}