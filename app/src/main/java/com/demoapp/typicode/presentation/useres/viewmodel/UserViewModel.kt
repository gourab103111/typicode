package com.demoapp.typicode.presentation.useres.viewmodel

import androidx.lifecycle.ViewModel

import androidx.lifecycle.viewModelScope
import com.demoapp.typicode.data.networking.UserRepository
import com.demoapp.typicode.data.networking.dto.UserListsDTO
import com.demoapp.typicode.data.networking.dto.UserListsDTOItem
import com.demoapp.typicode.util.uidata.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val repository: UserRepository
) : ViewModel() {

    private val _userState = MutableStateFlow<UiState<List<UserListsDTOItem>>>(UiState.Loading)
    val userState: StateFlow<UiState<List<UserListsDTOItem>>> = _userState.asStateFlow()

    init {
        fetchUsers()
    }

    fun fetchUsers() {
        viewModelScope.launch {
            _userState.value = UiState.Loading
            try {
                val response = repository.getUsers()
                _userState.value = UiState.Success(response)
            } catch (e: Exception) {
                _userState.value = UiState.Error(e.localizedMessage ?: "An unexpected error occurred")
            }
        }
    }
}
