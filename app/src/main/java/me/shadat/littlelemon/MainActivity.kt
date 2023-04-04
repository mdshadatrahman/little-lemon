package me.shadat.littlelemon


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var count by rememberSaveable() {
                mutableStateOf(0)
            }
//            UpperPanel()
            ItemOrder(count, { count++ }, { count-- })
        }
    }

    @Composable
    private fun ItemOrder(count: Int, onIncrement: () -> Unit, onDecrement: () -> Unit) {


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(text = "Greek Salad", fontSize = 30.sp)
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { onDecrement() }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "remove")
                }

                Text(
                    text = "$count",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp),
                )

                IconButton(onClick = { onIncrement() }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "add")
                }
            }
        }
    }
}
