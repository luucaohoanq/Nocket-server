package com.lcaohoanq.nocket.models

import com.lcaohoanq.nocket.enums.PostType
import java.time.LocalDateTime
import java.util.UUID

data class Post(
    val id: UUID,
    val userId: UUID,
    val postType: PostType,
    val caption: String?,
    val metadata: String?,
    val createdAt: LocalDateTime,
    val isArchived: Boolean,
    val viewCount: Int,
    val isProcessing: Boolean,
    val thumbnailUrl: String?,
    val duration: Float?,
    val cameraSettings: String?
)
