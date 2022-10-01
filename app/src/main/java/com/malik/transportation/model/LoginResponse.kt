package com.malik.transportation.model

data class LoginResponse(
    val email: Any,
    val id: Int,
    val name: String,
    val nationalId: String,
    val password: String,
    val phone: String,
    val role: String,
    val state: String
)