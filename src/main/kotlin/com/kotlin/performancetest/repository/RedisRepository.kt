package com.kotlin.performancetest.repository

import com.kotlin.performancetest.entity.RedisEntity
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
@EnableRedisRepositories
interface RedisRepository : CrudRepository<RedisEntity,Long>