package com.example.signinui

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Arrangement.End
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.signinui.ui.theme.gradient1
import com.example.signinui.ui.theme.gradient2

@Composable
fun MainScreen(modifier:Modifier=Modifier){

    Column() {

        Row() {
            val columnPaddingY = 20.dp
            val columnPaddingX = 10.dp
            Image(
                painterResource(R.drawable.image2),
                contentDescription = null,
                Modifier
                    .size(210.dp)
//                    .align(Alignment.End)
            )
            Image(
                painterResource(R.drawable.image1),
                contentDescription = null,
                Modifier
                    .size(180.dp)
//                    .align(Alignment.End)
                    .offset(y = -columnPaddingY)
                    .offset(x = columnPaddingX)
            )
        }


        Column(modifier = Modifier.padding(60.dp, 10.dp)) {
            Text(
                text = "Create Account",
                modifier = modifier.padding(top = 0.dp),
                style = MaterialTheme.typography.h1,
                fontSize = 35.sp
            )

            Spacer(modifier = Modifier.height(30.dp))


            InputTextField(label = "Full Name")
            InputTextField(label = "Email")
            InputTextField(label = "Password")
            InputTextField(label = "Confirm Password")




            GradientButton(
                text = "Continue", textColor = Color.White,
                gradient = Brush.horizontalGradient(colors = listOf(gradient1, gradient2))
            ) {}

            Row(modifier = Modifier.align(CenterHorizontally)) {
                Text(
                    text = "Already have an account?",
                    color = MaterialTheme.colors.primary,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(top = 50.dp)
                )
//          ClickableText(text = AnnotatedString("LogIn"), onClick = {},
////              color = MaterialTheme.colors.primary,
////              fontWeight = FontWeight.SemiBold,
//              modifier = Modifier
//                  .padding(top = 50.dp))
                Text(
                    text = "LogIn",
                    color = MaterialTheme.colors.secondaryVariant,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .padding(horizontal = 10.dp)
                )
            }
        }
    }
}

@Composable
fun InputTextField(
    label:String,
    modifier: Modifier = Modifier
){

    OutlinedTextField(value = "", onValueChange = {},
        label = { Text(text = label,
            style = TextStyle(color = MaterialTheme.colors.primary,)
        ) },
        colors = TextFieldDefaults.outlinedTextFieldColors
            (unfocusedBorderColor = Color.Gray),
        placeholder = {
            Text(
                "",
            style = TextStyle(color = MaterialTheme.colors.secondary)
        )
        }
    )

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

