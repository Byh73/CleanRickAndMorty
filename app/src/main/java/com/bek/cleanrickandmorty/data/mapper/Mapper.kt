package com.bek.cleanrickandmorty.data.mapper

import com.bek.cleanrickandmorty.data.model.CharacterDto
import com.bek.cleanrickandmorty.domain.model.Character

fun CharacterDto.toCharacter() : Character = Character (
    results = this.results.map { it.toResult() }
)

fun CharacterDto.Result.toResult() : Character.Result = Character.Result(
    image = this.image,
    name = this.name
)