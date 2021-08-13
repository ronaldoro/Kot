package com.example.testkotproj

import com.example.testkotproj.Hash.GroupAnagrams
import com.example.testkotproj.Hash.SetZeroes
import com.example.testkotproj.Sort.CanReorderDoubled
import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import junit.framework.Assert.assertEquals
import org.junit.Test


class MemoryMoniterUnitTest : StringSpec() {
    val testCase_2D_Int_Array: Array<IntArray> = arrayOf(
        intArrayOf(0,1,2,0),
        intArrayOf(3,4,5,2),
        intArrayOf(1,3,1,5))

    val testCase_Int_Array: IntArray = intArrayOf(4,-2,2,-4)

    var testCase_String_Array: Array<String> = arrayOf("eat","tea","tan","ate","nat","bat")
    val string2DArray: Array<Array<String>> = arrayOf(
        arrayOf("bat"),
        arrayOf("tan","nat"),
        arrayOf("eat","tea","ate")
    )

    init {
        val Algo: SetZeroes = SetZeroes();
        "Algorithm Test" {
            Algo.setZeroes(testCase_2D_Int_Array) shouldBe string2DArray;
        }
    }
}

