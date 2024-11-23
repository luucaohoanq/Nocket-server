package com.lcaohoanq.nocket.models

import java.sql.Timestamp
import java.util.*

data class ChatRoom(
    val id: UUID,
    val name: String,
    val isGroupChat: Boolean,
    val createdAt: Timestamp,
    val lastMessageAt: Timestamp?,
    val chatPictureUrl: String?
)
