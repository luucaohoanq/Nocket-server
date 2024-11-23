package com.lcaohoanq.nocket.services

import com.lcaohoanq.nocket.models.User

interface IUserService {
    fun getUsers(): List<User>
    fun getUserById(id: String): User
}