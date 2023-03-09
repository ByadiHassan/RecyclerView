package com.example.recyclerviewtest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.R
import com.example.recyclerviewtest.adapter.AdapterRV
import com.example.recyclerviewtest.model.Client

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapterRV: AdapterRV
    val fireBaseDase = ArrayList<Client>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()

        adapterRV = AdapterRV()

        adapterRV.update(fireBaseDase)

        recyclerView = this.findViewById(R.id.recyclerView)
        recyclerView.adapter = adapterRV
    }

    fun getData(){
        fireBaseDase.add(Client(    "aaaa","bbbb",15))
        fireBaseDase.add(Client(    "rgeg","httrh",732))
        fireBaseDase.add(Client(    "ethteh","rhthtr",1555))
        fireBaseDase.add(Client(    "hteetterh","bbbb",17545))
        fireBaseDase.add(Client(    "aaaa","bbbb",15))
        fireBaseDase.add(Client(    "aaaa","bbbb",15))
    }
}