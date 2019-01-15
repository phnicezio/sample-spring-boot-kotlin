package com.phnicezio.samplespringbootkotlin.service

import com.phnicezio.samplespringbootkotlin.entity.Person
import com.phnicezio.samplespringbootkotlin.repository.PersonRepository
import org.springframework.stereotype.Service

/**
 * @author palves
 * @since 07/12/18 14:02
 * @version $Revision: $<br/>
 *          $Id: $
 *
 */
@Service
class PersonService(private val repository: PersonRepository,
                    private val kafkaProducer: KafkaProducer) {

    fun findAll() = this.repository.findAll().toList()

    fun findById(id: Long) = this.repository.findById(id)

    fun create(person: Person): Person {
        val personSaved = this.repository.save(person)
        this.kafkaProducer.create(personSaved)
        return personSaved
    }

    fun update(person: Person): Person {
        if (this.repository.existsById(person.id)) return this.repository.save(person)
        throw Exception("Person is not found by id: " + person.id)
    }
}
