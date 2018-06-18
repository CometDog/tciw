package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Error {
    @field:Json(name = "error_type")
    var errorType: String? = null

    @field:Json(name = "error_message")
    var errorMessage: String? = null

    @field:Json(name = "resource_type")
    var resourceType: String? = null

    @field:Json(name = "permission")
    var permission: String? = null
}