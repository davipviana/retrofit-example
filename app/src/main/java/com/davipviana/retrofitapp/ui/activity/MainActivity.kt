package com.davipviana.retrofitapp.ui.activity

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.davipviana.retrofitapp.R
import com.davipviana.retrofitapp.viewmodel.CepViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this).get(CepViewModel::class.java)

        val textView = findViewById<TextView>(R.id.logradouro)

        textView.text = viewModel.obterLogradouro("30112010")
    }
}
