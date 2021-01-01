package com.kotlin.performancetest.converter

import com.kotlin.performancetest.entity.RedisEntity
import com.kotlin.performancetest.model.RedisInsertModel
import org.springframework.stereotype.Component

@Component
class RedisDtoConverter {
    fun fromDto(model: RedisInsertModel): RedisEntity {
        return RedisEntity(model.id,model.name,model.surName)
    }
}