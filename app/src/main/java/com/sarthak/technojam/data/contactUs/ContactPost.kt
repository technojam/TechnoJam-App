package com.sarthak.technojam.data.contactUs

import com.google.gson.annotations.SerializedName


/** The data class for the contact model which is sent as body in the POST request in [ContactService]. */
data class ContactPost(

    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("phnNo")
    val phnNo : Long,
    @SerializedName("query")
    val query : String
)
