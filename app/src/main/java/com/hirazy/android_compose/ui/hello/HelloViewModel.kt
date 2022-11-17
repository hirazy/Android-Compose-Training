package com.hirazy.android_compose.ui.hello

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine

/**
 * UiState for the Hello Screen
 */
data class HelloState(
    val id: String = ""
)

class HelloViewModel (): ViewModel() {


//    val uiState: StateFlow<HelloState> = combine(
//        _userMessage, _isLoading, _isTaskDeleted, _taskAsync
//    ) { userMessage, isLoading, isTaskDeleted, taskAsync ->
//        when (taskAsync) {
//            Async.Loading -> {
//                TaskDetailUiState(isLoading = true)
//            }
//            is Async.Success -> {
//                HelloState(
//                    id = "1"
//                )
//            }
//        }
//    }
//        .stateIn(
//            scope = viewModelScope,
//        )

}