package br.senai.sp.jandira.rick_morty.service

import br.senai.sp.jandira.rick_morty.model.Character
import br.senai.sp.jandira.rick_morty.model.Results
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface CharacterService {

    @GET("character")
    fun listAllCharacters(): Call<Results>

    @GET("character/{id}")
    fun getCharacterById(@Path("id") id: Int): Call<Character>


//
//    @POST("character")
//    fun insert(@Body character: Character): Call<Character>
//
//    @PUT("character")
//    fun update(@Body character: Character): Call<Character>
//
//    @DELETE("character/{id}")
//    fun deleteCharacterById(@Path("id") id: Int): Call<Character>


}