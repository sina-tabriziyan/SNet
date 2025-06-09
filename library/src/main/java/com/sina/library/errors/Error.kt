package com.sina.library.errors

import com.sina.library.status.Status

data class Error(
    val code: String,
    val message: String,
    val data: Status
)