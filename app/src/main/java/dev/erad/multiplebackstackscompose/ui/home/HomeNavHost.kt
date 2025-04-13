package dev.erad.multiplebackstackscompose.ui.home

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.erad.multiplebackstackscompose.ui.home.screens.HomeScreen1
import dev.erad.multiplebackstackscompose.ui.home.screens.HomeScreen10
import dev.erad.multiplebackstackscompose.ui.home.screens.HomeScreen2
import dev.erad.multiplebackstackscompose.ui.home.screens.HomeScreen3
import dev.erad.multiplebackstackscompose.ui.home.screens.HomeScreen4
import dev.erad.multiplebackstackscompose.ui.home.screens.HomeScreen5
import dev.erad.multiplebackstackscompose.ui.home.screens.HomeScreen6
import dev.erad.multiplebackstackscompose.ui.home.screens.HomeScreen7
import dev.erad.multiplebackstackscompose.ui.home.screens.HomeScreen8
import dev.erad.multiplebackstackscompose.ui.home.screens.HomeScreen9

@Composable
fun HomeNavHost() {
    val homeNavController = rememberNavController()

    NavHost(homeNavController, startDestination = "home1") {
        composable("home1") { HomeScreen1(navController = homeNavController) }
        composable("home2") { HomeScreen2(navController = homeNavController) }
        composable("home3") { HomeScreen3(navController = homeNavController) }
        composable("home4") { HomeScreen4(navController = homeNavController) }
        composable("home5") { HomeScreen5(navController = homeNavController) }
        composable("home6") { HomeScreen6(navController = homeNavController) }
        composable("home7") { HomeScreen7(navController = homeNavController) }
        composable("home8") { HomeScreen8(navController = homeNavController) }
        composable("home9") { HomeScreen9(navController = homeNavController) }
        composable("home10") { HomeScreen10() }
    }
}