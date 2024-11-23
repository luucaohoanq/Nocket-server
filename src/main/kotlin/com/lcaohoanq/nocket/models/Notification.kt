package com.lcaohoanq.nocket.models

import com.lcaohoanq.nocket.enums.NotificationType
import java.sql.Timestamp
import java.util.UUID

data class Notification(
    val id: UUID,
    val userId: UUID,
    val relatedUserId: UUID?,
    val relatedContentId: UUID?,
    val notificationType: NotificationType,
    val isRead: Boolean,
    val createdAt: Timestamp
)