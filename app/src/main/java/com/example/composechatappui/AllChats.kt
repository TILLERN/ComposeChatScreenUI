package com.example.composechatappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composechatappui.ui.theme.ComposeChatAppUITheme

@Composable
fun AllChats(){
    ComposeChatAppUITheme{
        MessageCard()
    }
}

@Composable
fun MessageCard(){
    androidx.compose.material.Surface(
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colors.surface,
        elevation = 2.dp,
        modifier = Modifier.fillMaxWidth(),
    ) {
        Row(modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.blueavatar),
                contentDescription = "my image",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column(modifier = Modifier.padding(all = 5.dp)) {
                Text(
                    text = "Chat Name",
                    color = MaterialTheme.colors.secondary,
                    style = MaterialTheme.typography.subtitle2,
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Hey this is my message to you uuuu!",
                    color = MaterialTheme.colors.primary,
                    style = MaterialTheme.typography.body2,
                )
            }
        }
    }
}