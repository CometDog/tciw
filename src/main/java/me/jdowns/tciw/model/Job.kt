package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class JobMinimal {
    @field:Json(name = "id")
    var id: Int = -1
}

open class Job : JobMinimal() {
    @field:Json(name = "allow_failure")
    var allowFailure: Boolean? = null

    @field:Json(name = "number")
    var number: String? = null

    @field:Json(name = "state")
    var state: String? = null

    @field:Json(name = "started_at")
    var startedAt: String? = null

    @field:Json(name = "finished_at")
    var finishedAt: String? = null

    @field:Json(name = "build")
    var build: Build? = null

    @field:Json(name = "queue")
    var queue: String? = null

    @field:Json(name = "repository")
    var repository: Repository? = null

    @field:Json(name = "commit")
    var commit: Commit? = null

    @field:Json(name = "owner")
    var owner: Owner? = null

    @field:Json(name = "stage")
    var stage: List<Stage>? = null

    @field:Json(name = "created_at")
    var createdAt: String? = null

    @field:Json(name = "updated_at")
    var updatedAt: String? = null

    @field:Json(name = "private")
    var private: Boolean? = null
}

class JobAdditional {
    @field:Json(name = "config")
    var config: String? = null
}