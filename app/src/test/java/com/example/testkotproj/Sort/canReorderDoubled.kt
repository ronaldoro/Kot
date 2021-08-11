package com.example.testkotproj.Sort

import arrow.core.some

class CanReorderDoubled {
    fun canReorderDoubled(arr: IntArray): Boolean {
        var sortedArr = arr.toMutableList()
        sortedArr.sort();
        val size: Int = arr.size;

        while(sortedArr.size > 0) {
            val value = sortedArr[0];
            val multiplyPair = Pair<Int, Int>(sortedArr.indexOf(sortedArr[0] * 2 ), sortedArr[0] * 2);
            var divisionPair: Pair<Int, Int> = Pair<Int, Int>(-1,-1);

            if(sortedArr[0] % 2 == 0)
                divisionPair = Pair<Int, Int>(sortedArr.indexOf(sortedArr[0] / 2 ), sortedArr[0] / 2);

            if(multiplyPair.first == -1 && divisionPair.first == -1)
                return false;

            sortedArr.remove(value);
            if(divisionPair.first == -1)
                sortedArr.remove(multiplyPair.second);
            else
                sortedArr.remove(divisionPair.second);
        }

        return true;
    }
}