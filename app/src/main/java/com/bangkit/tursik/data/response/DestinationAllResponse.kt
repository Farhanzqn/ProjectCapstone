package com.bangkit.tursik.data.response

import com.squareup.moshi.Json

data class DestinationAllResponse(

	@field:Json(name="data")
	val data: List<DataItemAll?>? = null,

	@field:Json(name="status")
	val status: String? = null
)

data class DataItemAll(

	@field:Json(name="Regency")
	val regency: String? = null,

	@field:Json(name="Category")
	val category: String? = null,

	@field:Json(name="Price")
	val price: String? = null,

	@field:Json(name="Rating")
	val rating: String? = null,

	@field:Json(name="Province")
	val province: String? = null,

	@field:Json(name="Name")
	val name: String? = null
)
