package com.demoapp.typicode.presentation.useres

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.demoapp.typicode.data.networking.dto.UserListsDTOItem
import com.demoapp.typicode.presentation.useres.viewcomponent.UserItem
import com.demoapp.typicode.util.constant.Screen
import com.demoapp.typicode.util.uidata.UiState

@Composable
fun UserScreen(
    state: UiState<List<UserListsDTOItem>>,
    onRetryClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        when (state) {
            is UiState.Loading -> {
                CircularProgressIndicator()
            }
            is UiState.Success -> {

                LazyColumn {
                    items(state.data) { user ->
                        UserItem(
                            user  ,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }

                //Screen.UserList(users = state.data)
            }
            is UiState.Error -> {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = state.message, color = MaterialTheme.colorScheme.error)
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = onRetryClick) {
                        Text("Retry")
                    }
                }
            }
        }
    }
}
