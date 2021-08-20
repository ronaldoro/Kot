package com.example.testkotproj.BackTracking

class IsValidSudoku {
    fun solveSudoku(board: Array<CharArray>): Unit {
        dfs(0, board)
    }

    fun dfs(pos: Int, board: Array<CharArray>): Boolean {
        if (pos == 81) {
            return true  // we fill the board
        }
        val x = pos / 9
        val y = pos % 9
        if (board[x][y] == '.') {
            for (c in '1'..'9') {
                board[x][y] = c
                if (isValidSudoku(board, x, y) && dfs(pos+1, board)) {
                    return true
                }
                board[x][y] = '.'
            }
        } else {
            return dfs(pos+1, board)
        }
        return false
    }

    fun isValidSudoku(board: Array<CharArray>, x: Int, y: Int): Boolean {
        val c = board[x][y]
        val xx = x / 3 * 3
        val yy = y / 3 * 3  // (xx, yy) start of this block
        for (i in 0..8) {
            if (i != x && board[i][y] == c) return false
            if (i != y && board[x][i] == c) return false
            val tx = i / 3
            val ty = i % 3
            if (xx+tx != x && yy+ty != y && board[xx+tx][yy+ty] == c) {
                return false
            }
        }
        return true
    }
}