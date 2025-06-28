package com.bek.cleanrickandmorty.domain.repository

import com.bek.cleanrickandmorty.domain.model.Character

interface CharacterRepository {
    suspend fun getCharacter() : Character
}