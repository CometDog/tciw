package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class InstallationMinimal {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "github_id")
    var githubId: Int = -1
}

class Installation : InstallationMinimal() {
    @field:Json(name = "owner")
    var owner: Owner? = null
}