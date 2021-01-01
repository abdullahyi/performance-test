package com.kotlin.performancetest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/performance")
class PerformanceController {
    @GetMapping("/calculate")
    fun calculate(): Long
    {
        return 4*6
    }
}