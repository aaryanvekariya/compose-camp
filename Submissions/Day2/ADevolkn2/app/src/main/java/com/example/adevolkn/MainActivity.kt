package com.example.adevolkn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.adevolkn.ui.theme.ADevolknTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ADevolknTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ADevolknTheme {

        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
        Column(
           horizontalAlignment =  Alignment.CenterHorizontally,

        )  {
            Text(text = "Name")
            Image(painter = painterResource(id = R.drawable.jetpack), contentDescription = "content",
             modifier = Modifier.size(100.dp))
            Text(text = "compose")
            Image(painter = painterResource(id = R.drawable.myheart), contentDescription = "heart",
            modifier = Modifier.size(150.dp))

        }
     }
    }
}











