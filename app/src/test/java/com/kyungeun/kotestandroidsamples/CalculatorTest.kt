package com.kyungeun.kotestandroidsamples

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {
    private var calculator: Calculator? = null
    @Before
    @Throws(Exception::class)
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAdd() {
        assertEquals(3, calculator!!.add(1, 2))
    }

    @Test
    fun subTest() {
        assertEquals(-1, calculator!!.sub(1, 2))
    }
}
