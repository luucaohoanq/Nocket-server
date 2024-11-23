package com.lcaohoanq.nocket.models

import com.lcaohoanq.nocket.enums.Role
import java.sql.Timestamp
import java.util.UUID

data class ChatParticipant(
    val id: UUID,
    val chatRoomId: UUID,
    val userId: UUID,
    val role: Role,
    val joinedAt: Timestamp,
    val lastReadAt: Timestamp?,
    val isMuted: Boolean
)

