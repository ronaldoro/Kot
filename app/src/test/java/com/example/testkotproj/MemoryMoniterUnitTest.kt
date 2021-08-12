package com.example.testkotproj

import com.example.testkotproj.Hash.GroupAnagrams
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

    var testCase_String_Array: Array<String> = arrayOf("eat","tea","tan","ate","nat","bat")
    val string2DArray: Array<Array<String>> = arrayOf(
        arrayOf("bat"),
        arrayOf("tan","nat"),
        arrayOf("eat","tea","ate")
    )

    init {
        val Algo: GroupAnagrams = GroupAnagrams();
        "Algorithm Test" {
            Algo.groupAnagrams(testCase_String_Array) shouldBe string2DArray;
        }
    }
}

