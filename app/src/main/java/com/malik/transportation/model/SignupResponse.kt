package com.malik.transportation.model

data class SignupResponse(
    val email: Any,
    val id: Int,
    val name: String,
    val nationalId: Any,
    val password: String,
    val phone: String,
    val role: String,
    val state: String
)