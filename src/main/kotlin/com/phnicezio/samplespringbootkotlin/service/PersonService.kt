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
class PersonService(val repository: PersonRepository) {

    fun findAll() = repository.findAll().toList()

    fun findById(id: Long) = repository.findById(id)

    fun create(person: Person): Person {
        return repository.save(person)
    }
}
