package com.malik.transportation.`interface`

import com.malik.transportation.model.Login
import com.malik.transportation.model.LoginResponse
import com.malik.transportation.model.Signup
import com.malik.transportation.model.SignupResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface APIInterface {

    @POST("user/login")

    fun login(
        @Body login: Login
    ): Call<LoginResponse>


    @POST("user/signup")
    fun signup(
        @Body signup: Signup
    ): Call<SignupResponse>


}