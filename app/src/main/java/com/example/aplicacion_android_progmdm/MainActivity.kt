package com.example.aplicacion_android_progmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplicacion_android_progmdm.ui.theme.Aplicacion_Android_ProgMDMTheme
import com.example.aplicacion_android_progmdm.ui.theme.PurpleGrey80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aplicacion_Android_ProgMDMTheme {
                /*Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                   /* Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    */
                    Box(modifier = Modifier.padding(innerPadding))
                    RecetaCard()
                }

                 */
                RecetaCard()
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

/*

----------LINK SOBRE EL CARDVIEW----------
https://developer.android.com/develop/ui/compose/components/card?hl=es-419

https://www.youtube.com/watch?v=Ia_DaoDfyyI

----------LINK SOBRE EL SCROLL ---------- O BIEN LO PODEMOS HACER CON UN LAZYCOLUMN
https://developer.android.com/develop/ui/compose/touch-input/pointer-input/scroll?hl=es-419

----------LINK SOBRE LAS COLUMNAS. Explica un poco lo del scroll----------

https://www.youtube.com/watch?v=J8a6dLI6yFI&list=PL8ie04dqq7_ORKWIwiaSTcyBKtasZtNUD&index=2

----------LINK SOBRE EL ROW/FILAS----------
https://www.youtube.com/watch?v=tIhioKYvtGE&list=PL8ie04dqq7_ORKWIwiaSTcyBKtasZtNUD&index=3

----------LINK SOBRE EL BOTON QUE LLEVE A YOUTUBE----------

https://www.youtube.com/watch?v=3Rx33a03zBY




 */


@Composable
fun RecetaCard(){

    // columna principal, se implemento un SCROLL vertical
    Column (modifier = Modifier
        .fillMaxSize() // esto ocupa toda la pantalla, ver video de las columnas y row
        .background(color = PurpleGrey80) // color de fondo
        .verticalScroll(rememberScrollState())
        .padding(20.dp) // margen para que este mas centrada, y tenga espacio arriba del todo
    )

    {

        // Titulo de la aplicacion
        Text(
            text = "Recetas de la abuela",
            style = MaterialTheme.typography.headlineLarge, // tipografia de la letra, hay
            // hay muchos estilos, probar lo que mas os guste
            modifier = Modifier
                .fillMaxWidth() // <-- Hace que el Text ocupe todo el ancho
                .padding(bottom = 8.dp, top = 35.dp), // margen entre el titulo y las recetas(botton)
                                                      // margen entre lo de arriba donde la señal wifi y demas (top)
            textAlign = TextAlign.Center // para centrar el texto
        )



        // Fila 1. horizontal de las dos primeras recetas
        Row (modifier = Modifier.fillMaxWidth()) {

            // cardview tarjeta nº1 (espaguettis)
            Card(
                modifier = Modifier
                    .width(180.dp)
                    .padding(8.dp)
                    .height(270.dp),
                elevation = CardDefaults.cardElevation(10.dp), // es como una sombra
                colors = CardDefaults.cardColors(
                    containerColor = Color.White // color de dentro del cardview
                )
            ) {
                // columna del cardview de spaguettis
                Column(modifier = Modifier.fillMaxSize()) {
                    // añadimos la imagen de la receta
                    Image(
                        painter = painterResource(id = R.drawable.espaguetis_con_tomate_),
                        contentDescription = "Imagen de la receta, spaguetiis con tomate",
                        modifier = Modifier
                            .height(120.dp)
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Spaghetti con tomate", // titulo de la receta
                        fontSize = 18.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text = "Pasos de la receta", // pasos de la receta
                        fontSize = 13.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(6.dp)

                    )

                }
            }
            // cardview nº2 (Flan)

            Card(
                modifier = Modifier
                    .width(180.dp)
                    .padding(8.dp)

                    .height(270.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White // color de dentro del cardview
                )
            ) {
                Column(modifier = Modifier.fillMaxSize()) {

                    // añadimos una imagen
                    Image(
                        painter = painterResource(id = R.drawable.flan_frances),
                        contentDescription = "Imagen de la receta, flan frances",
                        modifier = Modifier
                            .height(120.dp) //  tamaño de la altura de la imagen
                            .fillMaxSize(), // que la imagen ocupe todo
                        contentScale = ContentScale.Crop

                    )

                    Text(
                        text = "Flán frances", // titulo de la receta
                        fontSize = 18.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(10.dp)

                    )
                    Text(
                        text = "Pasos de la receta", // pasos de la receta
                        fontSize = 13.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(6.dp)
                    )
                }
            }
        } // fin de la fila 1


            // fila 2, para colocar dos recetas
            Row(modifier = Modifier.fillMaxWidth()){

            // cardview tarjeta nº3 (tarta de queso)

            Card (
                modifier = Modifier
                    .width(180.dp)
                    .padding(8.dp)

                    .height(270.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White // color de dentro del cardview

                )
            ){
                Column (modifier = Modifier.fillMaxSize()){

                    // añadimos una imagen
                    Image(
                        painter = painterResource(id = R.drawable.tarta_de_queso_japonesa),
                        contentDescription = "Imagen de la receta, tarta de queso",
                        modifier = Modifier
                            .height(120.dp) //  tamaño de la altura de la imagen
                            .fillMaxSize(), // que la imagen ocupe todo
                        contentScale = ContentScale.Crop

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

            // cardview tarjeta nº4 (pastel)
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
                        contentScale = ContentScale.Crop

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


        } // fin de la fila 2

        /*
        Si queremos añadir otra fila de recetas, lo hacemos aqui.
        pones un row, que es una fila y los card
         */



    }

    }



@Preview(showBackground = true)
@Composable
fun MuestraCard(){
    Aplicacion_Android_ProgMDMTheme {
        RecetaCard()
    }
}



/* @Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aplicacion_Android_ProgMDMTheme {
        Greeting("Android")
    }
}
*/