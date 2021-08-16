package com.example.testkotproj.TwoPointer

class MinWindow {
    fun minWindow(s: String, t: String): String {
        val dict : MutableMap<Char, Int> = mutableMapOf<Char, Int>()

        for(i in t.indices) {
            dict[t[i]] = dict.getOrDefault(t[i], 0) + 1
        }

        var left:Int = 0
        var right:Int = 0

        val windowDict : MutableMap<Char, Int> = mutableMapOf<Char, Int>()
        var uniqueT: Int = dict.size
        var UniqueWindowEqualT : Int = 0
        var minStrIndex : Pair<Int, Int> = Pair<Int, Int>(0, Int.MAX_VALUE)

        var minCheck: Boolean = false

        while(right < s.length) {
            var rightChar = s[right]
            windowDict[rightChar] = windowDict.getOrDefault(rightChar, 0) + 1

            if(dict.contains(rightChar) && dict[rightChar] == windowDict[rightChar]) {
                UniqueWindowEqualT++
            }

            while(left <= right && uniqueT == UniqueWindowEqualT) {
                if(right - left < minStrIndex.second - minStrIndex.first) {
                    minStrIndex = Pair<Int, Int>(left, right)
                    minCheck = true
                }

                var leftStr = s[left]
                windowDict.put(leftStr, windowDict[leftStr]!! -1)
                if(dict.contains(leftStr) &&
                    windowDict.getOrDefault(leftStr, 0) < dict.getOrDefault(leftStr, 0)) {
                    UniqueWindowEqualT--
                }
                ++left
            }
            ++right
        }

        if(minCheck == false) {
            return ""
        }

        return s.substring(minStrIndex.first, minStrIndex.second+1)
    }
}