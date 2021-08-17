package com.example.testkotproj

import com.example.testkotproj.DFS.GoodNodes
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
    //val testCase_2D_Int_Array: Array<String> = arrayOf(
    //    intArrayOf(0,1,2,0),
    //    intArrayOf(3,4,5,2),
    //    intArrayOf(1,3,1,5))

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
        var root : TreeNode = TreeNode(3)
        var node1 : TreeNode = TreeNode(1)
        var node2 : TreeNode = TreeNode(4)

        root.left = node1
        root.right = node2

        var node3 : TreeNode = TreeNode(3)
        var node4 : TreeNode = TreeNode(1)
        var node5 : TreeNode = TreeNode(5)

        node1.left = node3
        node2.left = node4
        node2.right = node5

        val Algo: GoodNodes = GoodNodes();
        "Algorithm Test" {
            Algo.goodNodes(root) shouldBe 4;
        }
    }
}

