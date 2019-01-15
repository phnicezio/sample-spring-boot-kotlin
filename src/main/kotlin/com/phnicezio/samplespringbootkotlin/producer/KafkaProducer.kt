package com.phnicezio.samplespringbootkotlin.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

/**
 * @author palves
 * @since 07/12/18 14:02
 * @version $Revision: $<br/>
 *          $Id: $
 *
 */
@Component
class KafkaProducer(private val kafkaTemplate: KafkaTemplate<String, String>,
                    @Value("\${spring.kafka.topic.test}") private val topic: String) {

    fun create(request: Any) {
        val listenableFuture = this.kafkaTemplate.send(this.topic, request.toString())
        listenableFuture.addCallback(
                { result -> println("send=success, result=$result") },
                { error -> println("send=error, result=$error") })
    }
}
