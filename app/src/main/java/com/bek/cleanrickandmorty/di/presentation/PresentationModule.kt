package com.bek.cleanrickandmorty.di.presentation

import com.bek.cleanrickandmorty.presentation.activity.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        MainViewModel(
            getCharacterUseCase = get()
        )
    }
}