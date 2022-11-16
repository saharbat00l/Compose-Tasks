package com.example.loginui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginui.ui.theme.LogInUITheme
import com.example.loginui.ui.theme.gradient1
import com.example.loginui.ui.theme.gradient2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LogInUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainPage()
                }
            }
        }
    }
}

@Composable
fun MainPage(modifier:Modifier=Modifier){

    Column(modifier = Modifier.padding(60.dp, 20.dp)) {

        Image(painterResource(R.drawable.image),
            contentDescription = null,
            Modifier
                .size(180.dp)
                .align(Alignment.CenterHorizontally)
            )
        
        Text(text = "Login",
            modifier = modifier,
            style = MaterialTheme.typography.h1)
        Text(text = "Please sign in to continue.",
            color = MaterialTheme.colors.primary,
            fontWeight = FontWeight.SemiBold)
        
        Spacer(modifier = Modifier.height(50.dp))


        InputTextField(label = "Email")
        InputTextField(label = "Password")


        GradientButton(
            text = "Continue", textColor = Color.White,
            gradient = Brush.horizontalGradient(colors = listOf(gradient1, gradient2))
            ){}

    }

}

@Composable
fun InputTextField(
    label:String,
    modifier: Modifier=Modifier
){

    OutlinedTextField(value = "", onValueChange = {},
        label = { Text(text = label,
            style = TextStyle(color = MaterialTheme.colors.primary,)) },
        colors = TextFieldDefaults.outlinedTextFieldColors
            (unfocusedBorderColor = Gray),
        placeholder = {Text(stringResource(R.string.placeholder2),
            style = TextStyle(color = MaterialTheme.colors.secondary)
        )}
    )

}


@Composable
fun GradientButton(){

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
        shape = RoundedCornerShape(50.dp)
    ) {

        Box(modifier = Modifier
            .background(gradient)
            .padding(20.dp, 12.dp)
        ){

            Text(text = text, color = textColor)
        }
    }
}




@Preview(showBackground = true)
@Composable
fun MainPreview(){
    MainPage()
}
@Preview(showBackground = true)
@Composable
fun inputPreview(){
    InputTextField(label = "Previewing..")
}
