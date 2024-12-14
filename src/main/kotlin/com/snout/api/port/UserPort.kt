package com.snout.api.port

import com.snout.api.controller.user.dto.LoginUserRequestDto
import java.time.Instant
import java.util.Date

interface UserPort {

    fun newUser(name: String, email: String, password: String, birthDay: Date)
    fun loginUser(email: String, password: String): String
    fun delUser(userId: String)
    fun updateUserData(name: String, email: String, password: String): LoginUserRequestDto

}