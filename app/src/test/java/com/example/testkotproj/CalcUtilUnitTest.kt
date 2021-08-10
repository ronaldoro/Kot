package com.example.testkotproj

import io.kotlintest.matchers.numerics.shouldBeGreaterThan
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalcUtilUnitTest : StringSpec() {
    init {
        "Add Fun Unit Test " {
            val calcUtil : CalcUtil = CalcUtil()

            calcUtil.Add(10, 20) shouldBe 30
            calcUtil.Add(20, 20) shouldBe 40
            calcUtil.Add(30, 20) shouldBe 50
            calcUtil.Add(40, 20) shouldBe 60
        }
    }
}