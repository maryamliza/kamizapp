package com.kamiz.kamizapp.di

import com.kamiz.kamizapp.data.UserRepository
import com.kamiz.kamizapp.data.local.LocalDataSource
import com.kamiz.kamizapp.data.local.room.AppDatabase
import com.kamiz.kamizapp.data.remote.RemoteDataSource
import com.kamiz.kamizapp.data.remote.retrofit.RetrofitManager
import com.kamiz.kamizapp.data.remote.retrofit.ServiceAPI
import org.koin.dsl.module

val repositoryModule = module {
    single { UserRepository(get(), get()) }

    single { RemoteDataSource(get()) }
    single<ServiceAPI> { RetrofitManager.getService() }

    single { LocalDataSource(get()) }
    single<AppDatabase> { AppDatabase() }
}

val viewModelsModule = module {
    // Aqui iran lo viewmodels usando viewModel { SomeViewModel(get())}
}