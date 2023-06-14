package com.bangkit.tursik.data.response

import com.squareup.moshi.Json

data class DestinationRecomededResponse(

	@field:Json(name="data")
	val data: List<DataItemDestinationRecomended?>? = null,

	@field:Json(name="status")
	val status: String? = null
)

data class DataItemDestinationRecomended(

	@field:Json(name="Price")
	val price: String? = null,

	@field:Json(name="Rating")
	val rating: String? = null,

	@field:Json(name="Province")
	val province: String? = null,

	@field:Json(name="Name")
	val name: String? = null
)
