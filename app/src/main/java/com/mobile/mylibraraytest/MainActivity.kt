package com.mobile.mylibraraytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.mylibrary.MyLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyLibrary(this).test1("我是二")
    }
}