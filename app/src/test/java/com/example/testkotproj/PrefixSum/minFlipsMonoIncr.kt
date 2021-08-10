package com.example.testkotproj.PrefixSum

class minFlipsMonoIncr_Algo {
    fun minFlipsMonoIncr(s: String): Int {

        var oneCnt:Int = 0;
        var flip:Int = 0;
        for(i in 0 until s.length) {
            if(s[i] == '1')
                oneCnt++;
            else {
                flip++;
            }
            flip = Math.min(oneCnt, flip);
        }

        return flip;
    }
}