package br.senai.sp.jandira.rick_morty.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val BASE_URL =  "https://rickandmortyapi.com/api/"

    private val RetrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getCharacterService(): CharacterService{
        return RetrofitFactory.create(CharacterService::class.java)
    }
}