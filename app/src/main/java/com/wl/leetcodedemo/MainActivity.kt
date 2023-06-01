package com.wl.leetcodedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wl.leetcodedemo.databinding.ActivityMainBinding
import com.wl.leetcodedemo.leetcode.Solution18
import com.wl.leetcodedemo.leetcode.Solution36

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.tvLeetcode.setOnClickListener{
            Solution36
        }
    }
}