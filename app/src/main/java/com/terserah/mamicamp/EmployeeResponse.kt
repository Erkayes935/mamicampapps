package com.terserah.mamicamp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class EmployeeResponse(var dataNe: MutableList<EmployeePojo> = arrayListOf()) : Parcelable