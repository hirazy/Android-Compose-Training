package com.hirazy.android_compose.ui.home

import androidx.lifecycle.ViewModel

sealed interface HomeUiState {
    val isLoading: Boolean
}

class HomeViewModel() : ViewModel() {
}