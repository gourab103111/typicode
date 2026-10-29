package com.demoapp.typicode.presentation.useres.viewcomponent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed

@Composable
fun UserViewItemes(name:String,email:String, companyname:String){

    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text("Name : ${name}")
            Text("Email : ${email}")
            Text("Companyname : ${companyname}")
        }

    }

}