package com.ort.plantsapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ort.plantsapp.R
import com.ort.plantsapp.viewmodels.FragmentPlantsViewModel

class FragmentPlants : Fragment() {

    companion object {
        fun newInstance() = FragmentPlants()
    }

    private lateinit var viewModel: FragmentPlantsViewModel
    private lateinit var v : View
    private lateinit var txtUser : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_plants_fragment, container, false)
        txtUser = v.findViewById(R.id.txtUserName)
        return v
    }

    override fun onStart() {
        super.onStart()
        var userNameReceived = FragmentPlantsArgs.fromBundle(requireArguments()).userNameValue
        txtUser.text = userNameReceived
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentPlantsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}