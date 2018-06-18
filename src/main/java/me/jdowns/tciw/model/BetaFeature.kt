package me.jdowns.tciw.model

import com.squareup.moshi.Json

class BetaFeature {
    @field:Json(name = "id")
    var id: Int = -1

    @field:Json(name = "name")
    var name: String? = null

    @field:Json(name = "description")
    var description: String? = null

    @field:Json(name = "enabled")
    var enabled: Boolean? = null

    @field:Json(name = "feedback_url")
    var feedbackUrl: String? = null
}