package com.demoapp.typicode.presentation.useres

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.demoapp.typicode.presentation.useres.viewcomponent.UserViewItemes

@Composable
fun UserListstypicode(){

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {padding->
        Column(modifier = Modifier.fillMaxSize().padding(padding)) {

            Row(modifier = Modifier.fillMaxWidth()) {

                UserViewItemes("Name 1", "Email 1", "Company Name 1")

            }

        }



    }

}