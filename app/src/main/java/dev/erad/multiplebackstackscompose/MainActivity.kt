package dev.erad.multiplebackstackscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.erad.multiplebackstackscompose.ui.navigation.RootNavigation
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
