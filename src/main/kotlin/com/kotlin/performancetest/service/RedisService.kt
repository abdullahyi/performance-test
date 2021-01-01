package com.kotlin.performancetest.service

import com.kotlin.performancetest.converter.RedisDtoConverter
import com.kotlin.performancetest.model.RedisInsertModel
import com.kotlin.performancetest.repository.RedisRepository
import org.springframework.stereotype.Service

@Service
class RedisService(private val redisRepository: RedisRepository, private val redisDtoConverter: RedisDtoConverter) {
    fun insert(model: RedisInsertModel)
    {
        redisRepository.save(redisDtoConverter.fromDto(model))
    }
}