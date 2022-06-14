package com.example.studentmanagementsystem2

import android.app.ProgressDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_login.*

class MainActivity : AppCompatActivity() {
    private lateinit var progressDialog:ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        progressDialog = ProgressDialog(this)
        progressDialog.setMessage("please wait...")
        progressDialog.setCancelable(true)

        cirLoginButton.setOnClickListener { View.OnClickListener {
            this.showToast("Hello");
            progressDialog.show()
        } }
    }

    fun Context.showToast(message:String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}