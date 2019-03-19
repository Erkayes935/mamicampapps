package com.terserah.mamicamp

import android.util.Log
import com.github.kittinunf.fuel.httpPost
import com.google.gson.Gson
import timber.log.Timber

object MamiCampUrl {
    private val KEY_BASE_URL = "http://dummy.restapiexample.com/api/v1/"
    private val KEY_GET_EMPLOYEE = "employees"
    private val KEY_SEND_EMPLOYEE = "create"

    fun sendEmployee(param: EmployeeSenderPojo) {
        val urlSender = KEY_BASE_URL+ KEY_SEND_EMPLOYEE
        urlSender.httpPost()
            .body(Gson().toJson(param))
            .responseString {
                request,response,result ->
                Timber.d ("Response Employee $response")
            }
    }
}
