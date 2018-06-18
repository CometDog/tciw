package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class OwnerMinimal {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "login")
    var login: String? = null
}

open class Owner : OwnerMinimal() {
    @field:Json(name = "name")
    var name: String? = null

    @field:Json(name = "github_id")
    var githubId: Int = -1

    @field:Json(name = "avatar_url")
    var avatarUrl: String? = null

    @field:Json(name = "education")
    var education: Boolean? = null
}

class OwnerAdditional : Owner() {
    @field:Json(name = "repositories")
    var repositories: List<Repository>? = null

    @field:Json(name = "installation")
    var installation: Installation? = null
}