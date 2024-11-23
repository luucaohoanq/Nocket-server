package com.lcaohoanq.nocket.models

import com.lcaohoanq.nocket.enums.DeviceType
import java.sql.Timestamp
import java.util.UUID

data class DeviceToken(
    val id: UUID,
    val userId: UUID,
    val deviceToken: String,
    val deviceType: DeviceType,
    val lastUsed: Timestamp,
    val isActive: Boolean
)
