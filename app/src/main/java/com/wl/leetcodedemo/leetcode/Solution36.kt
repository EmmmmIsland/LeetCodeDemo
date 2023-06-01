package com.wl.leetcodedemo.leetcode

import android.util.Log

/**
 * User: wanglei
 * Date: 2023/6/1 11:18
 * Description:
 */
object Solution36 {
    init {
        val arrayOf = arrayOf<CharArray>(
            charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )

        val arrayOf1 = arrayOf<CharArray>(
            charArrayOf('5','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )
        val fourSum = isValidSudoku(arrayOf1)
        Log.d("Solution36:", fourSum.toString())
    }

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val hashMapOf = hashMapOf<Int, HashSet<Char>>()

        val hashSetOf = hashSetOf<Char>()

        //lazy
        hashMapOf.put(0, hashSetOf())
        hashMapOf.put(1, hashSetOf())
        hashMapOf.put(2, hashSetOf())
        hashMapOf.put(3, hashSetOf())
        hashMapOf.put(4, hashSetOf())
        hashMapOf.put(5, hashSetOf())
        hashMapOf.put(6, hashSetOf())
        hashMapOf.put(7, hashSetOf())
        hashMapOf.put(8, hashSetOf())

        hashMapOf.put(11, hashSetOf())
        hashMapOf.put(12, hashSetOf())
        hashMapOf.put(13, hashSetOf())
        hashMapOf.put(21, hashSetOf())
        hashMapOf.put(22, hashSetOf())
        hashMapOf.put(23, hashSetOf())
        hashMapOf.put(31, hashSetOf())
        hashMapOf.put(32, hashSetOf())
        hashMapOf.put(33, hashSetOf())

        for (line in board.indices) {
            hashSetOf.clear()
            for (row in board[line].indices) {
                if (board[line][row] == '.') continue
                val cline = hashSetOf.add(board[line][row])
                if (!cline) return false
                val rowMap = hashMapOf[row]?.add(board[line][row])
                if (!rowMap!!) return false
                val kkMap = hashMapOf[line/3*10 + 10 + row/3 + 1]?.add(board[line][row])
                if (!kkMap!!) return false
            }
        }
        return true
    }
}