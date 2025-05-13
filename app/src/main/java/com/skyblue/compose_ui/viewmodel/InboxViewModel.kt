package com.skyblue.compose_ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.skyblue.compose_ui.model.Inbox
import com.skyblue.compose_ui.model.User
import com.skyblue.compose_ui.repository.InboxRepository
import kotlinx.coroutines.launch

class InboxViewModel : ViewModel() {
    private val repository = InboxRepository()

    private val _inbox = MutableLiveData<List<Inbox>>()
    val inbox: LiveData<List<Inbox>> = _inbox

    fun fetchInbox(user: User) {
        viewModelScope.launch {
            try {
                val inbox = repository.getInbox(user)
                Log.e("err__", inbox.toString())
                _inbox.value = listOf(inbox)
            } catch (e: Exception) {
                // Handle error
                Log.e("err__", e.message.toString())
            }
        }
    }
}