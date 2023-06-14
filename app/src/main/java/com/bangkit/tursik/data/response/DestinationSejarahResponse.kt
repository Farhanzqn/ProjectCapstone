package com.bangkit.tursik.data.response

import com.squareup.moshi.Json

data class DestinationSejarahResponse(

	@field:Json(name="data")
	val data: List<DataItemSejarah?>? = null,

	@field:Json(name="status")
	val status: String? = null
)

data class DataItemSejarah(

	@field:Json(name="Price")
	val price: String? = null,

	@field:Json(name="Rating")
	val rating: String? = null,

	@field:Json(name="Province")
	val province: String? = null,

	@field:Json(name="Name")
	val name: String? = null
)
