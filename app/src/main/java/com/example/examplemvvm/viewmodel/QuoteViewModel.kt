package com.example.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.model.*

class QuoteViewModel :ViewModel(){
    val ADquoteModel = MutableLiveData<ADQuoteModel>()
    val PSquoteModel = MutableLiveData<PSQuoteModel>()
    val DIquoteModel = MutableLiveData<DIQuoteModel>()
    val GEquoteModel = MutableLiveData<GEQuoteModel>()
    val PMquoteModel = MutableLiveData<PMQuoteModel>()


    //ACCESO A DATOS
    //ALEATORIO
    fun ADrandomQuote(){
        val currentQuote = ADQuoteProvider.random()
        ADquoteModel.postValue(currentQuote)
    }
    //ORDENADO
        fun ADorderdQuote(position: Int) {
            val currentQuote = ADQuoteProvider.order(position)
            ADquoteModel.postValue(currentQuote)
        }
    //PROGRAMACION DE SERVICIOS
    //ALEATORIO
    fun PSrandomQuote(){
        val currentQuote = PSQuoteProvider.random()
        PSquoteModel.postValue(currentQuote)
    }
    //ORDENADO
        fun PSorderdQuote(position: Int) {
            val currentQuote = PSQuoteProvider.order(position)
            PSquoteModel.postValue(currentQuote)
        }
    //DESARROLLO INTERFACES
    //ALEATORIO
    fun DIrandomQuote(){
        val currentQuote = DIQuoteProvider.random()
        DIquoteModel.postValue(currentQuote)
    }
    //ORDENADO
    fun DIorderdQuote(position: Int) {
        val currentQuote = DIQuoteProvider.order(position)
        DIquoteModel.postValue(currentQuote)
    }

    //SISTEMAS DE GESTION
    //ALEATORIO
    fun GErandomQuote(){
        val currentQuote = GEQuoteProvider.random()
        GEquoteModel.postValue(currentQuote)
    }
    //ORDENADO
    fun GEorderdQuote(position: Int) {
        val currentQuote = GEQuoteProvider.order(position)
        GEquoteModel.postValue(currentQuote)
    }
    //MULTIMEDIA
    //ALEATORIO
    fun PMrandomQuote(){
        val currentQuote = PMQuoteProvider.random()
        PMquoteModel.postValue(currentQuote)
    }
    //ORDENADO
    fun PMorderdQuote(position: Int) {
        val currentQuote = PMQuoteProvider.order(position)
        PMquoteModel.postValue(currentQuote)
    }


}