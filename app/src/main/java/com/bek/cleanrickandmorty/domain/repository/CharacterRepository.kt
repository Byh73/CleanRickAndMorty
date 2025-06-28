package com.bek.cleanrickandmorty.domain.repository

import com.bek.cleanrickandmorty.domain.model.Character
import com.bek.cleanrickandmorty.util.Either
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    suspend fun getCharacter(): Flow<Either<String, Character>>
}