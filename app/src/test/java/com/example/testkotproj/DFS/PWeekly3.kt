package com.example.testkotproj.DFS

import java.lang.Integer.max
import java.lang.Integer.min

class PWeekly3 {
    class Rect(leftParam: Int, topParam: Int, rightParam: Int, bottomParam: Int){
        var left:Int = 0
        var top:Int = 0
        var right:Int = 0
        var bottom:Int = 0
        init {
            left = leftParam
            top = topParam
            right = rightParam
            bottom = bottomParam
        }
    }

    lateinit var puzzleVisited : Array<Array<Boolean>>
    var puzzles: Array<MutableList<Array<IntArray>>> = Array(7){ i -> mutableListOf<Array<IntArray>>()}

    private lateinit var rect: Rect

    fun rotate90degree(arr: Array<IntArray>) : Array<IntArray> {
        val n = arr.size
        val m: Int = arr[0].size
        val result = Array(n) { IntArray(n) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                result[j][n - i - 1] = arr[i][j]
            }
        }
        return result
    }

    private fun makePuzzles(table: Array<IntArray>, i: Int, j: Int, target:Int) : Int {
        if(i < 0 || i >= table.size || j < 0 || j >= table[0].size)
            return 0

        if(table[i][j] != target || puzzleVisited[i][j]) {
            return 0
        }

        rect.left = min(j, rect.left)
        rect.top = min(i, rect.top)
        rect.right = max(j, rect.right)
        rect.bottom = max(i, rect.bottom)

        puzzleVisited[i][j] = true

        return makePuzzles(table, i-1, j, target) + makePuzzles(table, i+1, j, target) + makePuzzles(table, i, j-1, target) + makePuzzles(table, i, j+1, target) + 1;
    }

    fun solution(game_board: Array<IntArray>, table: Array<IntArray>): Int {
        var answer: Int = 0

        puzzleVisited = Array(table.size) {Array(table[0].size) {false} }
        for(i in table.indices) {
            for(j in table[0].indices) {
                if(table[i][j] == 1 && !puzzleVisited[i][j]) {
                    rect = Rect(Int.MAX_VALUE,Int.MAX_VALUE,Int.MIN_VALUE,Int.MIN_VALUE)

                    var cnt = makePuzzles(table, i, j, 1)
                    var length = max(rect.bottom-rect.top, rect.right-rect.left)

                    var array:Array<IntArray> = Array<IntArray>(length+1) { IntArray(length+1, {0}) }
                    for(top in 0 .. length) {
                        for(left in 0 .. length) {
                            if(rect.top + top < table.size && rect.left + left < table[0].size) {
                                if(puzzleVisited[rect.top + top][rect.left + left] == true) {
                                    array[top][left] = 1
                                }
                            }
                        }
                    }

                    puzzles[cnt].add(array)
                }
            }
        }

        puzzleVisited = Array(table.size) {Array(table[0].size) {false} }
        for(i in game_board.indices) {
            for(j in game_board[0].indices) {
                if(game_board[i][j] == 0 && !puzzleVisited[i][j]) {
                    rect = Rect(Int.MAX_VALUE,Int.MAX_VALUE,Int.MIN_VALUE,Int.MIN_VALUE)

                    var cnt = makePuzzles(game_board, i, j, 0)
                    var length = max(rect.bottom-rect.top, rect.right-rect.left)

                    var emptySpace:Array<IntArray> = Array<IntArray>(length+1) { IntArray(length+1, {1}) }
                    for(top in 0 .. length) {
                        for(left in 0 .. length) {
                            if(rect.top + top < game_board.size && rect.left + left < game_board[0].size) {
                                if(puzzleVisited[rect.top + top][rect.left + left] == true) {
                                    emptySpace[top][left] = 0
                                }
                            }
                        }
                    }
                    //find puzzle
                    for(puzzle in puzzles[cnt]) {
                        if(emptySpace.size != puzzle.size || emptySpace[0].size != puzzle[0].size)
                            continue

                        var isOn = true
                        var puzzleItem = puzzle
                        for(rotate in 0..3) {
                            isOn = true
                            for(puzzleY in puzzle.indices) {
                                for(puzzleX in puzzle.indices) {
                                    if(emptySpace[puzzleY][puzzleX] == puzzleItem[puzzleY][puzzleX]) {
                                        isOn = false
                                        break
                                    }
                                }
                                if(!isOn)
                                    break
                            }

                            if(isOn)
                                break
                            puzzleItem = rotate90degree(puzzleItem)
                        }


                        if(isOn) {
                            puzzles[cnt].remove(puzzle)
                            answer = answer + cnt
                            break
                        }
                    }
                }
            }

        }

        return answer
    }
}