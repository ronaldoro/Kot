package com.example.testkotproj.DFS

import kotlin.math.max

class DecodeWays {
    private lateinit var dp: Array<Int>

    fun numDecodings(s: String): Int {
        dp = Array(s.length+1){ 0 }
        dp[s.length] = 1
        for(i in s.length-1 downTo 0) {
            if(s[i] != '0') {
                dp[i] = dp[i+1]
                if(i < s.length-1 && (s[i] == '1' || s[i] == '2' && s[i+1] < '7')) {
                    dp[i] = dp[i] + dp[i+2]
                }
            }
        }

        return dp[0]
    }
}