package com.sarthak.technojam.data.login

import com.google.gson.annotations.SerializedName

/** The data class for the user model which is sent as body in the POST request in [LoginService]. */
data class LoginPost(
    @SerializedName("email")
    val emailId: String,
    @SerializedName("password")
    val password: String
)
