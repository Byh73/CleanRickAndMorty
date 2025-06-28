package com.bek.cleanrickandmorty.di

import com.bek.cleanrickandmorty.di.data.networkModule
import com.bek.cleanrickandmorty.di.domain.domainModule
import com.bek.cleanrickandmorty.di.presentation.presentationModule
val appModule =
    listOf( domainModule, presentationModule, networkModule)