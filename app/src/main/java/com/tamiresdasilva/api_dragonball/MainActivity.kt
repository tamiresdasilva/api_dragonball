package com.tamiresdasilva.api_dragonball

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.tamiresdasilva.api_dragonball.commons.utils.Results
import com.tamiresdasilva.api_dragonball.databinding.ActivityMainBinding
import com.tamiresdasilva.api_dragonball.ui.PlanetsViewModel
import com.tamiresdasilva.api_dragonball.ui.adapters.PlanetsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PlanetsAdapter
    private val charactersViewModel: PlanetsViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configureRecycler()
        observer()
    }

    private fun configureRecycler(){
        adapter = PlanetsAdapter()
        binding.rcPlanets.adapter = adapter
    }

    private fun observer(){
        charactersViewModel.fetchPlanets().observe(this){ result ->
            when(result) {
                is Results.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                is Results.Success -> {
                    binding.progressBar.visibility = View.GONE
                    adapter.setUpPlanets(result.data)
                }
                is Results.Error -> {
                    binding.progressBar.visibility = View.GONE
                }
            }
        }
    }
}