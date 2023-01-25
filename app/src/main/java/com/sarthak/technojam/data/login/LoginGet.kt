package com.sarthak.technojam.data.login

import com.google.gson.annotations.SerializedName

/** The data class for the user model which is received as response from the GET request in [LoginService]. */
data class LoginGet(
    @SerializedName("date")
    val date: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("isVerified")
    val isVerified: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("profileImg")
    val profileImg: String,
    @SerializedName("registeredEvents")
    val registeredEvents: List<Any>,
    @SerializedName("role")
    val role: String,
    @SerializedName("uid")
    val uid: String,
    @SerializedName("__v")
    val v: Int
)
// 2 test comment
// comment