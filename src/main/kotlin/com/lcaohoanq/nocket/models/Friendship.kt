package com.lcaohoanq.nocket.models

import com.lcaohoanq.nocket.enums.FriendshipStatus
import java.time.LocalDateTime
import java.util.UUID

data class Friendship(
    val id: UUID,
    val requesterId: UUID,
    val addresseeId: UUID,
    val status: FriendshipStatus,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)
