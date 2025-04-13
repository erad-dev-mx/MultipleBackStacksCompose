package dev.erad.multiplebackstackscompose.ui.settings

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SettingsViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(SettingsUiState())
    val uiState = _uiState.asStateFlow()
}

data class SettingsUiState(
    val isLoading: Boolean = false,
    val error: String? = null
)
