package Aaron.Garcia.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //1- Mandar a llmar los elementos

        val num1 = findViewById<EditText>(R.id.txtNum1)
        val num2 = findViewById<EditText>(R.id.txtNum2)
        val sumar = findViewById<Button>(R.id.btnSumar)
        val restar = findViewById<Button>(R.id.btnRestar)
        val multiplicar = findViewById<Button>(R.id.btnMultiplicar)
        val dividir = findViewById<Button>(R.id.btnDividir)


        // 2- Programar elementos

        //Creo un objeto de la clase calculadora para con ese objeto
        // si llamar al metodo de sumar

        val objCalculadora = Calculadora()
        sumar.setOnClickListener { objCalculadora.sumar(num1.text.toString().toInt(), num2.text.toString().toInt())}
    }
}