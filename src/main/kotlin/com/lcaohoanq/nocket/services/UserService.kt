package com.lcaohoanq.nocket.services

import com.lcaohoanq.nocket.models.User
import org.springframework.stereotype.Service

@Service
class UserService : IUserService {
    override fun getUsers(): List<User> {
        TODO("Not yet implemented")
    }

    override fun getUserById(id: String): User {
        TODO("Not yet implemented")
    }
}