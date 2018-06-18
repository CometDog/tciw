package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Organizations {
    @field:Json(name = "organizations")
    var organizations: List<OrganizationAdditional>? = null
}