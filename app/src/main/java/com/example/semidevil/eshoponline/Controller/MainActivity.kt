package com.example.semidevil.eshoponline.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.semidevil.eshoponline.Adapters.CategoryAdapter
import com.example.semidevil.eshoponline.Model.Category
import com.example.semidevil.eshoponline.R
import com.example.semidevil.eshoponline.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

    }
}
