package com.davipviana.retrofitapp.viewmodel

import android.arch.lifecycle.ViewModel
import com.davipviana.retrofitapp.repository.CepRepository

class CepViewModel : ViewModel() {


    fun obterLogradouro(cep: String): String? {
        return CepRepository.obterInformacoesCep(cep)?.logradouro
    }

}