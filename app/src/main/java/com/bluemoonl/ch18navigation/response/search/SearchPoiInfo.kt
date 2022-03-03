package com.bluemoonl.ch18navigation.response.search

data class SearchPoiInfo (
    val totalCount: String,
    val count: String,
    val page: String,
    val pois: Pois
)