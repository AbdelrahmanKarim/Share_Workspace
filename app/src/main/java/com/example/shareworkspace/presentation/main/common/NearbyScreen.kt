package com.example.shareworkspace.presentation.main.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.shareworkspace.presentation.main.home.components.MainTopAppBar
import com.example.shareworkspace.presentation.main.search.components.WorkspaceCard


@Composable
fun NearbyScreen(navController: NavController,navHostController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState()),
    ) {
        MainTopAppBar(title = "Nearby Workspaces") {
            navController.popBackStack()
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            WorkspaceCard{ navHostController.navigate("Details_Screen")}
            WorkspaceCard{ navHostController.navigate("Details_Screen")}
            WorkspaceCard{ navHostController.navigate("Details_Screen")}
            WorkspaceCard{ navHostController.navigate("Details_Screen")}
            WorkspaceCard{ navHostController.navigate("Details_Screen")}
            WorkspaceCard{ navHostController.navigate("Details_Screen")}


        }
    }
}

@Preview(showBackground = true)
@Composable
private fun NearbyScreenPreview() {
    NearbyScreen(rememberNavController(), rememberNavController())
}