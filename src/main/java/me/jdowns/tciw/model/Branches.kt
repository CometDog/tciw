package me.jdowns.tciw.model

import com.squareup.moshi.Json

class Branches {
    @field:Json(name = "branches")
    var branches: List<BranchAdditional>? = null
}