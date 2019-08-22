package com.example.androidavanzado_clase01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    var welcomeMessage  = "Hello World!" //Con var, este valor puede cambiar
//    val welcomeMessage2 = "Hello World!" //Con val, es una constante
//
//    val welcomeMessage3: String = "Hello World!" //Indicamos tipo string
//    var userAge: Int = 20 //Indicamos tipo entero
//
//    val numerosPares = arrayOf(2,4,5) //Array enteros
//    var letras = arrayOf("a","b","c") //Array caracteres

    private var btnCalculate: Button? = null
    private var etNum1: EditText? = null
    private var etNum2: EditText? = null
    private var tvResult: TextView? = null

    lateinit var resultado: Button

    private var btnEventoClick: Button? = null; //Declarado como atributo de la clase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var num1 = 10
//        val constante1 = num1 + 2
//
////        var numNotNull: Int = null //Esto tira error porque Int no puede ser null
//        var numNull: Int? = null //Con el ?, puede ser null
//
////        var nombreNull: String? = null
////        var longitud = nombreNull.length //Tira error, porque es null
//
//        var nombre: String? = null
//        if (nombre.length != null) {
//            //Uso nombre.length
//        }
//
//        // Usando nombre.length?, me garantizo que no rompe porque estoy preguntando que si no tiene
//        // null, uso el contenido
//
//        //En este caso, declaramos lista nulleable (que puede tener null), y en el for para que
//        // cuando la posición no es null, se ejecuta el código de let
//        var users: List<String?> = listOf("Juan", null, null, "Maria", null)
//        for (person in users) {
//            person?.let {
//                Toast.makeText(this, person, Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        var nombre: String? = null
//        nombre!!.length //Esto tira error como si hubiera declarado a la variable
//                        // como nombre: String, sin el ?
//
//        //Concatenar:
//        var name = "Julieta"
//        var age = 46
//        var message3 = "$name tiene $age años de edad." //El $ pone el contenido
//
//        //Comparador rango:
//        if (age in 1..18) {
//
//        }
//
//        //Switch
//        var country = "Argentina"
//        var code: String? = null
//        when (country) {
//            "Argentina" -> code = "AR"
//            "Chile" -> code = "CL"
//            else -> code = "No asignado"
//        }
//
//        //For
//        val numbers = arrayOf(2, 4, 6)
//        for (num in numbers) {
//            //do something
//        }
//        for (i in numbers.indices) {
//            //do something
//        }
//
//        //For each
//        var namesCount: Int? = null
//        val names: List<String> = listOf("María", "Carlos", "Romina")
//        names.forEach {
//            namesCount += 1
//        }
//        //Función/método que devuelve void, acá llamado unit
//        fun saludar() {
//            Toast.makeText(this, "Hola a todos", Toast.LENGTH)
//        }
//
//        //Función/método que devuelve string
//        fun getFuIIName(): String {
//            return "Juan Perez"
//        }
//
//        //Función/método que devuelve int
//        fun getAge(): Int {
//            return 79
//        }
//
//        //Función/método que devuelve int y recibe 2 parámetros int
//        fun sum(numl: Int, num2: Int): Int {
//            return numl + num2
//        }
//
//        //Función/método codificado en 1 línea que devuelve boolean si parámetro edad es mayor a 18
//        fun esMayorDeEdad(edad: Int): Boolean = edad >= 18
//
//        //Uso de expresión lambda para escribir menos código que en JAVA (ver siguiente código
//        //comentado en lenguaje JAVA)
        btnEventoClick = findViewById(R.id.btn_EventoClick)
        btnEventoClick!!.setOnClickListener{ v ->
            Toast.makeText( v.context, R.string.eventoClick, Toast.LENGTH_SHORT).show()
        }
//
////        //Código JAVA que hace lo mismo que el código Kotlin anterior pero lleva más codificación
////        btnEventoClick = (Button) findViewById(R.id.btnEventoClick);
////        btnEventoClick.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Toast.makeText(v.getContext(), R.string.eventoClick, Toast.LENGTH_SHORT).show();
////            }
////        });

        btnCalculate = findViewById(R.id.btn_Calculate)
        etNum1 = findViewById(R.id.et_Num1)
        etNum2 = findViewById(R.id.et_Num2)
        tvResult = findViewById(R.id.tv_Result)

        btnCalculate!!.setOnClickListener {
            var num1 = etNum1!!.text.toString().toInt()
            var num2 = etNum2!!.text.toString().toInt()

            val sumResult = num1 + num2
            tvResult!!.text = "El resultado de la suma es $sumResult"
        }
    }
}
