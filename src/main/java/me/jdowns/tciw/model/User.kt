package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class UserMinimal {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "login")
    var login: String? = null
}

open class User {
    @field:Json(name = "name")
    var name: String? = null

    @field:Json(name = "github_id")
    var githubId: Int = -1

    @field:Json(name = "avatar_url")
    var avatarUrl: String? = null

    @field:Json(name = "education")
    var education: Boolean? = null

    @field:Json(name = "is_syncing")
    var isSyncing: Boolean? = null

    @field:Json(name = "synced_at")
    var syncedAt: String? = null
}

class UserAdditional : User() {
    @field:Json(name = "repositories")
    var repositories: List<Repository>? = null

    @field:Json(name = "installation")
    var installation: Installation? = null
}