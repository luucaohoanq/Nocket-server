package com.lcaohoanq.nocket.repositories

import com.lcaohoanq.nocket.models.User
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface UserRepository: CrudRepository<User, UUID> {

}