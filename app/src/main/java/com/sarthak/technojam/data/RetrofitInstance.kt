package com.sarthak.technojam.data

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/** The base retrofit instance that will be used to to create subsequent instances of API interfaces. */
object RetrofitInstance {

    private const val BASE_URL = "https://radiant-thicket-94737.herokuapp.com"

    private val client = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    /**
     * Returns a retrofit instance after applying the [BASE_URL] and the [client].
     * It also integrates a [GsonConverterFactory] to the instance which converts Java objects to their JSON representation and vice versa.
     */
    fun getRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
    }
}
