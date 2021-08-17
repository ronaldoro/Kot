package com.example.testkotproj.Test

import java.lang.Integer.max
import java.lang.Integer.min

class AlgorithmTest {
    fun solution(x: IntArray, y: IntArray, r: IntArray, v: IntArray): Int {
        var answer: Int = 0

        var left: Int = Int.MAX_VALUE
        var top: Int = 0
        var right: Int = 0
        var bottom: Int = Int.MAX_VALUE

        var circleSize: Int = x.size
        for(i in 0 until circleSize) {
            left = min(left, x[i] - r[i])
            top = max(top, y[i] + r[i])
            right = max(right, x[i] + r[i])
            bottom = min(bottom, y[i] - r[i])
        }

        //5000 x 100 = O(50000)
        var cnt: Int = 0
        var rNumberSize: Int = v.size
        for(i in 0 until rNumberSize step 2) {
            var rNumberX: Int = left + v[i] % (right-left)
            var rNumberY: Int = bottom + v[i+1] % (top - bottom)

            for(j in 0 until circleSize) {
                if (Math.pow(r[j].toDouble(), 2.0) >= (Math.pow((x[j] - rNumberX).toDouble(), 2.0) +
                            Math.pow((y[j] - rNumberY).toDouble(), 2.0))) {
                    cnt = cnt+1
                }
            }

        }

        answer = ((cnt.toFloat() / (rNumberSize / 2).toFloat()) * (right-left) * (top - bottom)).toInt()
        return answer
    }
}