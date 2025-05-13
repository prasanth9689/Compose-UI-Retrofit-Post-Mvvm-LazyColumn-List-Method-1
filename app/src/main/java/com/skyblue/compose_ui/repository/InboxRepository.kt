package com.skyblue.compose_ui.repository

import com.skyblue.compose_ui.model.Inbox
import com.skyblue.compose_ui.model.User
import com.skyblue.compose_ui.retrofit.RetrofitInstance

class InboxRepository {
    private val inboxService = RetrofitInstance.inboxService

    suspend fun getInbox(user: User): Inbox {

        return inboxService.getInbox(user)
    }
}