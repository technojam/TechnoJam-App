package com.sarthak.technojam.data.login

import com.google.gson.annotations.SerializedName

/** The data class for the token which is received as response from the POST request in [LoginService]. */
data class LoginResponse(
    @SerializedName("token")
    var token: String
)
