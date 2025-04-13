package dev.erad.multiplebackstackscompose.ui.settings.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.erad.multiplebackstackscompose.ui.settings.SettingsViewModel
import dev.erad.multiplebackstackscompose.ui.theme.MultipleBackStacksComposeTheme

@Composable
fun SettingsScreen2(
    modifier: Modifier = Modifier,
    viewModel: SettingsViewModel = viewModel(),
    navController: NavController = rememberNavController()
) {
    val uiState by viewModel.uiState.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Settings Screen 2",
            style = MaterialTheme.typography.headlineMedium
        )

        if (uiState.isLoading) {
            CircularProgressIndicator()
        }

        uiState.error?.let { error ->
            Text(
                text = error,
                color = MaterialTheme.colorScheme.error
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(
                onClick = { navController.navigate("settings3") }
            ) {
                Text("Go to Settings 3")
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ChatScreen2Preview() {
    MultipleBackStacksComposeTheme {
        val dummyNavController = rememberNavController()
        val viewModel = SettingsViewModel()

        Surface {
            SettingsScreen2(
                viewModel = viewModel,
                navController = dummyNavController
            )
        }
    }
}
