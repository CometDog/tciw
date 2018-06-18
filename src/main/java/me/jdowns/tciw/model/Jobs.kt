package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Jobs {
    @field:Json(name = "jobs")
    var jobs: List<JobAdditional>? = null
}