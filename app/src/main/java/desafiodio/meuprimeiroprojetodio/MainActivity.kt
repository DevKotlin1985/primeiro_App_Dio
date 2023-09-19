package desafiodio.meuprimeiroprojetodio

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var pastaAssets = "fonts/"
    var ttfRiscoRabisco = "risco_rabisco.ttf"
    var ttfMariaLucia = "Maria_lucia.ttf"
    var ttfAnjaEliane = "Anja_Eliane.ttf"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtRiscoRabisco = findViewById<TextView>(R.id.txtRiscoRabisco)
        val txtMariaLucia = findViewById<TextView>(R.id.txtMariaLucia)
        val btnAnjaEliane = findViewById<Button>(R.id.btnAnjaEliane)

        val riscoRabisco = Typeface.createFromAsset(assets,pastaAssets + ttfRiscoRabisco)
        txtRiscoRabisco.setTypeface(riscoRabisco)

        val mariaLucia = Typeface.createFromAsset(assets, pastaAssets + ttfMariaLucia)
        txtMariaLucia.setTypeface(mariaLucia)

        val anjaEliane = Typeface.createFromAsset(assets,pastaAssets + ttfAnjaEliane)
        btnAnjaEliane.setTypeface(anjaEliane)


    }
}