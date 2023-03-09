package com.example.recyclerviewtest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.model.Client
import com.example.recyclerviewtest.R

class AdapterRV : RecyclerView.Adapter<ViewHolder>() {

    private lateinit var data:List<Client>

    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val myView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent , false)
        return ViewHolder(myView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.prenom.text = data[position].prenom
        holder.nom.text = data[position].nom
        holder.age.text = data[position].age.toString()
    }

    fun update(newList : List<Client>){
        data = newList
        notifyDataSetChanged()
    }

}