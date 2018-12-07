package com.phnicezio.samplespringbootkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleSpringBootKotlinApplication

fun main(args: Array<String>) {
    runApplication<SampleSpringBootKotlinApplication>(*args)
}
