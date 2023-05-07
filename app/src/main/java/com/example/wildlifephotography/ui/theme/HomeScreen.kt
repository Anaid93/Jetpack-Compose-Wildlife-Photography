package com.example.wildlifephotography.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ImagesAndText(
    title:Int,
    artist:Int,
    drawableResourse: Int,
    onButtonClickNext: () -> Unit,
    onButtonClickPrev: () -> Unit,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxHeight()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    )
    {
        Photos(drawableResourse)

        ArtworkTitleArtist(title, artist)

        ButtonArtSpace(onButtonClickNext, onButtonClickPrev)
    }

}

@Composable
fun Photos(
    drawableResourse: Int,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier
        .border(width = 3.dp, color = Color.Gray),
        elevation = 8.dp) {
        Image(
            painter = painterResource(drawableResourse),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.padding(40.dp)
        )
    }
}

@Composable
fun ArtworkTitleArtist(
    title:Int,
    artist:Int,
    modifier: Modifier = Modifier
)
{
    Column(
        modifier = modifier
            .shadow(elevation = 3.dp)
            .padding(16.dp)
    ) {
        Text(
            text = stringResource(title),
            fontSize = 24.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(artist),
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif
        )

    }
}

@Composable
fun ButtonArtSpace(
    onButtonClickNext: () -> Unit,
    onButtonClickPrev: () -> Unit,
    modifier: Modifier = Modifier
){
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center)
    {
        Button(onClick =  onButtonClickPrev ,
            modifier = modifier.width(120.dp)) {
            Text(text = "Previous")
        }
        Spacer(modifier = modifier.width(20.dp))
        Button(onClick =  onButtonClickNext ,
            modifier = modifier.width(120.dp)) {
            Text(text = "Next")
        }
    }
}