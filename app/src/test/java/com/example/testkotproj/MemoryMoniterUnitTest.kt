package com.example.testkotproj

import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import junit.framework.Assert.assertEquals
import org.junit.Test

class MemoryMoniterUnitTest : StringSpec() {

    init {
        "is Memory Alloc Test" {
            "hello".length shouldBe 5
            "hello".length shouldBe 7

            //val memoryMoniter = MemoryMoniter()

            //memoryMoniter.isAlloc(1024) shouldBe true
        }
    }

}

