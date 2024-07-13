package com.tamiresdasilva.api_dragonball.data.di

import com.tamiresdasilva.api_dragonball.data.datasources.PlanetsDataSource
import com.tamiresdasilva.api_dragonball.data.network.PlanetsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun providesDataSourceModule(api: PlanetsApi): PlanetsDataSource {
        return PlanetsDataSource(api)
    }
}