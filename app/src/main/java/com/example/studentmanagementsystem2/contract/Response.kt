package com.example.studentmanagementsystem2.contract

data class Response (
    var status:Boolean = false,
    var responseCode:Int = -1,
    var message:String = "",
    var data:MutableList<Data> = mutableListOf(),

)