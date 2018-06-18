package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class BuildMinimal {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "number")
    var number: String? = null

    @field:Json(name = "state")
    var state: String? = null

    @field:Json(name = "duration")
    var duration: Int = -1

    @field:Json(name = "event_type")
    var eventType: String? = null

    @field:Json(name = "previous_state")
    var previousState: String? = null

    @field:Json(name = "pull_request_title")
    var pullRequestTitle: String? = null

    @field:Json(name = "pull_request_number")
    var pullRequestNumber: Int = -1

    @field:Json(name = "started_at")
    var startedAt: String? = null

    @field:Json(name = "finished_at")
    var finishedAt: String? = null

    @field:Json(name = "private")
    var private: Boolean? = null
}

open class Build : BuildMinimal() {
    @field:Json(name = "repository")
    var respository: Repository? = null

    @field:Json(name = "branch")
    var branch: Branch? = null

    @field:Json(name = "tag")
    var tag: String? = null

    @field:Json(name = "commit")
    var commit: Commit? = null

    @field:Json(name = "jobs")
    var jobs: Jobs? = null

    @field:Json(name = "stages")
    var stages: List<Stage>? = null

    @field:Json(name = "created_by")
    var owner: Owner? = null

    @field:Json(name = "updated_at")
    var updatedAt: String? = null
}

class BuildAdditional : Build() {
    @field:Json(name = "request")
    var request: Any? = null
}