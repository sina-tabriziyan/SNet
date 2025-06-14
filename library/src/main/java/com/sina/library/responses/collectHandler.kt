/**
 * Created by ST on 6/9/2025.
 * Author: Sina Tabriziyan
 * @sina.tabriziyan@gmail.com
 */
package com.sina.library.responses

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch

suspend fun <T> Flow<T>.collectHandler(
    onError: (Throwable) -> Unit,
    onCollect: (T) -> Unit
) {
    this
        .catch { exception -> onError(exception) }
        .collect { value -> onCollect(value) }
}