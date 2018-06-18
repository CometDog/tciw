package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class RequestMinimal {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "state")
    var state: String? = null

    @field:Json(name = "result")
    var result: String? = null

    @field:Json(name = "message")
    var message: String? = null
}

class Request : RequestMinimal() {
    @field:Json(name = "repository")
    var repository: Repository? = null

    @field:Json(name = "branch_name")
    var branchName: String? = null

    @field:Json(name = "commit")
    var commit: Commit? = null

    @field:Json(name = "builds")
    var builds: List<Build>? = null

    @field:Json(name = "owner")
    var owner: Owner? = null

    @field:Json(name = "created_at")
    var createdAt: String? = null

    @field:Json(name = "event_type")
    var eventType: String? = null
}