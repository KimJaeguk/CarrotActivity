package com.example.carrotactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carrotactivity.R.drawable
import com.example.carrotactivity.ui.theme.CarrotActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarrotProduct()
        }
    }
}

@Composable
fun CarrotProduct() {
    Surface(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .height(80.dp)
    ) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.carrot),
                    contentDescription = "판매할 물건"
                )
                Column {
                    Text(text = "판매할 물건", modifier = Modifier.padding(top = 4.dp))
                    Text(text = "지역", fontSize = 8.sp, modifier = Modifier.padding(top = 4.dp), color = Color.Gray)
                    Text(text = "가격", fontSize = 12.sp, modifier = Modifier.padding(top = 4.dp))


                }


            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainscreenPreview() {
    CarrotActivityTheme {
        CarrotProduct()
    }
}

