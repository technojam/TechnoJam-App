package com.sarthak.technojam.data.contactUs


import com.google.gson.annotations.SerializedName


/** The data class for the contact model which is received as response(array of contact model) from the GET request in [ContactService]. */
data class ContactGet(

    @SerializedName("cid")
    val cid: String,
    @SerializedName("_id")
    val _id: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("contact")
    val contact : Long,
    @SerializedName("query")
    val query : String,
    @SerializedName("__v")
    val __V: String
)
