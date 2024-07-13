package com.tamiresdasilva.api_dragonball.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamiresdasilva.api_dragonball.data.Planets
import com.tamiresdasilva.api_dragonball.databinding.PlanetsItemBinding

class PlanetsAdapter: RecyclerView.Adapter<PlanetsAdapter.ViewHolder>() {
    private lateinit var binding: PlanetsItemBinding
    private lateinit var context: Context
    private var listPlanets: List<Planets> = emptyList()


    inner class ViewHolder(private val bindingHolder: PlanetsItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(planets: Planets){
            bindingHolder.planets = planets
        }
    }

    fun setUpCharacters(planets: List<Planets>) {
        this.listPlanets = planets
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        binding = PlanetsItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listPlanets.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listPlanets[position])
        binding.executePendingBindings()
    }
}