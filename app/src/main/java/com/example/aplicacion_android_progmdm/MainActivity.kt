package com.example.aplicacion_android_progmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplicacion_android_progmdm.ui.theme.Aplicacion_Android_ProgMDMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aplicacion_Android_ProgMDMTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                   /* Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    */
                    Box(modifier = Modifier.padding(innerPadding))
                    RecetaCard()
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}



@Composable
fun RecetaCard(){


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart

    ) {
        Card (
            modifier = Modifier
                .width(180.dp)
                .padding(8.dp)

                .height(270.dp),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White

        )

        ){
            Column (modifier = Modifier.fillMaxSize()){

                // añadimos una imagen
                Image(
                    painter = painterResource(id = R.drawable.espaguetis_con_tomate_),
                    contentDescription = "Imagen de la receta, spaguetiis con tomate",
                    modifier = Modifier
                        .height(120.dp) //  tamaño de la altura de la imagen
                        .fillMaxSize(), // que la imagen ocupe todo
                    contentScale = androidx.compose.ui.layout.ContentScale.Crop // Para que la imagen se adapte bien

                )

                Text(
                    text = "Spaguettis con tomate",
                    fontSize = 18.sp, // tamaño de la letra
                    color = Color.Black, // color de la letra
                    modifier = Modifier.padding(10.dp)

                )
                Text(
                    text= "Pasos de la receta",
                    fontSize = 13.sp, // tamaño de la letra
                    color = Color.Black, // color de la letra
                    modifier = Modifier.padding(6.dp)

                )

            }

    }


    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopEnd

    ) {
        Card (
            modifier = Modifier
                .width(180.dp)
                .padding(8.dp)

                .height(270.dp),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White

            )

        ){
            Column (modifier = Modifier.fillMaxSize()){

                // añadimos una imagen
                Image(
                    painter = painterResource(id = R.drawable.flan_frances),
                    contentDescription = "Imagen de la receta, spaguetiis con tomate",
                    modifier = Modifier
                        .height(120.dp) //  tamaño de la altura de la imagen
                        .fillMaxSize(), // que la imagen ocupe todo
                    contentScale = androidx.compose.ui.layout.ContentScale.Crop // Para que la imagen se adapte bien

                )

                Text(
                    text = "Flán frances",
                    fontSize = 18.sp, // tamaño de la letra
                    color = Color.Black, // color de la letra
                    modifier = Modifier.padding(10.dp)

                )
                Text(
                    text= "Pasos de la receta",
                    fontSize = 13.sp, // tamaño de la letra
                    color = Color.Black, // color de la letra
                    modifier = Modifier.padding(6.dp)

                )

            }

        }




    }




    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.CenterStart

    ) {
        Card (
            modifier = Modifier
                .width(180.dp)
                .padding(8.dp)

                .height(270.dp),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White

            )

        ){
            Column (modifier = Modifier.fillMaxSize()){

                // añadimos una imagen
                Image(
                    painter = painterResource(id = R.drawable.tarta_de_queso_japonesa),
                    contentDescription = "Imagen de la receta, spaguetiis con tomate",
                    modifier = Modifier
                        .height(120.dp) //  tamaño de la altura de la imagen
                        .fillMaxSize(), // que la imagen ocupe todo
                    contentScale = androidx.compose.ui.layout.ContentScale.Crop // Para que la imagen se adapte bien

                )

                Text(
                    text = "Tarta de queso japonesa",
                    fontSize = 18.sp, // tamaño de la letra
                    color = Color.Black, // color de la letra
                    modifier = Modifier.padding(10.dp)

                )
                Text(
                    text= "Pasos de la receta",
                    fontSize = 13.sp, // tamaño de la letra
                    color = Color.Black, // color de la letra
                    modifier = Modifier.padding(6.dp)

                )

            }

        }


    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.CenterEnd

    ) {
        Card (
            modifier = Modifier
                .width(180.dp)
                .padding(8.dp)
                .height(270.dp),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White

            )

        ){
            Column (modifier = Modifier.fillMaxSize()){

                // añadimos una imagen
                Image(
                    painter = painterResource(id = R.drawable.pastel_de_viento_helado),
                    contentDescription = "Imagen de la receta, spaguetiis con tomate",
                    modifier = Modifier
                        .height(120.dp) //  tamaño de la altura de la imagen
                        .fillMaxSize(), // que la imagen ocupe todo
                    contentScale = androidx.compose.ui.layout.ContentScale.Crop // Para que la imagen se adapte bien

                )

                Text(
                    text = "Titulo de la receta",
                    fontSize = 18.sp, // tamaño de la letra
                    color = Color.Black, // color de la letra
                    modifier = Modifier.padding(10.dp)

                )
                Text(
                    text= "Pasos de la receta",
                    fontSize = 13.sp, // tamaño de la letra
                    color = Color.Black, // color de la letra
                    modifier = Modifier.padding(6.dp)

                )

            }

        }


    }






}

@Preview(showBackground = true)
@Composable
fun MuestraCard(){
    Aplicacion_Android_ProgMDMTheme {
        RecetaCard()
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aplicacion_Android_ProgMDMTheme {
        Greeting("Android")
    }
}
