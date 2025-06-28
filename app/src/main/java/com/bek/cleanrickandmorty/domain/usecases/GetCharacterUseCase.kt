package com.bek.cleanrickandmorty.domain.usecases

import com.bek.cleanrickandmorty.domain.model.Character
import com.bek.cleanrickandmorty.domain.repository.CharacterRepository
import com.bek.cleanrickandmorty.util.Either
import kotlinx.coroutines.flow.Flow

class GetCharacterUseCase(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(): Flow<Either<String, Character>> = repository.getCharacter()
}