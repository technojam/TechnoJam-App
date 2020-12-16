package com.sarthak.technojam.data.login

import retrofit2.Response
import retrofit2.http.*

/**
 * Interface for all API calls related to the login screen.
 *
 * The API structure is as follows:
 * 1. The POST request is made using the email and password. It returns a token.
 * 2. The token in the POST request is then used as a header in the GET request, which returns the user details.
 * It must be noted that the POST request will only return the token if the account has been verified.
 */
interface LoginService {

    /** Uses the token as the header and logs in to the system. */
    @GET("/api/login")
    suspend fun getLogin(@Header("x-auth-token") token: String): Response<LoginGet>

    /** Takes in [loginPost] as the body and returns a token in form of [LoginResponse]. */
    @POST("/api/login")
    suspend fun postLogin(@Body loginPost: LoginPost): Response<LoginResponse>
}
