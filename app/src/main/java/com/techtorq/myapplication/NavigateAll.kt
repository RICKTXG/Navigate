package com.techtorq.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigateAll(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.PageX, builder = {
        composable(Routes.PageX){
            PageX(navController)
        }
        composable(Routes.PageY){
            PageY(navController)
        }
        composable(Routes.Pagez){
            PageZ(navController)
        }
    })
}