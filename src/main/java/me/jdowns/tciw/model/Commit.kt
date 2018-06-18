package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class CommitMinimal {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "sha")
    var sha: String? = null

    @field:Json(name = "ref")
    var ref: String? = null

    @field:Json(name = "message")
    var message: String? = null

    @field:Json(name = "compare_url")
    var compareUrl: String? = null

    @field:Json(name = "committed_at")
    var committedAt: String? = null
}

class Commit : CommitMinimal() {
    @field:Json(name = "committer")
    var committer: Owner? = null

    @field:Json(name = "author")
    var author: Owner? = null
}