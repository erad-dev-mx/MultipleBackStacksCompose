package dev.erad.multiplebackstackscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dev.erad.multiplebackstackscompose.ui.chat.screens.ChatScreen1
import dev.erad.multiplebackstackscompose.ui.chat.screens.ChatScreen2
import dev.erad.multiplebackstackscompose.ui.chat.screens.ChatScreen3
import dev.erad.multiplebackstackscompose.ui.chat.screens.ChatScreen4
import dev.erad.multiplebackstackscompose.ui.chat.screens.ChatScreen5
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
import dev.erad.multiplebackstackscompose.ui.navigation.RootNavigation
import dev.erad.multiplebackstackscompose.ui.settings.screens.SettingsScreen1
import dev.erad.multiplebackstackscompose.ui.settings.screens.SettingsScreen2
import dev.erad.multiplebackstackscompose.ui.settings.screens.SettingsScreen3
import dev.erad.multiplebackstackscompose.ui.settings.screens.SettingsScreen4
import dev.erad.multiplebackstackscompose.ui.settings.screens.SettingsScreen5
import dev.erad.multiplebackstackscompose.ui.theme.MultipleBackStacksComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MultipleBackStacksComposeTheme {
                RootNavigation()
            }
        }
    }
}
