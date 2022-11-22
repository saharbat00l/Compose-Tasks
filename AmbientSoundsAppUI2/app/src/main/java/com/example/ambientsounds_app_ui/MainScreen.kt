package com.example.ambientsounds_app_ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(navController: NavController){
    
    Scaffold(backgroundColor = MaterialTheme.colors.primary) {
        //background circles and bg color. purple one
        bgShapes()
        //white card and content inside
        contentCard()

    }

}

@Composable
fun bgShapes(){
    Row(
        Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center
    ) {
        val columnPaddingY = 50.dp
        val columnPaddingX = 80.dp
        val columnpaddingY = 80.dp
        val columnpaddingX = 80.dp
        Image(
            painter = painterResource(id = R.drawable.pink),
            contentDescription = null,
            Modifier
                .size(200.dp)
                .offset(y = -columnPaddingY)
                .offset(x = -columnPaddingX)
                .padding(0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.blue),
            contentDescription = null,
            Modifier
                .size(450.dp)
                .offset(y = -columnpaddingY)
                .offset(x = columnpaddingX)
                .padding(0.dp)
        )
    }
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

//@OptIn(ExperimentalMaterialApi::class)
@Composable
fun contentCard(){
    Card(
        Modifier
            .padding(0.dp)
            .padding(top = 250.dp),
        shape = RoundedCornerShape(32.dp),
        backgroundColor = MaterialTheme.colors.background) {

        Column(
            Modifier
                .fillMaxWidth()
                .padding(32.dp),
            Arrangement.Center
        ) {

            //Slider to be replaced
            Text(text = "Space for You",
                fontWeight = FontWeight.Bold, fontSize = 32.sp,
                color = Color.Black,
                modifier = Modifier.align(CenterHorizontally),
                textAlign = TextAlign.Center
                )

            Column(Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top) {

//                Spacer(modifier = Modifier.height(0.dp))

                MainImage()

                Spacer(modifier = Modifier.height(0.dp))


                Text(text = "\"My favorite sounds are the high, spacey ones that are very ambient.\" ",
                    color = Color.Black,
                    textAlign = TextAlign.Center)
                Text(text = " ~ Andy Summers",
                    color = Color.Black,
                    textAlign = TextAlign.Center)

                buttonFilled("SIGN UP")
                buttonLined( "LOG IN")




            }
        }
        
    }
}

@Composable
fun buttonFilled(text: String){
    lateinit var navController:NavController
    Button(
        //navigation code
        onClick = {
            navController.navigate(Screen.SignUpScreen.route)
        },
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 70.dp),
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
fun buttonLined(text: String){
    Button(
        onClick = {},
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
        border = BorderStroke(2.dp, Color.Black),
        colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
            backgroundColor = Color.White),
        elevation = null
    ) {
        Text(
            text = text,
            fontSize = 17.sp,
            modifier = Modifier.padding(horizontal = 30.dp, vertical = 6.dp)
        )
    }
}

@Composable
fun MainImage(){
    Image(painter = painterResource(id = R.drawable.ambience),
        contentDescription = null,
        Modifier.size(180.dp)
    )
}




@Preview
@Composable
fun Preview(){
    MainScreen(navController = rememberNavController())
}