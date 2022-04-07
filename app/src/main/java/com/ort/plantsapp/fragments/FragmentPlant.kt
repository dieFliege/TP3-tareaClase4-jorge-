package com.ort.plantsapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ort.plantsapp.R
import com.ort.plantsapp.viewmodels.FragmentPlantViewModel

class FragmentPlant : Fragment() {

    companion object {
        fun newInstance() = FragmentPlant()
    }

    private lateinit var viewModel: FragmentPlantViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_plant_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentPlantViewModel::class.java)
        // TODO: Use the ViewModel
    }

}