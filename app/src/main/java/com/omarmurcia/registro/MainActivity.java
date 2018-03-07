package com.omarmurcia.registro;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    RadioButton rMasc, rFem;
    Button bCal, bAceptar;
    Spinner sCiudad;
    CheckBox cCine, cNadar, cMusica, cCorrer;
    EditText eLog, ePass, ePax, eCor;
    TextView tResu, tResp, tResc, tResx, tResn, tResl, tResh;
    static EditText eFecha;
    double rad = 0, hob = 0;
    String genero, hobbs = "", cin="", nad="", mus="", cor="", ciud = "", pasu, pasd;
    LinearLayout lResp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCal = findViewById(R.id.bCal);
        sCiudad = findViewById(R.id.sCiudad);

        eLog = findViewById(R.id.eLog);
        ePass = findViewById(R.id.ePass);
        ePax = findViewById(R.id.ePax);
        eCor = findViewById(R.id.eCor);
        rMasc = findViewById(R.id.rMasc);
        rFem = findViewById(R.id.rFem);
        cCine = findViewById(R.id.cCine);
        cNadar = findViewById(R.id.cNadar);
        cMusica = findViewById(R.id.cMusica);
        cCorrer = findViewById(R.id.cCorrer);
        bAceptar = findViewById(R.id.bAceptar);
        tResu = findViewById(R.id.tResu);
        tResp = findViewById(R.id.tResp);
        tResc = findViewById(R.id.tResc);
        tResx = findViewById(R.id.tResx);
        tResn = findViewById(R.id.tResn);
        tResl = findViewById(R.id.tResl);
        tResh = findViewById(R.id.tResh);
        eFecha = findViewById(R.id.eFecha);
        lResp = findViewById(R.id.lResp);


        lResp.setVisibility(View.INVISIBLE);


        //+++++++++++++++++++++++++++ SPINNER ++++++++++++++++++++++++++++++++++++++++++++++++++

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ciudades, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        sCiudad.setAdapter(adapter);
    }
    public class SpinnerActivity extends Activity
            implements AdapterView.OnItemSelectedListener{

        public void onItemSelected(AdapterView parent, View view, int pos, long id){
            // An item was selected. You can retrieve the selected item using
             //parent.getItemAtPosition(pos);
        }
        public void onNothingSelected(AdapterView parent){
            // Another interface callback
        }
    }

    //++++++++++++++++++++++++++ FIN SPINNER +++++++++++++++++++++++++++++++++++++++++++++++

    //+++++++++++++++++++++++++++  DATE PICKER++++++++++++++++++++++++++++++++++++++++++++++
    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            month=month+1;
            // Do something with the date chosen by the user
            eFecha.setText(day + "/" + month + "/" + year);
        }
    }

    public void PickerDialog(View view) {
        //int id = view.getId();

        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");

    }
    //+++++++++++++++++++++++++++ FIN DATE PICKER+++++++++++++++++++++++++++++++++++++++++++++

    public void Rcheck(View view) {
        int id = view.getId();
        rad = 1;
        if (id == R.id.rMasc){
            genero = "Masculino";
        }else {
            genero = "Femenino";
        }
    }

    public void CHcheck(View view) {
        int id = view.getId();

        switch (id){
            case R.id.cCine:
                if (cCine.isChecked()){
                    hob++;
                    cin = "Cine";
                }else {
                    hob--;
                    cin = "";
                }
                break;
            case R.id.cNadar:
                if (cNadar.isChecked()){
                    hob++;
                    nad = ", Nadar";
                }else {
                    hob--;
                    nad = "";
                }
                break;
            case R.id.cMusica:
                if (cMusica.isChecked()){
                    hob++;
                    mus = ", Escuchar Música";
                }else {
                    hob--;
                    mus = "";
                }
                break;
            case R.id.cCorrer:
                if (cCorrer.isChecked()){
                    hob++;
                    cor = ", Correr";
                }else {
                    hob--;
                    cor = "";
                }
                break;
        }
    }

    public void check(View view) {
        int id = view.getId();

        pasu = ePass.getText().toString();
        pasd = ePax.getText().toString();
        ciud = sCiudad.getSelectedItem().toString();
        hobbs = cin + nad + mus + cor;

        if (eLog.getText().toString().isEmpty()){
            Toast.makeText(this, "Ingrese su Usuario",Toast.LENGTH_SHORT).show();
        }else if(ePass.getText().toString().isEmpty()){
            Toast.makeText(this, "Ingrese su Contraseña",Toast.LENGTH_SHORT).show();
        }else if(!pasu.equals(pasd)){
            Toast.makeText(this, "Las Contraseñas no Coinciden",Toast.LENGTH_SHORT).show();
        }else if(eCor.getText().toString().isEmpty()){
            Toast.makeText(this, "Ingrese su Correo",Toast.LENGTH_SHORT).show();
        }else if(!eCor.getText().toString().matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+")){
            Toast.makeText(this, "Correo no Valido",Toast.LENGTH_SHORT).show();
        }else if(rad == 0){
            Toast.makeText(this, "Escoja su Sexo",Toast.LENGTH_SHORT).show();
        }else if(eFecha.getText().toString().isEmpty()){
            Toast.makeText(this, "Ingrese su Fecha de Nacimiento",Toast.LENGTH_SHORT).show();
        }else if( sCiudad.getSelectedItem().toString().isEmpty()){
            Toast.makeText(this, "Ingrese su Ciudad de Nacimiento",Toast.LENGTH_SHORT).show();
        }else if(hob == 0){
            Toast.makeText(this, "Escoja Un Hobbie",Toast.LENGTH_SHORT).show();
        }else {
            tResu.setText(eLog.getText().toString());
            tResp.setText(ePass.getText().toString());
            tResc.setText(eCor.getText().toString());
            tResx.setText(genero);
            tResn.setText(eFecha.getText().toString());
            tResl.setText(ciud);
            tResh.setText(hobbs);
            lResp.setVisibility(View.VISIBLE);
        }
    }
}
