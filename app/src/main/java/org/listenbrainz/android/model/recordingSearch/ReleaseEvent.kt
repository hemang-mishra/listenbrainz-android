package org.listenbrainz.android.model.recordingSearch


import com.google.gson.annotations.SerializedName

data class ReleaseEvent(
    @SerializedName("area")
    val area: Area? = null,
    @SerializedName("date")
    val date: String? = null
)