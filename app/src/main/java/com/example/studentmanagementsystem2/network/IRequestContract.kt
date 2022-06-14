package com.example.studentmanagementsystem2.network

import com.example.studentmanagementsystem2.contract.Request
import com.example.studentmanagementsystem2.contract.Response
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface IRequestContract {
    @POST("service.php")
    fun makeApiCall(@Body request: Request): Call<Response>
}