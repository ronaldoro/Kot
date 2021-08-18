package com.example.testkotproj

import com.example.testkotproj.DFS.DecodeWays
import com.example.testkotproj.DFS.GoodNodes
import com.example.testkotproj.DFS.PWeekly3
import com.example.testkotproj.DFS.TreeNode
import com.example.testkotproj.PrefixSum.NumArray
import com.example.testkotproj.Test.AlgorithmTest
import com.example.testkotproj.Test.AlgorithmTest2
import com.example.testkotproj.TwoPointer.MinWindow
import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import junit.framework.Assert.assertEquals
import org.junit.Test


class MemoryMoniterUnitTest : StringSpec() {
    val testCase_2D_Int_Array: Array<IntArray> = arrayOf(
        intArrayOf(1,1,0,0,1,0),
        intArrayOf(0,0,1,0,1,0),
        intArrayOf(0,1,1,0,0,1),
        intArrayOf(1,1,0,1,1,1),
        intArrayOf(1,0,0,0,1,0),
        intArrayOf(0,1,1,1,0,0))

    val testCase_2D_Int_Array2: Array<IntArray> = arrayOf(
        intArrayOf(1,0,0,1,1,0),
        intArrayOf(1,0,1,0,1,0),
        intArrayOf(0,1,1,0,1,1),
        intArrayOf(0,0,1,0,0,0),
        intArrayOf(1,1,0,1,1,0),
        intArrayOf(0,1,0,0,0,0))


    val testCase_Int_Array: IntArray = intArrayOf(3,1,2)

    var testCase_String_Array: Array<String> = arrayOf("김토스,20010729"
    )
    val string2DArray: Array<Array<String>> = arrayOf(
        arrayOf("1 2 3 4 5 6 7 8"),
        arrayOf("2 11"),
        arrayOf("0 11 10"),
        arrayOf("3 17 19 12 13 9 14 15 10"),
        arrayOf("20 2 21")
    )


    init {
        val Algo: DecodeWays = DecodeWays();
        "Algorithm Test" {
            Algo.numDecodings("123123") shouldBe 1;
        }

        //val Algo: PWeekly3 = PWeekly3();
        //"Algorithm Test" {
        //    Algo.solution(testCase_2D_Int_Array, testCase_2D_Int_Array2) shouldBe 4;
        //}
    }
}

