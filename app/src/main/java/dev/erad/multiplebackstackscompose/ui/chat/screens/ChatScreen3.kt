package dev.erad.multiplebackstackscompose.ui.chat.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
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
fun ChatScreen3(
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
            text = "Chat Screen 3",
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
                onClick = { navController.navigate("chat4") }
            ) {
                Text("Go to Chat 4")
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ChatScreen3Preview() {
    MultipleBackStacksComposeTheme {
        val dummyNavController = rememberNavController()
        val viewModel = ChatViewModel()

        Surface {
            ChatScreen3(
                viewModel = viewModel,
                navController = dummyNavController
            )
        }
    }
}
