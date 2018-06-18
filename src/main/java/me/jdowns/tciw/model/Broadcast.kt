package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class BroadcastMinimal {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "message")
    var message: String? = null

    @field:Json(name = "created_at")
    var createdAt: String? = null

    @field:Json(name = "category")
    var category: String? = null

    @field:Json(name = "active")
    var active: Boolean? = null
}

class Broadcast : BroadcastMinimal() {
    @field:Json(name = "recipient")
    var recipient: Any? = null
}