package com.bek.cleanrickandmorty.domain.usecases

import com.bek.cleanrickandmorty.domain.repository.CharacterRepository

class GetCharacterUseCase(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke() = repository.getCharacter()
}