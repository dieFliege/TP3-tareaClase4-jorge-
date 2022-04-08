package com.ort.plantsapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.ort.plantsapp.R
import com.ort.plantsapp.entities.PlantsRepository
import com.ort.plantsapp.viewmodels.FragmentPlantDetailsViewModel


class FragmentPlantDetails : Fragment() {

    companion object {
        fun newInstance() = FragmentPlantDetails()
    }

    private lateinit var viewModel: FragmentPlantDetailsViewModel
    private lateinit var v : View
    private lateinit var txtName : TextView
    private lateinit var txtType : TextView
    private lateinit var img : ImageView
    var repository : PlantsRepository = PlantsRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_plant_details_fragment, container, false)
        txtName = v.findViewById(R.id.txtPlantName)
        txtType = v.findViewById(R.id.txtPlantType)
        img = v.findViewById(R.id.imgPlantUrlImage)
        return v
    }

    override fun onStart() {
        super.onStart()
        var plantPositionReceived = FragmentPlantDetailsArgs.fromBundle(requireArguments()).plantPosition
        txtName.text = repository.plantsList.get(plantPositionReceived).name
        txtType.text = repository.plantsList.get(plantPositionReceived).type
        val imgUrl = repository.plantsList.get(plantPositionReceived).urlImage
        Glide.with(this).load(imgUrl).into(img);
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentPlantDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}