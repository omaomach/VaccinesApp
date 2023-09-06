package com.omao.vaccinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1- AdapterView: RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        // 2- Data Source: List of VaccineModel Objects
        var vaccinesList: ArrayList<VaccineModel> = ArrayList()
        val v1 = VaccineModel("Covid-19", R.drawable.vaccine1)
        val v2 = VaccineModel("HPV", R.drawable.vaccine4)
        val v3 = VaccineModel("Polio", R.drawable.vaccine5)
        val v4 = VaccineModel("Malaria", R.drawable.vaccine6)
        val v5 = VaccineModel("Syphilis", R.drawable.vaccine7)
        val v6 = VaccineModel("Gonorrhoea", R.drawable.vaccine8)
        val v7 = VaccineModel("Chicken Pox", R.drawable.vaccine9)

        vaccinesList.add(v1)
        vaccinesList.add(v2)
        vaccinesList.add(v3)
        vaccinesList.add(v4)
        vaccinesList.add(v5)
        vaccinesList.add(v6)
        vaccinesList.add(v7)

        // 3 - Adapter

    }
}