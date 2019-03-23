package com.davipviana.retrofitapp.dataaccess.webservice

import com.davipviana.retrofitapp.entity.Cep
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ViaCepService {
    @GET("{cep}/json")
    fun obterInformacoesCep(
        @Path("cep") cep: String
    ): Call<Cep>
}