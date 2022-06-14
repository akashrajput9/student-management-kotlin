package com.example.studentmanagementsystem2

import android.app.ProgressDialog
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.studentmanagementsystem2.contract.Request
import com.example.studentmanagementsystem2.network.IRequestContract
import com.example.studentmanagementsystem2.network.NetworkClient
import com.example.studentmanagementsystem2.utils.Constant
import com.example.studentmanagementsystem2.utils.showToast
import kotlinx.android.synthetic.main.layout_login.*

class LoginActivity:AppCompatActivity() {

    private lateinit var progressDialog:ProgressDialog
    private val retrofitClient = NetworkClient.getNetworkClient()
    private val requestContract = retrofitClient.create(IRequestContract::class.java)
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var userName:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        progressDialog = ProgressDialog(this)
        progressDialog.setMessage("please wait...")
        progressDialog.setCancelable(true)

        cirLoginButton.setOnClickListener {
            val userEmail =  editTextEmail.text;

            progressDialog.show()
            val request = Request(
                action = Constant.LOGIN_USER,
                email = userEmail
            )
            showToast(request.email);
            Log.d("request here", request.toString());
//            val callResponse = requestContract.makeApiCall(request)

//            callResponse.enqueue(this)
        }

//        fun onFailure(call: Call<Response>, t: Throwable) {
//            if(progressDialog.isShowing)
//                progressDialog.dismiss()
//            showToast("Server is not responding. Please contact your system administrator")
//            editTextEmail.setText("")
//        }
    }


}