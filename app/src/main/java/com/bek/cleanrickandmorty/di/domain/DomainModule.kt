package com.bek.cleanrickandmorty.di.domain

import com.bek.cleanrickandmorty.domain.usecases.GetCharacterUseCase
import org.koin.dsl.module

val domainModule = module {
    single { GetCharacterUseCase(repository = get()) }
}