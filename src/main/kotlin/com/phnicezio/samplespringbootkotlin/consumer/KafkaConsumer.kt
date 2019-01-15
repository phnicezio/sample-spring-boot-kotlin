package com.phnicezio.samplespringbootkotlin.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

/**
 * @author palves
 * @since 11/01/19 16:52
 * @version $Revision: $<br/>
 *          $Id: $
 *
 */
@Component
class KafkaConsumer {

    @KafkaListener(topics = ["test"])
    fun receive(payload: String) {
        println("KafkaConsumer-receive: $payload")
    }
}