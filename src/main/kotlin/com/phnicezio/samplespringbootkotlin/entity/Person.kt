package com.phnicezio.samplespringbootkotlin.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * @author palves
 * @since 07/12/18 11:53
 * @version $Revision: $<br/>
 *          $Id: $
 *
 */
@Entity
data class Person(val name: String, val age: Int, @Id @GeneratedValue val id: Long = 0)