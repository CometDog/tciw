package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class OrganizationMinimal {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "login")
    var login: String? = null
}

open class Organization : OrganizationMinimal() {
    @field:Json(name = "name")
    var name: String? = null

    @field:Json(name = "github_id")
    var githubId: Int = -1

    @field:Json(name = "avatar_url")
    var avatarUrl: String? = null

    @field:Json(name = "education")
    var education: Boolean? = null
}

class OrganizationAdditional : Organization() {
    @field:Json(name = "repositories")
    var repositories: List<Repository>? = null

    @field:Json(name = "installation")
    var installation: Installation? = null
}