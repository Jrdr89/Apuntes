package com.example.examplemvvm.view

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.lifecycle.Observer
import com.example.examplemvvm.databinding.ActivityMainBinding
import com.example.examplemvvm.model.*
import com.example.examplemvvm.viewmodel.QuoteViewModel


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var position =0
        var longitud: Int = 0


        binding.rgAsignaturas.setOnCheckedChangeListener { radioGroup, i ->
            position=0
        }

        binding.viewContainer.setOnClickListener {
            //ACCESO A DATOS seleccionado
            if (binding.AccesoAdatos.isChecked) {
                longitud= ADQuoteProvider.longitud
                if(binding.Aleatorio.isChecked){
                    quoteViewModel.ADrandomQuote()  //Modo aleatorio
                    quoteViewModel.ADquoteModel.observe(this, Observer {
                        binding.tvQuote.text = it.quote
                        binding.tvAuthor.text = it.author
                    })
                }else if(binding.Ordenado.isChecked){
                        quoteViewModel.ADorderdQuote(position) //Modo ordenado, pasando posicion
                        quoteViewModel.ADquoteModel.observe(this, Observer {
                            binding.tvQuote.text = it.quote
                            binding.tvAuthor.text = it.author
                        })
                }
            //PROGRAMACION SERVICIOS seleccionado
            } else if (binding.ProgramacionS.isChecked) {
                longitud= PSQuoteProvider.longitud
                if(binding.Aleatorio.isChecked){
                    quoteViewModel.PSrandomQuote()   //Modo aleatorio
                    quoteViewModel.PSquoteModel.observe(this, Observer {
                        binding.tvQuote.text = it.quote
                        binding.tvAuthor.text = it.author
                    })
                }else if(binding.Ordenado.isChecked){
                    quoteViewModel.PSorderdQuote(position)  //Modo ordenado, pasando posicion
                    quoteViewModel.PSquoteModel.observe(this, Observer {
                        binding.tvQuote.text = it.quote
                        binding.tvAuthor.text = it.author
                    })
                }
            //DESARROLLO DE INTERFACES seleccionado
            } else if (binding.Interfaces.isChecked) {
                longitud= DIQuoteProvider.longitud
                if(binding.Aleatorio.isChecked){
                    quoteViewModel.DIrandomQuote()   //Modo aleatorio
                    quoteViewModel.DIquoteModel.observe(this, Observer {
                        binding.tvQuote.text = it.quote
                        binding.tvAuthor.text = it.author
                    })
                }else if(binding.Ordenado.isChecked){
                    quoteViewModel.DIorderdQuote(position) //Modo ordenado, pasando posicion
                    quoteViewModel.DIquoteModel.observe(this, Observer {
                        binding.tvQuote.text = it.quote
                        binding.tvAuthor.text = it.author
                    })

                }
             //SISTEMAS DE GESTION EMPRESARIAL seleccionado

            }else if (binding.SistemasGest.isChecked) {
                longitud = GEQuoteProvider.longitud
                if (binding.Aleatorio.isChecked) {
                    quoteViewModel.GErandomQuote()   //Modo aleatorio
                    quoteViewModel.GEquoteModel.observe(this, Observer {
                        binding.tvQuote.text = it.quote
                        binding.tvAuthor.text = it.author
                    })
                } else if (binding.Ordenado.isChecked) {
                    quoteViewModel.GEorderdQuote(position) //Modo ordenado, pasando posicion
                    quoteViewModel.GEquoteModel.observe(this, Observer {
                        binding.tvQuote.text = it.quote
                        binding.tvAuthor.text = it.author
                    })

                }
            }else if (binding.Multimedia.isChecked) {
                longitud = PMQuoteProvider.longitud
                if (binding.Aleatorio.isChecked) {
                    quoteViewModel.PMrandomQuote()   //Modo aleatorio
                    quoteViewModel.PMquoteModel.observe(this, Observer {
                        binding.tvQuote.text = it.quote
                        binding.tvAuthor.text = it.author
                    })
                } else if (binding.Ordenado.isChecked) {
                    quoteViewModel.PMorderdQuote(position) //Modo ordenado, pasando posicion
                    quoteViewModel.PMquoteModel.observe(this, Observer {
                        binding.tvQuote.text = it.quote
                        binding.tvAuthor.text = it.author
                    })

                }
            }

            if(longitud>position){
                position++
            }else   {
                position=0
            }

        }
    }
}



