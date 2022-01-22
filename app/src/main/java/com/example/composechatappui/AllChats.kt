package com.example.composechatappui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable

@Composable
fun AllChats(messages:List<Message>){
    LazyColumn(content = ){
        items(messages){ message ->
            MessageCard(message)
        }
    }
}