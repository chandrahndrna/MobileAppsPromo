package com.example.mobileappspromo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Promo(
    val imgPromo: Int,
    val namePromo: String,
    val descPromo: String
) :Parcelable
