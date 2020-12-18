package com.sarthak.technojam.data.contactUs


import retrofit2.Response
import retrofit2.http.*

interface ContactService {

    /** Uses the token as the header and returns array of contactModel. */
    @GET("/api/contact")
    suspend fun getContact(@Header("x-auth-token") token: String): Response<List<ContactGet>>

    /** Takes in [contactPost] as the body and returns a success/error msg in form of [ContactResponse]. */
    @POST("/api/contact")
    suspend fun postContact(@Body contactPost: ContactPost): Response<ContactResponse>

    /** Uses the token as the header and returns a success/error msg in form of [ContactResponse]. */
    @DELETE("/api/contact")
    suspend fun delContact(@Header ("x-auth-token") token : String): Response<ContactResponse>
}
