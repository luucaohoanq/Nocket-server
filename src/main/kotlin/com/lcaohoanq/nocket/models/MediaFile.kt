package com.lcaohoanq.nocket.models

import com.lcaohoanq.nocket.enums.MediaType
import java.time.LocalDateTime
import java.util.UUID

data class MediaFile(
    val id: UUID,
    val postId: UUID,
    val mediaType: MediaType,
    val fileUrl: String,
    val originalFileName: String?,
    val fileSize: Long,
    val mimeType: String,
    val processingStatus: String?,
    val metadata: String?,
    val uploadedAt: LocalDateTime
)

