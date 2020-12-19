package com.sarthak.technojam.data.contactUs

import com.google.gson.annotations.SerializedName


/** The data class for the success/error msg which is received as response from the POST & DELETE request in [ContactService]. */
data class ContactResponse(
    @SerializedName("msg")
    var msg: String
)
