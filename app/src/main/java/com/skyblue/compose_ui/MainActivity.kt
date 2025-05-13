package com.skyblue.compose_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.skyblue.compose_ui.ui.theme.ComposeUIPostMvvmRetrofitMethod1Theme
import com.skyblue.compose_ui.viewmodel.InboxViewModel
import com.skyblue.compose_ui.views.InboxMainScreen

class MainActivity : ComponentActivity() {
    private val viewModel: InboxViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeUIPostMvvmRetrofitMethod1Theme {
                InboxMainScreen(viewModel)
            }
        }
    }
}

