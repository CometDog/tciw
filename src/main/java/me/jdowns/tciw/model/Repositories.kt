package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Repositories {
    @field:Json(name = "repositories")
    var repositories: List<RepositoryAdditional>? = null
}