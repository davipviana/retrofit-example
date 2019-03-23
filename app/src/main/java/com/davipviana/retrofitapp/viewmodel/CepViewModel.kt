package com.davipviana.retrofitapp.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.davipviana.retrofitapp.repository.CepRepository
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class CepViewModel : ViewModel() {
    val logradouro = MutableLiveData<String>()
    private val executorService: ExecutorService by lazy {
        Executors.newSingleThreadExecutor()
    }

    fun obterLogradouro(cep: String) {
        executorService.execute {
            logradouro.postValue(CepRepository.obterInformacoesCep(cep)?.logradouro)
        }
    }

}