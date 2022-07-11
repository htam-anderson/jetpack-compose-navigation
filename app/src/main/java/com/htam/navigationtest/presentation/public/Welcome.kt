package com.htam.navigationtest.presentation.public

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.htam.navigationtest.presentation.checkRootBackStack
import com.htam.navigationtest.recomposeHighlighter

@Composable
fun Welcome(
    navController: NavController,
    backStackEntry: NavBackStackEntry
) {
    Log.d("navController", "++++++++++++++++++++++++++++++++++++")
    Log.d("navController", "backStackEntry: ${backStackEntry.destination.route}")
    Log.d("navController", "welcome : ${navController.currentBackStackEntry?.destination?.route}")
    checkRootBackStack(navController)
    Log.d("navController", "++++++++++++++++++++++++++++++++++++")

    Column(
        modifier = Modifier
            .padding(10.dp)
            .recomposeHighlighter(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "THIS IS THE WELCOME SCREEN")
        Button(onClick = { navController.navigate("login") }) {
            Text("Go To Login")
        }
    }
}