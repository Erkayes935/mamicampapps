package com.terserah.mamicamp

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.httpDelete
import com.github.kittinunf.fuel.httpGet
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.layout_employe_list.*

class EmployeeListActivity : AppCompatActivity() {

    var adapterBebas: EmployeeAdapter? = null
    var datanya: MutableList<EmployeePojo> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_employe_list)
        adapterBebas = EmployeeAdapter(this, datanya)
        recyclerEmployee.adapter = adapterBebas



        getData()

    }

    private fun getData() {
        val baseUrlGet = "http://dummy.restapiexample.com/api/v1/employees"
        baseUrlGet
            .httpGet()
            .responseString { request, response, result ->

                Log.e("responsex", "${datanya.size}")
                loadingBro.visibility = View.GONE
                Log.e("responsexx", "${datanya.size}")
                showData(result.component1())


            }
    }

    private fun showData(result: String?) {


        val listType = object : TypeToken<ArrayList<EmployeePojo>>() {
        }.type

        datanya = Gson().fromJson(result, listType)
        Log.e("response", "${datanya.size}")

        for (i in 0 until 10) {
            Log.e("response", "${datanya[i].employeeName}")
            adapterBebas?.addData(
                EmployeePojo(
                    datanya[i].employeeName,
                    datanya[i].employeeAge,
                    datanya[i].employeeSalary
                )
            )
        }
        adapterBebas?.notifyDataSetChanged()

    }

}