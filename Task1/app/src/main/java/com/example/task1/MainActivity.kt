package com.example.task1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1.ui.theme.Task1Theme
import com.example.task1.ui.theme.green
import com.example.task1.ui.theme.lightGreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task1Theme {
                // A surface container using the 'background' color from the theme
              mainScreen()

            }
        }
    }
}

@Composable
fun mainScreen(modifier: Modifier=Modifier.fillMaxWidth()){

    Column(modifier.padding(20.dp)) {
        
        Row(modifier = Modifier.align(CenterHorizontally)) {
            SimpleButton(text = "Remove")
            
            GradientButton(
                text = "Add Record", textColor = MaterialTheme.colors.primary,
                gradient = Brush.linearGradient(colors = listOf(green, lightGreen))
            ) {}
        }
        
        YellowButton(text ="Next" ,
            textColor = Color.Black) {}

    }

}


@Composable
fun SimpleButton(text:String){
    Button(
        elevation =  ButtonDefaults.elevation(
            defaultElevation = 5.dp,
            pressedElevation = 15.dp,
            disabledElevation = 0.dp,
            hoveredElevation = 15.dp,
            focusedElevation = 10.dp),
        modifier = Modifier
            .height(48.dp)
            .width(130.dp),
        shape = CircleShape,
        onClick = {  },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White,
            contentColor = MaterialTheme.colors.secondary)
    ){
        Text(text = text, fontSize = 18.sp)
    }
}

@Composable
fun YellowButton(text:String,
           textColor: Color,
//           backgroundColor: Color,
           onClick: () -> Unit
){
    Button( elevation =  ButtonDefaults.elevation(
        defaultElevation = 5.dp,
        pressedElevation = 15.dp,
        disabledElevation = 0.dp,
        hoveredElevation = 15.dp,
        focusedElevation = 10.dp
    ), onClick = { },
        shape = CircleShape,
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.secondaryVariant,
            contentColor = Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
            .height(42.dp)
    )
    {
        Text(text = text, color=textColor, fontSize = 18.sp)
    }
    
}




@Composable
fun GradientButton(
    text: String,
    textColor:Color,
    gradient: Brush,
    onClick: ()->Unit,
){
    Spacer(modifier = Modifier.height(20.dp))
    Button(onClick = { onClick() },
//        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        contentPadding = PaddingValues(),
        shape = CircleShape
    ) {

        Box(modifier = Modifier
            .background(gradient)
            .padding(18.dp, 12.dp)
        ){

            Text(text = text, color = textColor, fontSize = 18.sp)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun ButtonPreview(){
    mainScreen()
}
