package com.phnicezio.samplespringbootkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@EnableKafka
@SpringBootApplication
class SampleSpringBootKotlinApplication

fun main(args: Array<String>) {
    runApplication<SampleSpringBootKotlinApplication>(*args)
}
