package com.snout.api.controller.user.dto

import java.util.Date

data class LoginUserRequestDto(val token: String, val name: String, val email: String, val password: String,val birthDay: Date)
