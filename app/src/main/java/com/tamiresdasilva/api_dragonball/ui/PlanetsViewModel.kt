package com.tamiresdasilva.api_dragonball.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tamiresdasilva.api_dragonball.commons.utils.Results
import com.tamiresdasilva.api_dragonball.data.Planets
import com.tamiresdasilva.api_dragonball.data.repositories.PlanetsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PlanetsViewModel @Inject constructor(
    private val planetsRepository: PlanetsRepository
): ViewModel(){
    fun fetchPlanets(): LiveData<Results<List<Planets>>>{
        val liveData = MutableLiveData<Results<List<Planets>>>()
        liveData.postValue(Results.Loading)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val result = planetsRepository.fetchPlanets()
                liveData.postValue(Results.Success(result))
            } catch (e: Exception){
                liveData.postValue(Results.Error(e))
            }

        }
        return liveData
    }
}