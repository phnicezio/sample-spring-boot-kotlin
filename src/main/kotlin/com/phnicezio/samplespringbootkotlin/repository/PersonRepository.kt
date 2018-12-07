package com.phnicezio.samplespringbootkotlin.repository

import com.phnicezio.samplespringbootkotlin.entity.Person
import org.springframework.data.repository.CrudRepository

/**
 * @author palves
 * @since 07/12/18 12:03
 * @version $Revision: $<br/>
 *          $Id: $
 *
 */
interface PersonRepository : CrudRepository<Person, Long>