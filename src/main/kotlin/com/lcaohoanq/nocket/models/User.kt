package com.lcaohoanq.nocket.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "users")
data class User(
    @Id val id: UUID?,
    val email: String,
    val phoneNumber: String,
    val fullName: String,
    private val passwordHash: String, // Use a private property for the password hash
    val profilePictureUrl: String?,
    val lastActive: LocalDateTime?,
    val isVerified: Boolean
) : BaseEntity(), UserDetails {
    constructor() : this(
        null,
        "",
        "",
        "",
        "",
        null,
        null,
        false
    )

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        TODO("Not yet implemented")
    }

    override fun getPassword(): String {
        TODO("Not yet implemented")
    }

    override fun getUsername(): String {
        TODO("Not yet implemented")
    }


}
