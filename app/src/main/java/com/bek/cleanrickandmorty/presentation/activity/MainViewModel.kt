package com.bek.cleanrickandmorty.presentation.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bek.cleanrickandmorty.domain.model.Character
import com.bek.cleanrickandmorty.domain.usecases.GetCharacterUseCase
import kotlinx.coroutines.launch

class MainViewModel(
    private val getCharacterUseCase: GetCharacterUseCase
) : ViewModel() {

    private val _character = MutableLiveData<Character?>()
    val character : LiveData<Character?> = _character

    fun getCharacter() {
        viewModelScope.launch {
            _character.value = getCharacterUseCase()
        }
    }
}