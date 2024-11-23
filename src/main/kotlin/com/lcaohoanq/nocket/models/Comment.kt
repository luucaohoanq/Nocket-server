package com.lcaohoanq.nocket.models

import java.sql.Timestamp
import java.util.UUID

data class Comment(
    val id: UUID,
    val postId: UUID,
    val userId: UUID,
    val content: String,
    val createdAt: Timestamp
)