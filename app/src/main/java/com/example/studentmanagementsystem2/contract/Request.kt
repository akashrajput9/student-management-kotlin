package com.example.studentmanagementsystem2.contract

import android.text.Editable
import com.google.gson.annotations.SerializedName

data class Request(
    @SerializedName("action") var action:String="",
    @SerializedName("userId") var userId:String="",
    @SerializedName("email") var email: Editable ="",
    @SerializedName("blogId") var blogId:String="",
    @SerializedName("title") var title:String="",
    @SerializedName("description") var description:String=""
)