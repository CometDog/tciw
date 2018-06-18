package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class RepositoryMinimal {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "name")
    var name: String? = null

    @field:Json(name = "slug")
    var slug: String? = null
}

open class Repository : RepositoryMinimal() {
    @field:Json(name = "description")
    var description: String? = null

    @field:Json(name = "github_id")
    var githubId: Int = -1

    @field:Json(name = "github_language")
    var githubLanguage: String? = null

    @field:Json(name = "active")
    var active: Boolean? = null

    @field:Json(name = "private")
    var private: Boolean? = null

    @field:Json(name = "owner")
    var owner: Owner? = null

    @field:Json(name = "default_branch")
    var defaultBranch: Branch? = null

    @field:Json(name = "starred")
    var starred: Boolean? = null

    @field:Json(name = "managed_by_installation")
    var managedByInstallation: Boolean? = null

    @field:Json(name = "active_on_org")
    var activeOnOrg: Boolean? = null
}

class RepositoryAdditional : Repository() {
    @field:Json(name = "current_build")
    var currentBuild: Build? = null

    @field:Json(name = "last_started_build")
    var lastStartedBuild: Build? = null

    @field:Json(name = "next_build_number")
    var nextBuildNumber: Any? = null
}