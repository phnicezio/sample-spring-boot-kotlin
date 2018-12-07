package com.phnicezio.samplespringbootkotlin.controller.request

import javax.validation.constraints.NotNull

/**
 * @author palves
 * @since 07/12/18 13:33
 * @version $Revision: $<br/>
 *          $Id: $
 *
 */
data class PersonRequest(@field:NotNull val name: String, val age: Int)