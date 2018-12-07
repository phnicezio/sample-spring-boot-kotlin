package com.phnicezio.samplespringbootkotlin.controller

import com.phnicezio.samplespringbootkotlin.controller.request.PersonRequest
import com.phnicezio.samplespringbootkotlin.entity.Person
import com.phnicezio.samplespringbootkotlin.service.PersonService
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
class PersonController(val service: PersonService) {

    @GetMapping
    fun findAll() = service.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = service.findById(id)

    @PostMapping
    fun create(@Valid @RequestBody request: PersonRequest) = service.create(Person(request.name, request.age))

}