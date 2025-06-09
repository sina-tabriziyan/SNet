package com.sina.library.responses

import com.sina.library.status.Status
import com.sina.library.status.NetworkStatus

fun NetworkStatus.asStatus() = Status(status)
