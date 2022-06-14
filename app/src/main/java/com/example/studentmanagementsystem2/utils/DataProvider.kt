package com.example.studentmanagementsystem2.utils

import com.example.studentmanagementsystem2.contract.Data
import com.example.studentmanagementsystem2.contract.Response

object DataProvider {
    var response:Response = Response()
    var data: Data = Data()
    lateinit var userId:String
    lateinit var userName:String
}