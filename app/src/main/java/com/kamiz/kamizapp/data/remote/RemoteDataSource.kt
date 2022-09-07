package com.kamiz.kamizapp.data.remote

import com.kamiz.kamizapp.data.remote.retrofit.ServiceAPI
import kotlin.random.Random
import kotlinx.coroutines.delay

class RemoteDataSource(
    val service: ServiceAPI,
) {
    suspend fun login(username: String, password: String): String? {
        delay(400)
        val token = if (username.startsWith("kamiz", ignoreCase = true) && password.length == 4) {
            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
        } else {
            if (Random.nextBoolean()) "" else null
        }
        return token
    }
}