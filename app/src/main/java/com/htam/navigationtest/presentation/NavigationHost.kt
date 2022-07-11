package com.htam.navigationtest.presentation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.htam.navigationtest.presentation.public.Login
import com.htam.navigationtest.presentation.public.Verify
import com.htam.navigationtest.presentation.public.Welcome

@Composable
fun NavigationHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "public"
    ) {
        publicGraph(navController)
    }
}

fun NavGraphBuilder.publicGraph(
    navController: NavController,
) {
    Log.e("publicGraph", "CALLED")
    navigation(
        startDestination = "welcome",
        route = "public"
    ) {
        composable("welcome") { backStackEntry ->
            Welcome(navController, backStackEntry)
        }

        composable("login") { backStackEntry ->
            Login(navController, backStackEntry)
        }

        composable("verify") { backStackEntry ->
            Verify(navController, backStackEntry)
        }
    }
}

fun checkRootBackStack(navController: NavController) {
    val backQueue = navController.backQueue
    Log.d("navController-BACKSTACK", "========START========")
    for ((index, value) in backQueue.withIndex()) {
        Log.d("navController-BACKSTACK", "ROOT Route$index = ${value.destination.route}")
    }
    Log.d("navController-BACKSTACK", "========END========")
}