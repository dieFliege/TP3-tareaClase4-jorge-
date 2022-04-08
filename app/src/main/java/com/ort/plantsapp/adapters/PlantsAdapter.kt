package com.ort.plantsapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.ort.plantsapp.R
import com.ort.plantsapp.entities.Plant

class PlantsAdapter (var qatarList: MutableList<Plant>,
                     var onClick : (Int) -> Unit) : RecyclerView.Adapter<PlantsAdapter.PlantsHolder>() {
    class PlantsHolder (v : View) : RecyclerView.ViewHolder(v) {
        private var view : View
        init {
            this.view = v
        }
        fun setName (name : String) {
            var txtName : TextView = view.findViewById(R.id.txtItemName)
            txtName.text = name
        }
        fun getCard () : CardView {
            return view.findViewById(R.id.card)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_plant,parent,false)
        return (PlantsHolder(view))
    }

    override fun onBindViewHolder(holder: PlantsHolder, position: Int) {
        holder.setName(qatarList[position].name)
        holder.getCard().setOnClickListener {
            onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return qatarList.size
    }

}