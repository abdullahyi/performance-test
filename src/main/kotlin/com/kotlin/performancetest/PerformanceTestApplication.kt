package com.kotlin.performancetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2


@SpringBootApplication
@EnableSwagger2
class PerformanceTestApplication

fun main(args: Array<String>) {
    runApplication<PerformanceTestApplication>(*args)
}
