package com.demoapp.typicode.presentation.useres

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.demoapp.typicode.presentation.useres.viewmodel.UserViewModel

@Composable
fun UserListstypicode(
    viewModel: UserViewModel = hiltViewModel()

){


    val uiState by viewModel.userState.collectAsStateWithLifecycle()


    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {padding->
        Column(modifier = Modifier.fillMaxSize().padding(padding)) {

            UserScreen(
                state = uiState,
                onRetryClick = { viewModel.fetchUsers() }
            )

        }



    }

}