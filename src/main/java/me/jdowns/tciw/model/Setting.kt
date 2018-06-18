package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Setting {
    @field:Json(name = "name")
    var name: String? = null

    @field:Json(name = "value")
    var value: Int = -1
}