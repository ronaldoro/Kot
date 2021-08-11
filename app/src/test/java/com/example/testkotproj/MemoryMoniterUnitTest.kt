package com.example.testkotproj

import com.example.testkotproj.Sort.CanReorderDoubled
import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import junit.framework.Assert.assertEquals
import org.junit.Test


class MemoryMoniterUnitTest : StringSpec() {
    val testCase_2D_Int_Array: Array<IntArray> = arrayOf(
        intArrayOf(0,0,0,0,0),
        intArrayOf(0,0,1,0,3),
        intArrayOf(0,2,5,0,1),
        intArrayOf(4,2,4,4,2),
        intArrayOf(3,5,1,3,1))

    val testCase_Int_Array: IntArray = intArrayOf(4,-2,2,-4)


    init {
        val Algo: CanReorderDoubled = CanReorderDoubled();
        "Algorithm Test" {
            Algo.canReorderDoubled(testCase_Int_Array) shouldBe true;
            Algo.canReorderDoubled(intArrayOf(-5, -2)) shouldBe false;
            Algo.canReorderDoubled(intArrayOf(2,1,2,6)) shouldBe false;
            Algo.canReorderDoubled(intArrayOf(1,2,4,16,8,4)) shouldBe false;
        }
    }
}

