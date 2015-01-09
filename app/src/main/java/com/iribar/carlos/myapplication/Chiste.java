package com.iribar.carlos.myapplication;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Chiste extends Activity {

    private TextView idioma;
    private TextView pregunta;
    private TextView respuesta;
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiste);

        idioma = (TextView) findViewById(R.id.idioma);
        pregunta = (TextView) findViewById(R.id.pregunta);
        respuesta = (TextView) findViewById(R.id.respuesta);
        boton = (Button) findViewById(R.id.button);
        final  ListaChistes chiste = new ListaChistes();

        chiste.getChiste();
        idioma.setText(chiste.idioma);
        pregunta.setText(chiste.pregunta);
        respuesta.setText(chiste.respuesta);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chiste.getChiste();
                idioma.setText(chiste.idioma);
                pregunta.setText(chiste.pregunta);
                respuesta.setText(chiste.respuesta);

            }
        });
    }



}
