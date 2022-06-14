package com.nahuel.primercompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nahuel.primercompose.ui.theme.PrimerComposeTheme



data class Recipe(@DrawableRes val imageResource: Int, val title:String, val ingredients: List<String>)

val recipeList = listOf(Recipe(R.drawable.imagen,"titulo", listOf("ingrediente1","ingrediente2","ingrediente3")),
    Recipe(R.drawable.imagen,"titulo", listOf("ingrediente1a","ingrediente2a","ingrediente3a")),
    Recipe(R.drawable.imagen,"titulo", listOf("ingrediente1b","ingrediente2b","ingrediente3b")),
    Recipe(R.drawable.imagen,"titulo", listOf("ingrediente1c","ingrediente2c","ingrediente3c")),
    Recipe(R.mipmap.ic_launcher,"titulo", listOf("ingrediente1d","ingrediente2d","ingrediente3d"))
)

@Composable
private fun RecipeCard(recipe:Recipe){
    val image = painterResource(id = R.drawable.imagen)
    Card(shape= RoundedCornerShape(8.dp), elevation = 8.dp, modifier = Modifier.padding(8.dp)){
        Column(modifier = Modifier.padding(16.dp)) {
            val imageModifier = Modifier
                .requiredHeight(150.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(8.dp))
            Image(painter = image, modifier = imageModifier, contentScale = ContentScale.Crop, contentDescription = "Foto de la receta")
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = recipe.title, style = MaterialTheme.typography.h4)
            for ( ingredient in recipe.ingredients){
                Text(text="* $ingredient", style = MaterialTheme.typography.h6)
            }
        }
    }
}

@Composable
private fun RecipeColumnList(recipeList: List<Recipe>){
    LazyColumn{
        items(recipeList){ recipe ->
            RecipeCard(recipe = recipe)
        }
    }
}

//LazyRow lista horizontal



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //NewsStory()
            RecipeColumnList(recipeList = recipeList)
        }
    }
}


/**
@Preview
@Composable
private fun PreviewNewsStory() {
    RecipeCard(recipeList[3])

}*/

















/**
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

@Preview
@Composable
private fun PreviewNewsStory() {
NewsStory()
}*/