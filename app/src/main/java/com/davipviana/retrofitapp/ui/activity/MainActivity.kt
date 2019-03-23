package com.davipviana.retrofitapp.ui.activity

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.davipviana.retrofitapp.R
import com.davipviana.retrofitapp.viewmodel.CepViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var logradouroTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logradouroTextView = findViewById(R.id.logradouro)

        val viewModel = ViewModelProviders.of(this).get(CepViewModel::class.java)
        viewModel.obterLogradouro("30112010")
        viewModel.logradouro.observe(this, Observer {
            logradouroTextView.text = it
        })
    }
}
