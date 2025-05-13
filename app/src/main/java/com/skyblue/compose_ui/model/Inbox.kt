package com.skyblue.compose_ui.model

data class Inbox(
    val status: String,
    val message: String,

    val emails: List<Email>? = null
)