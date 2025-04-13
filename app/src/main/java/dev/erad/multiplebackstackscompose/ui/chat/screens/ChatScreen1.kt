package dev.erad.multiplebackstackscompose.ui.chat.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import dev.erad.multiplebackstackscompose.ui.chat.ChatViewModel
import dev.erad.multiplebackstackscompose.ui.theme.MultipleBackStacksComposeTheme

@Composable
fun ChatScreen1(
    modifier: Modifier = Modifier,
    viewModel: ChatViewModel = viewModel(),
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
            text = "Chat Screen 1",
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
                onClick = { navController.navigate("chat2") }
            ) {
                Text("Go to Chat 2")
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ChatScreen1Preview() {
    MultipleBackStacksComposeTheme {
        val dummyNavController = rememberNavController()
        val viewModel = ChatViewModel()

        Surface {
            ChatScreen1(
                viewModel = viewModel,
                navController = dummyNavController
            )
        }
    }
}

