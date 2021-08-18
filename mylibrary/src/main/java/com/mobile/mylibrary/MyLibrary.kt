package com.mobile.mylibrary

import android.content.Context
import android.util.Log
import android.widget.Toast

open class MyLibrary(private val context:Context) {
    public fun test1(str:String){
       val version= context.packageManager.getPackageInfo(context.packageName,0).versionName
        Toast.makeText(context,"Version:$version+toast: $str",Toast.LENGTH_LONG).show()
    }
    public fun test6(str:String){
        val version= context.packageManager.getPackageInfo(context.packageName,0).versionName
        Toast.makeText(context,"Version:$version+toast: $str",Toast.LENGTH_LONG).show()
    }
}