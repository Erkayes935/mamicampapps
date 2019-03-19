package com.terserah.mamicamp

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_main_activity_constraint.view.*
import com.bumptech.glide.Glide



class EmployeeAdapter(val activity: Activity, val data: MutableList<EmployeePojo>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(activity).inflate(R.layout.layout_main_activity_constraint, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun addData(a : EmployeePojo){
        data.add(a)
        data.reverse()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(employeePojo : EmployeePojo ) {
            val url = "https://cdn.pixabay.com/user/2015/01/20/20-56-42-330_250x250.jpg"
            Glide
                .with(itemView.context)
                .load(url)
                .centerCrop()
                .into(itemView.imageView1);
            itemView.TextView1.text = "Nama : ${employeePojo.employeeName}"
            itemView.TextView2.text = "Umur : ${employeePojo.employeeAge}"
            itemView.TextView3.text = "Gaji : ${employeePojo.employeeSalary}"
            itemView.ButtonList.setOnClickListener {
                Log.e("datane name", "${employeePojo.employeeName}")
                Log.e("datane salary", "${employeePojo.employeeSalary}")
            }

        }
    }

}