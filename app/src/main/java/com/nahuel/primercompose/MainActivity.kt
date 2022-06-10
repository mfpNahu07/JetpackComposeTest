package com.nahuel.primercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nahuel.primercompose.ui.theme.PrimerComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}


@Composable
private fun NewsStory() {
    Column(modifier = Modifier.padding(16.dp)) {
        // Add padding around our message
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                //no me esta dejando usar mipmap
                painter = painterResource(R.drawable.imagen),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(40.dp)
                    // Clip image to be shaped as a circle
                    .clip(CircleShape)
            )


        }
        Text(text = "Titulo")
        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Descripción")
        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Pie")
    }
}
/**
@Preview
@Composable
private fun PreviewNewsStory() {
NewsStory()
}*/