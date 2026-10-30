package com.demoapp.typicode.util.constant

sealed class Screen(val route: String) {
    object UserList : Screen("user_list_screen")

}