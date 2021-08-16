package com.example.testkotproj.PrefixSum

class NumArray(nums: IntArray) {

    var prefixSum: Array<Int> = Array(nums.size){ 0 }
    init {
        for(i in prefixSum.indices) {
            if(i > 0) {
                prefixSum[i] = prefixSum[i-1] + nums[i]
            } else {
                prefixSum[i] = nums[i]
            }
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        if(left > 0) {
            return prefixSum[right] - prefixSum[left-1]
        } else {
            return prefixSum[right]
        }
    }
}
