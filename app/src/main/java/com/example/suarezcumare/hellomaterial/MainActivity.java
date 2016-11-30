package com.example.suarezcumare.hellomaterial;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.clickButtonIniciarSesion();
    }

    public void clickButtonIniciarSesion(){
        Button sesion = (Button) findViewById(R.id.sesion);

        sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,getResources().getString(R.string.long_mensaje), Snackbar.LENGTH_SHORT)
                        .setActionTextColor(getResources().getColor(R.color.colorPrimary))
                        .show();

                setContentView(R.layout.activity_lista_mascotas);
            }
        });

    }


}
