package com.skyblue.compose_ui.retrofit


import com.skyblue.compose_ui.model.Inbox
import com.skyblue.compose_ui.model.User
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface InboxService {
    @POST("mail.php")
    suspend fun getInbox(@Body user: User): Inbox
}