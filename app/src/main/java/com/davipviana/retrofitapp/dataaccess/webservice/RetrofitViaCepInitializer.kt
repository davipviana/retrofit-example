package com.davipviana.retrofitapp.dataaccess.webservice

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitViaCepInitializer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://viacep.com.br/ws/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun viaCepService() = retrofit.create(ViaCepService::class.java)
}