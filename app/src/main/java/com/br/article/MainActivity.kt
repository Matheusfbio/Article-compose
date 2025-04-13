package com.br.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                ArticleTheme {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            ArticleApp()
                        }
                    }
                }
            }
        }


@Composable
fun ArticleApp() {
    ArticleCard(
        title = stringResource(R.string.jetpack_compose_Title),
        shortDescription = stringResource(R.string.jetpack_compose_Short_Description),
        lognDescription = stringResource(R.string.jetpack_compose_Long_Description),
        imagePainter = painterResource(R.drawable.android_compose_image)
    )
}

@Composable
private fun ArticleCard(
    title: String,
    shortDescription: String,
    lognDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = Modifier) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = stringResource(R.string.jetpack_compose_Title),
            fontSize = 29.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.jetpack_compose_Short_Description),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.jetpack_compose_Long_Description),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ArticleTheme {
        ArticleApp()
    }
}