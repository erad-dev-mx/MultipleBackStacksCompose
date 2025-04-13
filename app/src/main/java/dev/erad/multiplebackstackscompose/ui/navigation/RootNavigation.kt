package dev.erad.multiplebackstackscompose.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dev.erad.multiplebackstackscompose.ui.chat.ChatNavHost
import dev.erad.multiplebackstackscompose.ui.home.HomeNavHost
import dev.erad.multiplebackstackscompose.ui.settings.SettingsNavHost

@Composable
fun RootNavigation() {
    val rootNavController = rememberNavController()
    val navBackStackEntry by rootNavController.currentBackStackEntryAsState()

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEach { item ->
                    val isSelected =
                        item.title.lowercase() == navBackStackEntry?.destination?.route
                    NavigationBarItem(
                        selected = isSelected,
                        label = { Text(text = item.title) },
                        icon = {
                            Icon(
                                imageVector = if (isSelected) {
                                    item.selectedIcon
                                } else {
                                    item.unselectedIcon
                                },
                                contentDescription = item.title
                            )
                        },
                        onClick = {
                            rootNavController.navigate(item.title.lowercase()) {
                                popUpTo(rootNavController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { padding ->
        NavHost(
            rootNavController,
            startDestination = "home",
            modifier = Modifier.padding(padding)
        ) {
            composable("home") { HomeNavHost() }
            composable("chat") { ChatNavHost() }
            composable("settings") { SettingsNavHost() }
        }
    }

}