package com.ort.plantsapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.ort.plantsapp.R
import com.ort.plantsapp.adapters.PlantsAdapter
import com.ort.plantsapp.entities.PlantsRepository
import com.ort.plantsapp.viewmodels.FragmentPlantsViewModel

class FragmentPlants : Fragment() {

    companion object {
        fun newInstance() = FragmentPlants()
    }

    private lateinit var viewModel: FragmentPlantsViewModel
    private lateinit var v : View
    lateinit var recyclerPlants : RecyclerView
    lateinit var adapter : PlantsAdapter
    var repository : PlantsRepository = PlantsRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_plants_fragment, container, false)
        recyclerPlants = v.findViewById(R.id.recPlants)
        return v
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        var userNameReceived = FragmentPlantsArgs.fromBundle(requireArguments()).userNameValue
        recyclerPlants.setHasFixedSize(true)
        recyclerPlants.layoutManager = LinearLayoutManager(context)
        adapter = PlantsAdapter(repository.plantsList) { position ->
            val action = FragmentPlantsDirections.actionFragmentPlantsToFragmentPlantDetails(position)
            v.findNavController().navigate(action)
            //Snackbar.make(v,position.toString(), Snackbar.LENGTH_SHORT).show()
        }
        recyclerPlants.adapter = adapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentPlantsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}