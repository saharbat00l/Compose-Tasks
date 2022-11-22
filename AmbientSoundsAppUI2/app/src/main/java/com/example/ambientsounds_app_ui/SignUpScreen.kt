package com.example.ambientsounds_app_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SignUpScreen(navController: NavController){
    Scaffold(backgroundColor = MaterialTheme.colors.onBackground) {

        backgroundObjs()

        SignUpCard()

    }

}


@Composable
fun SignUpCard(){
    Card(
        Modifier
            .padding(0.dp)
            .padding(top = 250.dp),
        shape = RoundedCornerShape(32.dp),
        backgroundColor = MaterialTheme.colors.background) {

        Column(
            Modifier
                .fillMaxWidth()
                .padding(26.dp, 32.dp),
            Arrangement.Center
        ) {

            //Slider to be replaced
            Text(text = "Sign Up",
                fontWeight = FontWeight.ExtraBold, fontSize = 30.sp,
                color = Color.Black,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center)

            Column(Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top) {

                Spacer(modifier = Modifier.height(30.dp))

                textField(text = "Full Name")
                textField(text = "Phone Number")
                textField(text = "Email Id")
                textField(text = "Password")

                createButton("CREATE ACCOUNT")
            }
        }

    }
}

@Composable
fun createButton(text: String){
    Button(
        onClick = {},
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp),
//        border = BorderStroke(3.dp, Color.Red),
        elevation = null,
        colors = ButtonDefaults.buttonColors(contentColor = Color.White,
            backgroundColor = Color.Black)
    ) {
        Text(
            text = text,
            fontSize = 17.sp,
            modifier = Modifier.padding(horizontal = 30.dp, vertical = 6.dp)
        )
    }
}

@Composable
fun backgroundObjs(){
    
    val negativepaddingPink = 52.dp
    val negativepaddingYPurple = 42.dp
    val negativepaddingBlue = 30.dp

    Image(painter = painterResource(id = R.drawable.bluew),
        contentDescription =null,
       modifier= Modifier
           .size(400.dp)
           .padding(bottom = 0.dp)
           .offset(y = -negativepaddingBlue)
        )
    Image(painter = painterResource(id = R.drawable.pinkw),
        contentDescription =null,
        modifier= Modifier
            .size(400.dp)
            .padding(bottom = 160.dp, top = 0.dp)
            .offset(y = -negativepaddingPink)
    )
    Image(painter = painterResource(id = R.drawable.purple),
        contentDescription =null,
        modifier= Modifier
            .size(400.dp)
            .padding(bottom = 90.dp)
            .offset(y = -negativepaddingYPurple)
    )
    Column(modifier = Modifier.fillMaxWidth(),
        Arrangement.Center
    ) {
        Text(text = "AmouSphere",
        fontWeight = FontWeight.W900,
        fontSize = 50.sp,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(top = 75.dp)
        )

        Text(text = "Listen-Work-Relax",
            fontWeight = FontWeight.Light,
            fontSize = 19.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)
//                .padding(top = .dp)
        )
    }
}

@Composable
fun textField(text:String){
//i cant believe myself
    OutlinedTextField(
        value = "", onValueChange = {},
        placeholder = { Text(text = text,
            color = MaterialTheme.colors.secondaryVariant)},
//        label = { Text(text = "TextField", color = MaterialTheme.colors.secondaryVariant) },
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 0.dp)
            .padding(top = 15.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = MaterialTheme.colors.secondaryVariant,
            focusedBorderColor = MaterialTheme.colors.secondaryVariant ,
            textColor = MaterialTheme.colors.secondaryVariant))
}


@Preview
@Composable
fun PreviewScreen(){
    SignUpScreen(navController = rememberNavController())

}
