package com.example.testkotproj.Hash

class SetZeroes {
    fun setZeroes(matrix: Array<IntArray>): Unit {

        var zeroArray:MutableList<Pair<Int, Int>> = mutableListOf();
        var rowVisited:Array<Boolean> = Array(matrix[0].size, {false});
        var colVisited:Array<Boolean> = Array(matrix.size, {false});

        for(i in 0 until matrix.size) {
            for(j in 0 until matrix[0].size) {
                if(matrix[i][j] == 0) {
                    zeroArray.add(Pair<Int, Int>(i, j));
                }
            }
        }

        for (item in zeroArray) {
            if(rowVisited[item.second] == false) {
                for(i in 0 until matrix.size) {
                    matrix[i][item.second] = 0;
                }
                rowVisited[item.second] = true;
            }

            if(colVisited[item.first] == false) {
                for(i in 0 until matrix[0].size) {
                    matrix[item.first][i] = 0;
                }
                colVisited[item.first] = true;
            }
        }
    }
}