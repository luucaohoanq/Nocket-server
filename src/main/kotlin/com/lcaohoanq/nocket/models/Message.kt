package com.lcaohoanq.nocket.models

import java.awt.TrayIcon.MessageType
import java.sql.Timestamp
import java.util.*

data class Message(
    val id: UUID,
    val chatRoomId: UUID,
    val senderId: UUID,
    val messageType: MessageType,
    val content: String?,
    val mediaUrl: String?,
    val isDeleted: Boolean,
    val createdAt: Timestamp,
    val editedAt: Timestamp?
)
