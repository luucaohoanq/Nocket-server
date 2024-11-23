package com.lcaohoanq.nocket.models

import java.sql.Timestamp
import java.util.UUID

data class PostReaction(
    val id: UUID,
    val postId: UUID,
    val userId: UUID,
    val reactionType: String,
    val createdAt: Timestamp
)
