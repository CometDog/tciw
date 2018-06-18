package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class StageMinimal {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "number")
    var number: Int = -1

    @field:Json(name = "name")
    var name: String? = null

    @field:Json(name = "state")
    var state: String? = null

    @field:Json(name = "started_at")
    var startedAt: String? = null

    @field:Json(name = "finished_at")
    var finishedAt: String? = null
}

class Stage : StageMinimal() {
    @field:Json(name = "jobs")
    var jobs: List<Job>? = null
}