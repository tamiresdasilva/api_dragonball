package com.tamiresdasilva.api_dragonball.data.di

import com.tamiresdasilva.api_dragonball.data.datasources.PlanetsDataSource
import com.tamiresdasilva.api_dragonball.data.repositories.PlanetsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun providesPlanetsRepository(planetsDataSource: PlanetsDataSource): PlanetsRepository {
        return PlanetsRepository(planetsDataSource)
    }
}