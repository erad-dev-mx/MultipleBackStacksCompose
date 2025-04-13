package dev.erad.multiplebackstackscompose.ui.chat

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.erad.multiplebackstackscompose.ui.chat.screens.ChatScreen1
import dev.erad.multiplebackstackscompose.ui.chat.screens.ChatScreen2
import dev.erad.multiplebackstackscompose.ui.chat.screens.ChatScreen3
import dev.erad.multiplebackstackscompose.ui.chat.screens.ChatScreen4
import dev.erad.multiplebackstackscompose.ui.chat.screens.ChatScreen5

@Composable
fun ChatNavHost() {
    val chatNavController = rememberNavController()

    NavHost(chatNavController, startDestination = "chat1") {
        composable("chat1") { ChatScreen1(navController = chatNavController) }
        composable("chat2") { ChatScreen2(navController = chatNavController) }
        composable("chat3") { ChatScreen3(navController = chatNavController) }
        composable("chat4") { ChatScreen4(navController = chatNavController) }
        composable("chat5") { ChatScreen5(navController = chatNavController) }
    }
}