package com.htam.navigationtest.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.htam.navigationtest.recomposeHighlighter

@Composable
fun ApplicationTest() {
    Box(
        modifier = Modifier
            .recomposeHighlighter()
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {
        NavigationHost()
    }
}
