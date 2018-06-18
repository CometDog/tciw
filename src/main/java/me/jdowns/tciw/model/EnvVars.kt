package me.jdowns.tciw.model

import com.squareup.moshi.Json

class EnvVars {
    @field:Json(name = "env_vars")
    var envVars: List<EnvVar>? = null
}