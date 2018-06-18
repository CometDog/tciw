package me.jdowns.tciw.model

import com.squareup.moshi.Json

class KeyPair {
    @field:Json(name = "description")
    var description: String? = null

    @field:Json(name = "public_key")
    var publicKey: String? = null

    @field:Json(name = "fingerprint")
    var fingerprint: String? = null
}