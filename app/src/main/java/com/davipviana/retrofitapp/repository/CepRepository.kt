package com.davipviana.retrofitapp.repository

import com.davipviana.retrofitapp.dataaccess.webservice.RetrofitViaCepInitializer
import com.davipviana.retrofitapp.entity.Cep

object CepRepository {

    fun obterInformacoesCep(cep: String): Cep? {
        return RetrofitViaCepInitializer()
            .viaCepService()
            .obterInformacoesCep(cep)
            .execute()
            .body()
    }
}