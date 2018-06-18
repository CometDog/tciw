package me.jdowns.tciw.model

import com.squareup.moshi.Json

open class EnvVarMinimal {
    @field:Json(name = "id")
    var id: String? = null

    @field:Json(name = "name")
    var name: String? = null

    @field:Json(name = "public")
    var public: Boolean? = null
}

class EnvVar : EnvVarMinimal() {
    @field:Json(name = "value")
    var value: String? = null
}