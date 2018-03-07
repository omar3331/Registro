package com.omarmurcia.resistencias;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button  bCafec, bRojoc, bDoradoc, bPlateadoc;
    Button bCafeu, bRojou, bNaranjau, bAmarillou, bVerdeu, bAzulu, bPurpurau, bGrisu, bBlancou;
    Button bNegrod, bCafed, bRojod, bNaranjad, bAmarillod, bVerded, bAzuld, bPurpurad, bGrisd, bBlancod;
    Button bNegrot, bCafet, bRojot, bNaranjat, bAmarillot, bVerdet, bAzult, bPurpurat, bGrist, bBlancot, bDoradot, bPlateadot;
    LinearLayout lUno, lDos, lTres, lCuatro;
    TextView tValoru, tValord, tValort;
    double primero=10, segundo=1, tercero=10, total;
    String cuarto = "Ω±1%", simbolo="Ω";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lUno = findViewById(R.id.lUno);
        lDos = findViewById(R.id.lDos);
        lTres = findViewById(R.id.lTres);
        lCuatro = findViewById(R.id.lCuatro);
        bCafeu = findViewById(R.id.bCafeu);
        bRojou = findViewById(R.id.bRojou);
        bNaranjau = findViewById(R.id.bNaranjau);
        bAmarillou = findViewById(R.id.bAmarillou);
        bVerdeu = findViewById(R.id.bVerdeu);
        bAzulu = findViewById(R.id.bAzulu);
        bPurpurau = findViewById(R.id.bPurpurau);
        bGrisu = findViewById(R.id.bGrisu);
        bBlancou = findViewById(R.id.bBlancou);
        bNegrod = findViewById(R.id.bNegrod);
        bCafed = findViewById(R.id.bCafed);
        bRojod = findViewById(R.id.bRojod);
        bNaranjad = findViewById(R.id.bNaranjad);
        bAmarillod = findViewById(R.id.bAmarillod);
        bVerded = findViewById(R.id.bVerded);
        bAzuld = findViewById(R.id.bAzuld);
        bPurpurad = findViewById(R.id.bPurpurad);
        bGrisd = findViewById(R.id.bGrisd);
        bBlancod = findViewById(R.id.bBlancod);
        bNegrot = findViewById(R.id.bNegrot);
        bCafet = findViewById(R.id.bCafet);
        bRojot = findViewById(R.id.bRojot);
        bNaranjat = findViewById(R.id.bNaranjat);
        bAmarillot = findViewById(R.id.bAmarillot);
        bVerdet = findViewById(R.id.bVerdet);
        bAzult = findViewById(R.id.bAzult);
        bPurpurat = findViewById(R.id.bPurpurat);
        bGrist = findViewById(R.id.bGrist);
        bBlancot = findViewById(R.id.bBlancot);
        bDoradot = findViewById(R.id.bDoradot);
        bPlateadot = findViewById(R.id.bPlateadot);
        bCafec = findViewById(R.id.bCafec);
        bRojoc = findViewById(R.id.bRojoc);
        bDoradoc = findViewById(R.id.bDoradoc);
        bPlateadoc = findViewById(R.id.bPlateadoc);
        tValoru = findViewById(R.id.tValoru);
        tValord = findViewById(R.id.tValord);
        tValort = findViewById(R.id.tValort);
    }

    //******************************************************codigo para el primer color**********************
    public void Primero(View view) {
        int id = view.getId();

        switch (id){

            case R.id.bCafeu:
                lUno.setBackgroundColor(Color.parseColor("#a52a2a"));
                primero=10;
                Toast.makeText(this,"Cafe",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bRojou:
                lUno.setBackgroundColor(Color.parseColor("#ff0000"));
                primero=20;
                Toast.makeText(this,"Rojo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bNaranjau:
                lUno.setBackgroundColor(Color.parseColor("#ffa500"));
                primero=30;
                Toast.makeText(this,"Naranja",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bAmarillou:
                lUno.setBackgroundColor(Color.parseColor("#ffff00"));
                primero=40;
                Toast.makeText(this,"Amarillo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bVerdeu:
                lUno.setBackgroundColor(Color.parseColor("#008000"));
                primero=50;
                Toast.makeText(this,"Verde",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bAzulu:
                lUno.setBackgroundColor(Color.parseColor("#0000ff"));
                primero=60;
                Toast.makeText(this,"Azul",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bPurpurau:
                lUno.setBackgroundColor(Color.parseColor("#800080"));
                primero=70;
                Toast.makeText(this,"Púrpura",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bGrisu:
                lUno.setBackgroundColor(Color.parseColor("#808080"));
                primero=80;
                Toast.makeText(this,"Gris",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bBlancou:
                lUno.setBackgroundColor(Color.parseColor("#ffffff"));
                primero=90;
                Toast.makeText(this,"Blanco",Toast.LENGTH_SHORT).show();
                break;
        }
        mostrar();
    }

    //******************************************************codigo para el segundo color**********************
    public void Segundo(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.bNegrod:
                lDos.setBackgroundColor(Color.parseColor("#000000"));
                segundo = 0;
                Toast.makeText(this,"Negro",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bCafed:
                lDos.setBackgroundColor(Color.parseColor("#a52a2a"));
                segundo = 1;
                Toast.makeText(this,"Cafe",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bRojod:
                lDos.setBackgroundColor(Color.parseColor("#ff0000"));
                segundo = 2;
                Toast.makeText(this,"Rojo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bNaranjad:
                lDos.setBackgroundColor(Color.parseColor("#ffa500"));
                segundo = 3;
                Toast.makeText(this,"Naranja",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bAmarillod:
                lDos.setBackgroundColor(Color.parseColor("#ffff00"));
                segundo = 4;
                Toast.makeText(this,"Amarillo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bVerded:
                lDos.setBackgroundColor(Color.parseColor("#008000"));
                segundo = 5;
                Toast.makeText(this,"Verde",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bAzuld:
                lDos.setBackgroundColor(Color.parseColor("#0000ff"));
                segundo = 6;
                Toast.makeText(this,"Azul",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bPurpurad:
                lDos.setBackgroundColor(Color.parseColor("#800080"));
                segundo = 7;
                Toast.makeText(this,"Púrpura",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bGrisd:
                lDos.setBackgroundColor(Color.parseColor("#808080"));
                segundo = 8;
                Toast.makeText(this,"Gris",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bBlancod:
                lDos.setBackgroundColor(Color.parseColor("#ffffff"));
                segundo = 9;
                Toast.makeText(this,"Blanco",Toast.LENGTH_SHORT).show();
                break;
        }
        mostrar();
    }
    //******************************************************codigo para el tercer color**********************
    public void Tercero(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.bNegrot:
                lTres.setBackgroundColor(Color.parseColor("#000000"));
                tercero = 1;
                Toast.makeText(this,"Negro",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bCafet:
                lTres.setBackgroundColor(Color.parseColor("#a52a2a"));
                tercero = 10;
                Toast.makeText(this,"Cafe",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bRojot:
                lTres.setBackgroundColor(Color.parseColor("#ff0000"));
                tercero = 100;
                Toast.makeText(this,"Rojo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bNaranjat:
                lTres.setBackgroundColor(Color.parseColor("#ffa500"));
                tercero = 1000;
                Toast.makeText(this,"Naranja",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bAmarillot:
                lTres.setBackgroundColor(Color.parseColor("#ffff00"));
                tercero = 10000;
                Toast.makeText(this,"Amarillo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bVerdet:
                lTres.setBackgroundColor(Color.parseColor("#008000"));
                tercero = 100000;
                Toast.makeText(this,"Verde",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bAzult:
                lTres.setBackgroundColor(Color.parseColor("#0000ff"));
                tercero = 1000000;
                Toast.makeText(this,"Azul",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bPurpurat:
                lTres.setBackgroundColor(Color.parseColor("#800080"));
                tercero = 10000000;
                Toast.makeText(this,"Púrpura",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bGrist:
                lTres.setBackgroundColor(Color.parseColor("#808080"));
                tercero = 100000000;
                Toast.makeText(this,"Gris",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bBlancot:
                lTres.setBackgroundColor(Color.parseColor("#ffffff"));
                tercero = 1000000000;
                Toast.makeText(this,"Blanco",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bDoradot:
                lTres.setBackgroundColor(Color.parseColor("#ffd700"));
                tercero = 0.1;
                Toast.makeText(this,"Dorado",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bPlateadot:
                lTres.setBackgroundColor(Color.parseColor("#c0c0c0"));
                tercero = 0.01;
                Toast.makeText(this,"Plateado",Toast.LENGTH_SHORT).show();
                break;
        }
        mostrar();
    }


    //******************************************************codigo para el cuarto color**********************
    public void Cuarto(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.bCafec:
                lCuatro.setBackgroundColor(Color.parseColor("#a52a2a"));
                cuarto = "±1%";
                Toast.makeText(this,"Cafe",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bRojoc:
                lCuatro.setBackgroundColor(Color.parseColor("#ff0000"));
                cuarto = "±2%";
                Toast.makeText(this,"Rojo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bDoradoc:
                lCuatro.setBackgroundColor(Color.parseColor("#ffd700"));
                cuarto = "±5%";
                Toast.makeText(this,"Dorado",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bPlateadoc:
                lCuatro.setBackgroundColor(Color.parseColor("#c0c0c0"));
                cuarto = "±10%";
                Toast.makeText(this,"Plateado",Toast.LENGTH_SHORT).show();
                break;
        }
        tValort.setText(cuarto);
    }

    public void mostrar (){
        total=(primero+segundo)*tercero;
        if (total>=1000000000){
            total = total/1000000000;
            simbolo = "GΩ";
        }else if (total>=1000000){
            total = total/1000000;
            simbolo = "MΩ";
        }else if (total>=1000){
            total = total/1000;
            simbolo = "kΩ";
        }
        if (total % 1 == 0) {
            tValoru.setText(String.format("%.0f", total));
        }else{
            tValoru.setText(String.format("%.1f", total));
        }
        tValord.setText(simbolo);
    }
}
