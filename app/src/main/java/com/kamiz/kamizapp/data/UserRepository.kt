package com.kamiz.kamizapp.data

import com.kamiz.kamizapp.data.local.LocalDataSource
import com.kamiz.kamizapp.data.remote.RemoteDataSource

class UserRepository(
    val remote: RemoteDataSource,
    val local: LocalDataSource
) {
}