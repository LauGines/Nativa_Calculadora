package com.example.nativa_calculadora

//Importaciones
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import android.view.ActionMode



class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// 1.Tomamos el control sobre las listas que vamos a necesitar en la MainActivity.kt
        val resultadoText = findViewById<TextView>(R.id.Resultado_id)
        val sumar = findViewById<Button>(R.id.Sumar)
        val restar = findViewById<Button>(R.id.Restar)
        val mult = findViewById<Button>(R.id.Mult)
        val dividir = findViewById<Button>(R.id.Dividir)



// 2.Los botones tiene la propiedad onClickListener al pulsarlos

        //CONDICIONES SEGÚN LA OPERACIÓN (ACCIÓN QUE VA A TENER EL BOTÓN)
  //SUMAR
        sumar.setOnClickListener {
                //Guardar los valores de cada EditText en su respectiva variable
            val num_uno = findViewById<EditText>(R.id.num_uno).text.toString() //Para convertir en texto y lo guarde como cadena de texto
            val num_dos = findViewById<EditText>(R.id.num_dos).text.toString() //Para convertir en texto y lo guarde como cadena de texto
                    //Lo pasamos a toString porque nos servirá luego en el if (saber si está vacío o no)

            if (num_uno.isEmpty() || num_dos.isEmpty()){
                Toast.makeText(this, getString(R.string.mensaje_info), Toast.LENGTH_LONG).show()
            } else {
                //El resultado te lo guarda en una variable
                val operaciones = num_dos.toInt() + num_uno.toInt()
                resultadoText.text = getString(R.string.resultado, operaciones)


            }


        }

     //RESTAR
        restar.setOnClickListener {
            //Guardar los valores de cada EditText en su respectiva variable
            val num_uno = findViewById<EditText>(R.id.num_uno).text.toString() //Para convertir en texto y lo guarde como cadena de texto
            val num_dos = findViewById<EditText>(R.id.num_dos).text.toString() //Para convertir en texto y lo guarde como cadena de texto
            //Lo pasamos a toString porque nos servirá luego en el if (saber si está vacío o no)

            if (num_uno.isEmpty() || num_dos.isEmpty()){
                Toast.makeText(this, getString(R.string.mensaje_info), Toast.LENGTH_LONG).show()
            } else {
                //El resultado te lo guarda en una variable
                val operaciones = num_dos.toInt() - num_uno.toInt()
                resultadoText.text = getString(R.string.resultado, operaciones)


            }


        }

    //MULTIPLICAR
        mult.setOnClickListener {
            //Guardar los valores de cada EditText en su respectiva variable
            val num_uno = findViewById<EditText>(R.id.num_uno).text.toString() //Para convertir en texto y lo guarde como cadena de texto
            val num_dos = findViewById<EditText>(R.id.num_dos).text.toString() //Para convertir en texto y lo guarde como cadena de texto
            //Lo pasamos a toString porque nos servirá luego en el if (saber si está vacío o no)

            if (num_uno.isEmpty() || num_dos.isEmpty()){
                Toast.makeText(this, getString(R.string.mensaje_info), Toast.LENGTH_LONG).show()
            } else {
                //El resultado te lo guarda en una variable
                val operaciones = num_dos.toInt() * num_uno.toInt()
                resultadoText.text = getString(R.string.resultado, operaciones)


            }


        }

    //DIVIDIR
        dividir.setOnClickListener {
            //Guardar los valores de cada EditText en su respectiva variable
            val num_uno =
                findViewById<EditText>(R.id.num_uno).text.toString() //Para convertir en texto y lo guarde como cadena de texto
            val num_dos =
                findViewById<EditText>(R.id.num_dos).text.toString() //Para convertir en texto y lo guarde como cadena de texto
            //Lo pasamos a toString porque nos servirá luego en el if (saber si está vacío o no)

            if (num_uno.isEmpty() || num_dos.isEmpty()) {
                Toast.makeText(this, getString(R.string.mensaje_info), Toast.LENGTH_LONG).show()
            } else if (num_uno.toInt() == 0 || num_dos.toInt() == 0){  //Lo pasamos a número porque antes lo tenemos como String
                Toast.makeText(this, getString(R.string.mensaje_nocero), Toast.LENGTH_LONG).show()
            } else {
                //El resultado te lo guarda en una variable
                val operaciones = num_dos.toInt() / num_uno.toInt()
                resultadoText.text = getString(R.string.resultado, operaciones)

        }


        }


    }


}


