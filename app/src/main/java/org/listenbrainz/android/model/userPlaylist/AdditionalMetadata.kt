package org.listenbrainz.android.model.userPlaylist


import com.google.gson.annotations.SerializedName

data class AdditionalMetadata(
    @SerializedName("algorithm_metadata")
    val algorithmMetadata: AlgorithmMetadata = AlgorithmMetadata(),
    @SerializedName("expires_at")
    val expiresAt: String? = null,
)