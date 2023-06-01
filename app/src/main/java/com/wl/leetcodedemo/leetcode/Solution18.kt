package com.wl.leetcodedemo.leetcode

import android.util.Log

/**
 * User: wanglei
 * Date: 2023/6/1 11:18
 * Description:
 */
object Solution18 {
    init {
        val arrayOf = intArrayOf(1,0,-1,0,-2,2)
        val fourSum = fourSum(arrayOf, 0)
        Log.d("Solution18:",fourSum.toString())
    }

    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
//        nums.sort()
        val setOf = hashSetOf<List<Int>>()
        for (i in nums.indices) {
                for (ii in i + 1 until nums.size - 2) {
                    for (iii in ii + 1 until nums.size - 1) {
                        for (iiii in iii + 1 until nums.size) {
                            if (nums[i].toLong().plus(nums[ii].toLong()).plus( nums[iii].toLong()).plus(nums[iiii].toLong()) == target.toLong()) {
                                setOf.add(listOf(nums[i], nums[ii], nums[iii], nums[iiii]))
                            }
                        }
                    }
            }
        }
        return setOf.toList()
    }
}