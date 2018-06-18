package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Messages {
    @field:Json(name = "messages")
    var messages: List<Message>? = null
}