package com.demoapp.typicode.data.networking

import com.demoapp.typicode.data.networking.dto.UserListsDTO
import com.demoapp.typicode.data.networking.dto.UserListsDTOItem
import jakarta.inject.Inject
import jakarta.inject.Singleton



@Singleton
class UserRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getUsers(): List<UserListsDTOItem> {
        return apiService.getuserLists()
    }
}