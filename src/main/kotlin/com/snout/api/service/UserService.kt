package com.snout.api.service

import com.snout.api.controller.user.dto.LoginUserRequestDto
import com.snout.api.domain.exception.NewUserUnnContentException
import com.snout.api.port.UserPort
import java.util.*

class UserService: UserPort {

    override fun newUser(name: String, email: String, password: String, birthDay: Date) {
        if(name.isEmpty() || email.isEmpty() || password.isEmpty() || birthDay == null){
            throw NewUserUnnContentException("Todos os campos devem estar preenchidos para o registro do usuario")
        }
        if(birthDay == Date()){

        }

    }

    override fun loginUser(email: String, password: String): String {
        TODO("Not yet implemented")
    }

    override fun delUser(userId: String) {
        TODO("Not yet implemented")
    }

    override fun updateUserData(name: String, email: String, password: String): LoginUserRequestDto {
        TODO("Not yet implemented")
    }
}