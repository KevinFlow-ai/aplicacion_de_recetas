package com.example.aplicacion_android_progmdm

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplicacion_android_progmdm.ui.theme.Aplicacion_Android_ProgMDMTheme

/* TRABAJO DE HACER UNA APLICACIÓN ANDROID USANDO JETPACK COMPOSE. PROGRAMACIÓN MULTIMEDIA Y DISPOSITIVOS MÓVILES 2025/2026

********MIEMBROS**********

-----------------------------------
DAVID GONZALEZ APARICIO
-----------------------------------
JAVIER BARQUILLA TOBOSO
-----------------------------------
KEVIN FLORES CORRALES
-----------------------------------

 */
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


----------LINK SOBRE LANZAR VIDEO LINK----------

https://www.youtube.com/watch?v=3Rx33a03zBY




 */


@Composable
fun RecetaCard(){


    var switchActivo by remember { mutableStateOf(false) }
    // Color del fondo
    val fondoColor = if (switchActivo) Color.Yellow else Color(0xFFA2C9DA)


    // Columna principal, se implemento un SCROLL vertical
    Column (modifier = Modifier
        .fillMaxSize() // esto ocupa toda la pantalla, ver video de las columnas y row
        .background(fondoColor) // color de fondo
        .verticalScroll(rememberScrollState()) // SCROLL VERTICAL
        .padding(20.dp) // margen para que este mas centrada, y tenga espacio arriba del todo
    )


    {

        // fila del switch
        Row(
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            Text(text = "Cambiar fondo")

            Spacer(modifier = Modifier.width(8.dp)) // Espacio entre el switch y el texto (cambiar fondo)

            Switch(
                checked = switchActivo,
                onCheckedChange = { switchActivo = it }
            )
        }
        // Titulo de la aplicación
        Text(
            text = "Recetas de la abuela",
            style = MaterialTheme.typography.headlineLarge, // tipografia de la letra, hay
            // hay muchos estilos, probar lo que mas os guste
            modifier = Modifier
                .fillMaxWidth() //  Hace que el Text ocupe todo el ancho
                .padding(bottom = 8.dp, top = 8.dp), // margen entre el titulo y las recetas(botton)
                                                      // margen entre lo de arriba donde la señal wifi y demas (top)
            textAlign = TextAlign.Center // para centrar el texto
        )



        // filas Nº1. horizontal de las dos primeras recetas
        Column(modifier = Modifier.fillMaxWidth()) {

            // cardview tarjeta nº1 (espaguettis)
            Card(
                modifier = Modifier.fillMaxWidth()
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(10.dp), // es como una sombra
                colors = CardDefaults.cardColors(
                    containerColor = Color.White // color de dentro del cardview
                )
            ) {
                // columna del cardview de spaguettis
                Column(modifier = Modifier.fillMaxSize()
                )
                {
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
                        text = "Spaghetti con tomate \uD83C\uDF5D", // titulo de la receta
                        fontSize = 18.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text = "Ingredientes", // ingredientes de la receta
                        fontSize = 15.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text = "-200 gramos de espaguetis\n" +
                                "-1 lata de 500 gramos de tomates enteros\n" +
                                "-1 cebolla (opcional)\n" +
                                "-Hojas de albahaca fresca u orégano\n" +
                                "-Queso parmesano rallado\n" +
                                "-Aceite de oliva virgen extra",
                        fontSize = 13.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(6.dp)

                    )
                    LanzarLink(urlvideo = "https://www.youtube.com/watch?v=TC5_kB4Bndc", botonText = "Ver Tutorial")



                }
            }
            // cardview nº2 (Flan)

            Card(
                modifier = Modifier.fillMaxWidth()
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White // color de dentro del cardview
                )
            ) {
                Column(modifier = Modifier.fillMaxSize()) {

                    // añadimos una imagen
                    Image(
                        painter = painterResource(id = R.drawable.flan_frances),
                        contentDescription = "Imagen de la receta, flan francés",
                        modifier = Modifier
                            .height(120.dp) //  tamaño de la altura de la imagen
                            .fillMaxSize(), // que la imagen ocupe todoo
                        contentScale = ContentScale.Crop

                    )

                    Text(
                        text = "Flán francés \uD83C\uDF6E", // titulo de la receta
                        fontSize = 18.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(10.dp)

                    )
                    Text(
                        text = "Ingredientes", // ingredientes de la receta
                        fontSize = 15.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text =  "-Leche tibia: 500 ml\n" +
                                "-4 Huevos\n" +
                                "-85 gm de Azúcar\n" +
                                "-Esencia de vainilla\n" +
                                "-1 Cucharada de Caramelo líquido", // pasos de la receta
                        fontSize = 13.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(6.dp)
                    )
                    LanzarLink(urlvideo = "https://www.youtube.com/watch?v=fg155bVwXXU", botonText = "Ver Tutorial")

                }
            }
        } // fin de la fila 1


            // fila 2, para colocar dos recetas
            Column(modifier = Modifier.fillMaxWidth()){

            // cardview tarjeta nº3 (tarta de queso)

                Card(
                    modifier = Modifier.fillMaxWidth()
                        .padding(8.dp),
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
                            .fillMaxSize(), // que la imagen ocupe todoo
                        contentScale = ContentScale.Crop

                    )

                    Text(
                        text = "Tarta de queso japonesa \uD83C\uDF70\uD83E\uDDC0",
                        fontSize = 18.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(10.dp)

                    )
                    Text(
                        text = "Ingredientes", // ingredinetes de la receta
                        fontSize = 15.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text= "-250 g de Queso crema a temperatura ambiente\n" +
                                "-3 Huevos a temperatura ambiente\n" +
                                "-50 ml de Leche a temperatura ambiente\n" +
                                "-80 g Azúcar\n" +
                                "-30 g Maizena\n" +
                                "-Zumo de limón (de medio limón)\n" +
                                "-Levadura química (media cucharadita)",
                        fontSize = 13.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(6.dp)

                    )
                    LanzarLink(urlvideo = "https://www.youtube.com/watch?v=c_oqkGMHmOo", botonText = "Ver Tutorial")

                }

            }

            // cardview tarjeta nº4 (pastel)
                Card(
                    modifier = Modifier.fillMaxWidth()
                        .padding(8.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White

                )

            ){
                Column (modifier = Modifier.fillMaxSize()){

                    // añadimos una imagen
                    Image(
                        painter = painterResource(id = R.drawable.pastel_de_viento_helado),
                        contentDescription = "Imagen de la receta, pastel de viento helado",
                        modifier = Modifier
                            .height(120.dp) //  tamaño de la altura de la imagen
                            .fillMaxSize(), // que la imagen ocupe todoo
                        contentScale = ContentScale.Crop

                    )

                    Text(
                        text = "Pastel helado Ledenivjetar \uD83C\uDF70❄\uFE0F\n",
                        fontSize = 18.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(10.dp)

                    )
                    Text(
                        text = "Ingredientes", // titulo de la receta
                        fontSize = 15.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text= "-corteza blanca \n" +
                                "-9 claras de huevo\n" +
                                "-300 g de azúcar\n" +
                                "-1 cucharada de vinagre de sidra de manzana\n" +
                                "-9 yemas de huevo\n" +
                                "-4 cucharadas de azúcar\n" +
                                "-4 cucharadas de harina picante\n" +
                                "-2,5 l de leche\n" +
                                "-3 azúcares de vainilla\n" +
                                "-250 gramos de margarina\n" +
                                "-1/2 l de nata dulce\n" +
                                "-plátanos, fresas, kiwis y frutas similares\n" +
                                "-zumo de limón",
                        fontSize = 13.sp, // tamaño de la letra
                        color = Color.Black, // color de la letra
                        modifier = Modifier.padding(6.dp)



                    )
                    LanzarLink(urlvideo = "https://www.youtube.com/watch?v=AO2Y0IWiRKw", botonText = "Ver Tutorial")


                }

            }


        } // fin de la fila 2


        /*
        Si queremos añadir otra fila de recetas, lo hacemos aqui.
        pones un row, que es una fila y los card
         */


    }



    }

@Composable
fun LanzarLink(urlvideo: String, botonText: String){
    val contex = LocalContext.current

    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center // centra el boton
    ) {
        Button(onClick =  {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urlvideo))
            contex.startActivity(intent)
        }) {
            Text(
                text = botonText
            )
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



/* @Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aplicacion_Android_ProgMDMTheme {
        Greeting("Android")
    }
}
*/