package com.lucasbezerrateixeira.logedatabinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void exibirMensagem(View view){

        Log.i("Trabalho","Monitorando inicio da aplicação");
        Toast.makeText(MainActivity.this,"Monitorando Botão", Toast.LENGTH_LONG).show();

    }
}
