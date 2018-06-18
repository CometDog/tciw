package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Stages {
    @field:Json(name = "stages")
    var stages: List<Stage>? = null
}