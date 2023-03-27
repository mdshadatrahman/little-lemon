package me.shadat.littlelemon

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UpperPanel() {
    val context = LocalContext.current
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color(0xFF495E57)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
        Text(
            text = stringResource(id = R.string.chicago),
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.padding(start = 20.dp)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.Start,
        ) {
            Text(
                text = stringResource(id = R.string.description_one),
                Modifier.width(200.dp),
                color = Color.White,
                fontSize = 21.sp,

                )
            Image(
                painter = painterResource(id = R.drawable.restaurant),
                contentDescription = "",
                Modifier
                    .height(200.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
        }
        Button(
            onClick = {
                Toast.makeText(context, "Order Successful!" , Toast.LENGTH_SHORT).show()
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(horizontal = 20.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF4CE14))
        ) {
            Text(
                text = stringResource(id = R.string.order_take_away),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333)
            )
        }
    }
}

@Preview
@Composable
fun DemoPreview() {
    UpperPanel()
}