package com.kotlin.performancetest.entity

import com.sun.mail.imap.protocol.ID
import org.springframework.data.redis.core.RedisHash

@RedisHash("customer",timeToLive = 10*60)
class RedisEntity (
    val id: Long,
    val name: String,
    val surName: String
)