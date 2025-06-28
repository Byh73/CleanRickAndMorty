package com.bek.cleanrickandmorty.data.repository

import com.bek.cleanrickandmorty.data.datasource.CharacterService
import com.bek.cleanrickandmorty.data.mapper.toCharacter
import com.bek.cleanrickandmorty.domain.repository.CharacterRepository

class CharacterRepositoryImpl (
    private val service : CharacterService
) : CharacterRepository {
    override suspend fun getCharacter() = service.getCharacter().toCharacter()

}