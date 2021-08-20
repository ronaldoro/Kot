package com.example.testkotproj

import com.example.testkotproj.BackTracking.IsValidSudoku
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec


class MemoryMoniterUnitTest : StringSpec() {
    val testCase_2D_Int_Array: Array<IntArray> = arrayOf(
        intArrayOf(0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0),
        intArrayOf(1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0),
        intArrayOf(1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1),
        intArrayOf(0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0),
        intArrayOf(0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1),
        intArrayOf(0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0),
        intArrayOf(0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0),
        intArrayOf(1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0),
        intArrayOf(0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0),
        intArrayOf(0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1),
        intArrayOf(0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0))

    val testCase_2D_Int_Array2: Array<IntArray> = arrayOf(
        intArrayOf(1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1),
        intArrayOf(1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1),
        intArrayOf(1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0),
        intArrayOf(0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0),
        intArrayOf(1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0),
        intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0),
        intArrayOf(1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1),
        intArrayOf(1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1),
        intArrayOf(0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1),
        intArrayOf(1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1),
        intArrayOf(1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1),
        intArrayOf(1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1))

    val testCase_Int_Array: IntArray = intArrayOf(3,1,2)

    var testCase_String_Array: Array<String> = arrayOf("김토스,20010729"
    )

    var test: Array<CharArray> = arrayOf(
        charArrayOf('.', '8', '7', '6' ,'5' ,'4' ,'3' ,'2' , '1'),
        charArrayOf('2', '.', '.', '.' ,'.' ,'.' ,'.' ,'.' , '.'),
        charArrayOf('3', '.', '.', '.' ,'.' ,'.' ,'.' ,'.' , '.'),
        charArrayOf('4', '.', '.', '.' ,'.' ,'.' ,'.' ,'.' , '.'),
        charArrayOf('5', '.', '.', '.' ,'.' ,'.' ,'.' ,'.' , '.'),
        charArrayOf('6', '.', '.', '.' ,'.' ,'.' ,'.' ,'.' , '.'),
        charArrayOf('7', '.', '.', '.' ,'.' ,'.' ,'.' ,'.' , '.'),
        charArrayOf('8', '.', '.', '.' ,'.' ,'.' ,'.' ,'.' , '.'),
        charArrayOf('9', '.', '.', '.' ,'.' ,'.' ,'.' ,'.' , '.'));

    val string2DArray: Array<Array<String>> = arrayOf(
        arrayOf("1 2 3 4 5 6 7 8"),
        arrayOf("2 11"),
        arrayOf("0 11 10"),
        arrayOf("3 17 19 12 13 9 14 15 10"),
        arrayOf("20 2 21")
    )


    init {
        val algo: IsValidSudoku = IsValidSudoku();
        "Algorithm Test" {
            algo.isValidSudoku(test) shouldBe true;
        }

        //val Algo: PWeekly3 = PWeekly3();
        //"Algorithm Test" {
        //    Algo.solution(testCase_2D_Int_Array, testCase_2D_Int_Array2) shouldBe 54;
        //}
    }
}

