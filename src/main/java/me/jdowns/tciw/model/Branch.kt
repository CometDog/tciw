package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class BranchMinimal {
    @field:Json(name = "name")
    var name: String? = null
}

open class Branch : BranchMinimal() {
    @field:Json(name = "repository")
    var repository: Repository? = null

    @field:Json(name = "default_branch")
    var defaultBranch: Boolean? = null

    @field:Json(name = "exists_on_github")
    var existsOnGithub: Boolean? = null

    @field:Json(name = "last_build")
    var lastBuild: Build? = null
}

class BranchAdditional : Branch() {
    @field:Json(name = "recent_builds")
    var recentBuilds: List<Build>? = null
}