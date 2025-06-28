package com.bek.cleanrickandmorty.data.repository

import com.bek.cleanrickandmorty.data.datasource.CharacterService
import com.bek.cleanrickandmorty.data.mapper.toCharacter
import com.bek.cleanrickandmorty.domain.model.Character
import com.bek.cleanrickandmorty.domain.repository.CharacterRepository
import com.bek.cleanrickandmorty.util.Either
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException

class CharacterRepositoryImpl (
    private val service : CharacterService
) : CharacterRepository {
    override suspend fun getCharacter() : Flow<Either<String, Character>> = flow {
        try {
            val response = service.getCharacter()
            emit(Either.Right(response.toCharacter()))
        } catch (e : IOException) {
            emit(Either.Left(e.localizedMessage ?: "Unknown error!"))
        }
    }.flowOn(Dispatchers.IO)
}