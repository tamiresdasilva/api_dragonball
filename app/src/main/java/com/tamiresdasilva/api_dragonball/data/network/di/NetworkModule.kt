package com.tamiresdasilva.api_dragonball.data.network.di

import com.tamiresdasilva.api_dragonball.data.network.PlanetsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl("https://dragonball-api.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Provides
    @Singleton
    fun providesPlanetsService(retrofit: Retrofit): PlanetsApi {
        return retrofit.create(PlanetsApi::class.java)
    }
}