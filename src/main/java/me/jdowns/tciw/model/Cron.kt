package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class CronMinimal {
    @field:Json(name = "id")
    var id: Int = -1
}

class Cron : CronMinimal() {
    @field:Json(name = "repository")
    var repository: Repository? = null

    @field:Json(name = "branch")
    var branch: Branch? = null

    @field:Json(name = "interval")
    var interval: String? = null

    @field:Json(name = "dont_run_if_recent_build_exists")
    var dontRunIfRecentBuildExists: Boolean? = null

    @field:Json(name = "last_run")
    var lastRun: String? = null

    @field:Json(name = "next_run")
    var nextRun: String? = null

    @field:Json(name = "created_at")
    var createdAt: String? = null

    @field:Json(name = "active")
    var active: Any? = null
}