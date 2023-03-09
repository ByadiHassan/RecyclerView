package com.example.recyclerviewtest.adapter

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.R

class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
    val prenom = itemView.findViewById<AppCompatTextView>(R.id.textViewPrenom)
    val nom = itemView.findViewById<AppCompatTextView>(R.id.textViewNom)
    val age = itemView.findViewById<AppCompatTextView>(R.id.textViewAge)

}