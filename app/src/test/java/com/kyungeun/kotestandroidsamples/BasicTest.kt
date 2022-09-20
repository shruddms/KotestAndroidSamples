package com.kyungeun.kotestandroidsamples

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class BasicTest : StringSpec() {
    init {
        "strings.length should return size of string" {
            "hello".length shouldBe 5
        }
    }
}