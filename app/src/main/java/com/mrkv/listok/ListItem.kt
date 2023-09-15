package com.mrkv.listok

data class ListItem(
    val id: String,
    val taskText: String,
    val taskImportance: String,
    val taskDeadline: String,
    val isDone: String,
    val taskCreateDate: String,
    val taskEditDate: String
)