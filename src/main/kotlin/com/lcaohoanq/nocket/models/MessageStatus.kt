package com.lcaohoanq.nocket.models

import java.awt.TrayIcon.MessageType
import java.sql.Timestamp
import java.util.*

data class MessageStatus(
    val id: UUID,
    val messageId: UUID,
    val userId: UUID,
    val isDelivered: Boolean,
    val isRead: Boolean,
    val deliveredAt: Timestamp?,
    val readAt: Timestamp?
)