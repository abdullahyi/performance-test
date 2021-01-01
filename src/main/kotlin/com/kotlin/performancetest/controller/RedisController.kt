package com.kotlin.performancetest.controller

import com.kotlin.performancetest.model.RedisInsertModel
import com.kotlin.performancetest.service.RedisService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/redis")
class RedisController (private val redisService: RedisService) {
    @PostMapping("insert")
    fun insert(@RequestBody body: RedisInsertModel)
    {
        redisService.insert(body)
    }
}