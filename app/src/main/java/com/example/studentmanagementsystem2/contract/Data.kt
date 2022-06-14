package com.example.studentmanagementsystem2.contract

import com.google.gson.annotations.SerializedName

data class Data (
    @SerializedName("user_id") var user_id:Int=0,
    @SerializedName("user_name") var user_name:String="",
    @SerializedName("email") var email:String="",
    @SerializedName("token") var token:String="",
    @SerializedName("created_at") var created_at:String=""
)