package com.example.studentmanagementsystem2.utils

import android.content.Context
import android.text.Editable
import android.widget.Toast

fun Context.showToast(message: Editable){
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}