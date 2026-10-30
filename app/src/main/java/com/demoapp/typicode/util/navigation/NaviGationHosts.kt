package com.demoapp.typicode.util.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.demoapp.typicode.presentation.useres.UserListstypicode
import com.demoapp.typicode.util.constant.Screen

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.UserList.route,
        modifier = modifier
    ) {
        // Define the destination route node mapping
        composable(route = Screen.UserList.route) {
            // Hilt automatically binds the ViewModel when this route is built
            UserListstypicode()
        }
    }
}
