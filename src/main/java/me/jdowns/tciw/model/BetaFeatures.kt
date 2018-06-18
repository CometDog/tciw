package me.jdowns.tciw.model

import com.squareup.moshi.Json

class BetaFeatures {
    @field:Json(name = "beta_features")
    var betaFeatures: List<BetaFeature>? = null
}