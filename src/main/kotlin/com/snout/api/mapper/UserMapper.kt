package com.snout.api.mapper

import com.snout.api.domain.model.User
import com.snout.api.entity.UserEntity
import org.springframework.stereotype.Component

@Component
class UserMapper {

    fun toEntity(user: User) : UserEntity{
        return UserEntity(
            user.id,
            user.name,
            user.email,
            user.password,
            user.createdAt,
            user.birthDay
        )
    }

    fun toDomain(user: UserEntity): User{
        return User(
            user.id,
            user.name,
            user.email,
            user.password,
            user.createdAt,
            user.birthDay
        )
    }

}