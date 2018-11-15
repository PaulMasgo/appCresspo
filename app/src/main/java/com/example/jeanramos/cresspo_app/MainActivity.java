package com.example.jeanramos.cresspo_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jeanramos.cresspo_app.generals.Settings;
import com.example.jeanramos.cresspo_app.activities.ListaProductosActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private Button Ingresar;
    private EditText contraseña;
    private EditText user;



    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ingresar = (Button) findViewById(R.id.btnAcceso);
        user = (EditText) findViewById(R.id.usuario1);
        contraseña = (EditText) findViewById(R.id.contra);

        Toast.makeText(MainActivity.this, "Pulsaste el boton", Toast.LENGTH_SHORT).show();

        Ingresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(Settings.INFO, "About us");
                Intent i = new Intent(MainActivity.this, ListaProductosActivity.class);
                startActivity(i);


            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Settings.DEBUG, "La aplicacion entró en start");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(Settings.DEBUG, "La aplicacion entró en resume");
        // put your code here...

    }
    @Override
    protected void onStop() {
        // call the superclass method first
        super.onStop();
        Log.d(Settings.DEBUG, "La aplicacion entró en stop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v(Settings.DEBUG, "La aplicacion entró en pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Settings.DEBUG, "La aplicacion entró en destroy");
    }
}
