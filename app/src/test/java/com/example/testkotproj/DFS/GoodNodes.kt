package com.example.testkotproj.DFS

import java.lang.Integer.max

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class GoodNodes {
    fun DFS(node: TreeNode?, curMax: Int) : Int {
        if(node == null)
            return 0

        var nodeMax = curMax
        nodeMax = max(node.`val`, curMax)

        var good = 0
        if(nodeMax <= node.`val`) {
            good = 1
        }

        return DFS(node.left, nodeMax) + DFS(node.right, nodeMax) + good
    }

    fun goodNodes(root: TreeNode?): Int {
        return DFS(root, Int.MIN_VALUE)
    }
}