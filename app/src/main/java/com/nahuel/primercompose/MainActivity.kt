package com.nahuel.primercompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
                    .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
            )


        }
        Text(
            text = "Titulo",
            style = MaterialTheme.typography.h2
        )
        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Descripción", style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(4.dp))

        Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
            Text(text = "Pie", style = MaterialTheme.typography.body1)
        }
    }
}
/**
@Preview
@Composable
private fun PreviewNewsStory() {
NewsStory()
}*/