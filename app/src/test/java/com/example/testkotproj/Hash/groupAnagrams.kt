package com.example.testkotproj.Hash

import java.lang.StringBuilder

class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var hash:HashMap<String, MutableList<String>> = HashMap<String, MutableList<String>>();

        for(i in 0 until strs.size) {

            var tempStr:StringBuilder = StringBuilder("00000000000000000000000000");
            for(j in 0 until strs[i].length) {
                var index:Int = strs[i][j].toInt() - 97;
                var tempInt = tempStr[index].toInt();
                tempInt += 1;

                tempStr.setCharAt(index, tempInt.toChar());
            }

            if(hash.containsKey(tempStr.toString()) == true) {
                hash.get(tempStr.toString())?.add(strs[i]);
            } else {
                var stringList:MutableList<String> = mutableListOf(strs[i]);
                hash.put(tempStr.toString(), stringList);
            }
        }

        var results = mutableListOf<List<String>>();
        for ((str, strList) in hash) {
            var result = mutableListOf<String>();
            for(item in strList) {
                result.add(item);
            }
            results.add(result);
        }

        return results;
    }
}