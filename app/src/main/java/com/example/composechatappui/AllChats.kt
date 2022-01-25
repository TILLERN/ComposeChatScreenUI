package com.example.composechatappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun AllChats(){
     MessageCard()
}

@Composable
fun MessageCard(){
    Row(modifier = Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.blueavatar),
            contentDescription = "my image",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column(modifier = Modifier.padding(all = 5.dp)) {
            Text(text = "Chat Name")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Hey this is my message to you uuuu!")
        }
    }
}