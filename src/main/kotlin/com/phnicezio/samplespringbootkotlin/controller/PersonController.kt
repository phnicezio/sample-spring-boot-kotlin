package com.phnicezio.samplespringbootkotlin.controller

import com.phnicezio.samplespringbootkotlin.controller.request.PersonRequest
import com.phnicezio.samplespringbootkotlin.entity.Person
import com.phnicezio.samplespringbootkotlin.service.PersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * @author palves
 * @since 07/12/18 11:09
 * @version $Revision: $<br/>
 *          $Id: $
 *
 */
@RestController
@RequestMapping("/persons")
class PersonController(private val service: PersonService) {

    @GetMapping
    fun findAll() = this.service.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = this.service.findById(id)

    @PostMapping
    fun create(@Valid @RequestBody request: Person) = this.service.create(Person(request.name, request.age))

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long,
               @Valid @RequestBody request: PersonRequest): ResponseEntity<Person> {
        val person = this.service.update(Person(request.name, request.age, id))
        if (person != null)
            return ResponseEntity.ok(person)
        return ResponseEntity.notFound().build()
    }
}