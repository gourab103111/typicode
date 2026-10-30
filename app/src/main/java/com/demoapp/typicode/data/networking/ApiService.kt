package com.demoapp.typicode.data.networking

import com.demoapp.typicode.data.networking.dto.UserListsDTO
import com.demoapp.typicode.data.networking.dto.UserListsDTOItem
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getuserLists(): List<UserListsDTOItem>
}