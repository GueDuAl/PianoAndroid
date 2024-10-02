package com.example.pianoalvaroguerrero

import android.content.Context
import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pianoalvaroguerrero.ui.theme.PianoAlvaroGuerreroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        enableEdgeToEdge()
        setContent {
            PianoAlvaroGuerreroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Piano() {
    val context = LocalContext.current
    Row {
        Column(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Black)
        ) {

            Box(
                Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .weight(1f)
                    .padding(4.dp)
                    .clickable { playSound(context, R.raw.doo) },
                contentAlignment = Alignment.Center
            ) {
                Text("", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            }

            Box(
                Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
                    .weight(1f)
                    .padding(4.dp)
                    .clickable { playSound(context, R.raw.re) },
                contentAlignment = Alignment.Center
            ) {
                Text("", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            }

            Box(
                Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .weight(1f)
                    .padding(4.dp)
                    .clickable { playSound(context, R.raw.mi) },
                contentAlignment = Alignment.Center
            ) {
                Text("", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            }

            Box(
                Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
                    .weight(1f)
                    .padding(4.dp)
                    .clickable { playSound(context, R.raw.fa) },
                contentAlignment = Alignment.Center
            ) {
                Text("", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            }

            Box(
                Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .weight(1f)
                    .padding(4.dp)
                    .clickable { playSound(context, R.raw.sol) },
                contentAlignment = Alignment.Center
            ) {
                Text("", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            }

            Box(
                Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
                    .weight(1f)
                    .padding(4.dp)
                    .clickable { playSound(context, R.raw.la) },
                contentAlignment = Alignment.Center
            ) {
                Text("", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            }

            Box(
                Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .weight(1f)
                    .padding(4.dp)
                    .clickable { playSound(context, R.raw.si) },
                contentAlignment = Alignment.Center
            ) {
                Text("", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            }
        }
        Column(Modifier.fillMaxWidth().background(Color.Black).weight(1f)) {
            Box(Modifier.fillMaxHeight()) {
                Image(
                    painter = painterResource(id = R.drawable.skin),
                    contentDescription = "Parte superior del piano",
                    modifier = Modifier.fillMaxHeight().size(200.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}
fun playSound(context: Context, soundId: Int) {
    val mediaPlayer = MediaPlayer.create(context, soundId)
    mediaPlayer.setVolume(1.0f, 1.0f)
    mediaPlayer.start()
    mediaPlayer.setOnCompletionListener {
        mediaPlayer.release()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Piano()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PianoAlvaroGuerreroTheme {
        Greeting("Android")
    }
}
