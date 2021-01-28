package com.example.primerapp2101;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean raizcuadrada = false;
    boolean raizcubica = false;
    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multi = false;
    boolean divide = false;
    boolean exp2  = false;
    boolean exp3  = false;
    boolean seno= false;
    boolean tangente = false;
    boolean coseno = false;
    Double[] numero = new Double [20];
    Double resultado ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button n0 = (Button) findViewById(R.id.cero);
        n0.setOnClickListener(this);
        Button n1 = (Button) findViewById(R.id.uno);
        n1.setOnClickListener(this);
        Button n2 = (Button) findViewById(R.id.dos);
        n2.setOnClickListener(this);
        Button n3 = (Button) findViewById(R.id.tres);
        n3.setOnClickListener(this);
        Button n4 = (Button) findViewById(R.id.cuatro);
        n4.setOnClickListener(this);
        Button n5 = (Button) findViewById(R.id.cinco);
        n5.setOnClickListener(this);
        Button n6 = (Button) findViewById(R.id.seis);
        n6.setOnClickListener(this);
        Button n7 = (Button) findViewById(R.id.siete);
        n7.setOnClickListener(this);
        Button n8 = (Button) findViewById(R.id.ocho);
        n8.setOnClickListener(this);
        Button n9 = (Button) findViewById(R.id.nueve);
        n9.setOnClickListener(this);
        Button punto = (Button) findViewById(R.id.punto);
        punto.setOnClickListener(this);

        Button igual = (Button) findViewById(R.id.igual);
        igual.setOnClickListener(this);
        Button sumar = (Button) findViewById(R.id.suma);
        sumar.setOnClickListener(this);
        Button restar = (Button) findViewById(R.id.resta);
        restar.setOnClickListener(this);
        Button dividir = (Button) findViewById(R.id.div);
        dividir.setOnClickListener(this);
        Button multiplicar = (Button) findViewById(R.id.multi);
        multiplicar.setOnClickListener(this);
        Button cuadrado = (Button) findViewById(R.id.cuadrado);
        cuadrado.setOnClickListener(this);
        Button cubo = (Button) findViewById(R.id.cubo);
        cubo.setOnClickListener(this);
        Button raizcua = (Button) findViewById(R.id.raizc);
        raizcua.setOnClickListener(this);
        Button raizcub = (Button) findViewById(R.id.raizcu);
        raizcub.setOnClickListener(this);
        Button seno = (Button) findViewById(R.id.seno);
        seno.setOnClickListener(this);
        Button coseno = (Button) findViewById(R.id.coseno);
        coseno.setOnClickListener(this);
        Button tangente = (Button) findViewById(R.id.tangente);
        tangente.setOnClickListener(this);
        Button borrar = (Button) findViewById(R.id.borrar);
        borrar.setOnClickListener(this);
    }


    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.textP);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();
        try {
            switch (seleccion) {
                case R.id.cero:
                    pantalla.setText(a+"0");
                    break;
                case R.id.uno:
                    pantalla.setText(a+"1");
                    break;
                case R.id.dos:
                    pantalla.setText(a+"2");
                    break;
                case R.id.tres:
                    pantalla.setText(a+"3");
                    break;
                case R.id.cuatro:
                    pantalla.setText(a+"4");
                    break;
                case R.id.cinco:
                    pantalla.setText(a+"5");
                    break;
                case R.id.seis:
                    pantalla.setText(a+"6");
                    break;
                case R.id.siete:
                    pantalla.setText(a+"7");
                    break;
                case R.id.ocho:
                    pantalla.setText(a+"8");
                    break;
                case R.id.nueve:
                    pantalla.setText(a+"9");
                    break;
                case R.id.punto:
                    pantalla.setText(a+".");
                    break;
                case R.id.borrar:
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.eliminar:
                    String cadena = a.substring(0, a.length() - 1);
                    pantalla.setText(cadena);
                    break;
                case R.id.div:
                    divide = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.igual:
                    numero[1]= Double.parseDouble(a);
                    if(suma) {
                        resultado = numero[0]+ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (resta){
                        resultado = numero[0]- numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (multi){
                        resultado = numero[0]* numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (divide){
                        resultado = numero[0]/ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }
                    decimal = false;
                    suma = false;
                    resta = false;
                    multi = false;
                    divide = false;
                    exp2  = false;
                    exp3  = false;
                    raizcuadrada = false;
                    raizcubica = false;
                    seno = false;
                    coseno = false;
                    tangente = false;
                    break;
                case R.id.multi:
                    multi = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.resta:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;

                case R.id.suma:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.cuadrado:
                    exp2 = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=(numero[0]*numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.raizc:
                    raizcuadrada = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.sqrt(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.raizcu:
                    raizcubica = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.cbrt(numero[0]) ;
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.cubo:
                    exp3 = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=(numero[0]*numero[0])*numero[0];
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.seno:
                    seno = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sin(numero[0]);
                    pantalla.setText(String.valueOf( resultado+" radianes"));
                    decimal = false;
                    break;
                case R.id.coseno:
                    coseno = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.cos(numero[0]);
                    pantalla.setText(String.valueOf( resultado+" radianes"));
                    decimal = false;
                    break;
                case R.id.tangente:
                    tangente = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.tan(numero[0]);
                    pantalla.setText(String.valueOf( resultado+" radianes"));
                    decimal = false;
                    break;
            }
        }catch(Exception e){
            pantalla.setText(" Error");
        };

    }
}