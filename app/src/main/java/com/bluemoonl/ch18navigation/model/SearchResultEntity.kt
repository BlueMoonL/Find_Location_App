package com.bluemoonl.ch18navigation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchResultEntity(
    val fullAdress: String,
    val name: String,
    val locationLatLng: LocationLatLngEntity
): Parcelable
