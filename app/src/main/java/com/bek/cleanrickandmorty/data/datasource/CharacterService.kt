package com.bek.cleanrickandmorty.data.datasource

import com.bek.cleanrickandmorty.data.model.CharacterDto
import retrofit2.http.GET

interface CharacterService {
    @GET("character")
    suspend fun getCharacter() : CharacterDto
}