package com.phnicezio.samplespringbootkotlin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc

/**
 * @author palves
 * @since 07/12/18 11:43
 * @version $Revision: $<br/>
 *          $Id: $
 *
 */
abstract class AbstractTestBase {

    @Autowired
    protected lateinit var mockMvc: MockMvc
}