package com.lcaohoanq.nocket.models

import com.lcaohoanq.nocket.enums.PlatformType
import com.lcaohoanq.nocket.enums.ShareStatus
import java.sql.Timestamp
import java.time.LocalDateTime
import java.util.UUID


data class PostShare(
    val id: UUID,
    val postId: UUID,
    val userId: UUID,
    val platform: PlatformType,
    val externalPostId: String?,
    val sharedAt: LocalDateTime,
    val shareStatus: ShareStatus,
    val shareUrl: String?,
    val responseMetadata: String?
)