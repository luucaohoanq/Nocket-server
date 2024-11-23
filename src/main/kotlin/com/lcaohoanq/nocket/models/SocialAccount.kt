package com.lcaohoanq.nocket.models

import com.lcaohoanq.nocket.enums.PlatformType
import java.time.LocalDateTime
import java.util.UUID

data class SocialAccount(
    val id: UUID,
    val userId: UUID,
    val platformType: PlatformType,
    val platformUserId: String,
    val accessToken: String,
    val refreshToken: String?,
    val tokenExpiresAt: LocalDateTime?,
    val isActive: Boolean,
    val accountMetadata: String?
)
