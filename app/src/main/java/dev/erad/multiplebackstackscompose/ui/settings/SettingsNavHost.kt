package dev.erad.multiplebackstackscompose.ui.settings

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.erad.multiplebackstackscompose.ui.settings.screens.SettingsScreen1
import dev.erad.multiplebackstackscompose.ui.settings.screens.SettingsScreen2
import dev.erad.multiplebackstackscompose.ui.settings.screens.SettingsScreen3
import dev.erad.multiplebackstackscompose.ui.settings.screens.SettingsScreen4
import dev.erad.multiplebackstackscompose.ui.settings.screens.SettingsScreen5

@Composable
fun SettingsNavHost() {
    val settingsNavController = rememberNavController()

    NavHost(settingsNavController, startDestination = "settings1") {
        composable("settings1") { SettingsScreen1(navController = settingsNavController) }
        composable("settings2") { SettingsScreen2(navController = settingsNavController) }
        composable("settings3") { SettingsScreen3(navController = settingsNavController) }
        composable("settings4") { SettingsScreen4(navController = settingsNavController) }
        composable("settings5") { SettingsScreen5(navController = settingsNavController) }
    }
}