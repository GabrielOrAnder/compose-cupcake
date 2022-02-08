package com.example.composecupcake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composecupcake.ui.theme.ComposeCupcakeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCupcakeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MessageCard(
                        msg = Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!")
                    )
                }
            }
        }
    }
}

data class Message(val author:String, val body:String)

@Composable
fun MessageCard(msg: Message) {
    Column{
        Text(text = msg.author)
        Text(text = msg.body)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!")
    )
}

//https://www.jetpackcompose.app/What-is-the-equivalent-of-ScrollView-in-Jetpack-Compose