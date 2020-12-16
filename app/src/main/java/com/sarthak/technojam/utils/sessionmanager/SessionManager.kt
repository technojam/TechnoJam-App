package com.sarthak.technojam.utils.sessionmanager

import android.content.Context
import android.content.SharedPreferences
import com.sarthak.technojam.R

/** The session manager which will be used to save and fetch data from [SharedPreferences]. */
class SessionManager(context: Context) {
    private var sharedPreferences: SharedPreferences =
        context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)

    companion object{
        const val USER_TOKEN = "user_token"
    }

    /** Saves the auth [token] and the [FIRST_LOGIN] switch-value in the [sharedPreferences]. */
    fun saveAuthToken(token: String){
        val editor = sharedPreferences.edit()
        editor.putString(USER_TOKEN, token)
        editor.apply()
    }

    /** Fetches the auth token from the [sharedPreferences]. */
    fun fetchAuthToken(): String? = sharedPreferences.getString(USER_TOKEN, null)
}
