package com.malik.transportation.`interface`

import com.malik.transportation.model.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
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

   @GET("admin/schools")
    fun getSchoolList(): Call<SchoolResponse>


}