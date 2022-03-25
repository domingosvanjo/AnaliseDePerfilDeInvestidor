package com.example.analisedeperfildeinvestidor;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Perguntas1 extends AppCompatActivity {
    //private Button btProximo;
    private RadioButton opt1;
    private RadioButton opt2;
    private RadioButton opt3;
    private RadioButton opt4;
    private RadioButton opt5;
    private int pontos = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas1);
        //btProximo = (Button) findViewById(R.id.btprox);
        opt1 = (RadioButton) findViewById(R.id.opt1);
        opt2 = (RadioButton) findViewById(R.id.opt2);
        opt3 = (RadioButton) findViewById(R.id.opt3);
        opt4 = (RadioButton) findViewById(R.id.opt4);
        opt5 = (RadioButton) findViewById(R.id.opt5);

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pontos = 0;
                proximo();
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pontos = 2;
                proximo();
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pontos = 4;
                proximo();
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pontos = 8;
                proximo();
            }
        });
        opt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pontos = 10;
                proximo();
            }
        });
        /*
        btProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle parametros = new Bundle();
                parametros.putInt("pontos", pontos);
                Intent segundaTela = new Intent(Perguntas1.this, Perguntas2.class);
                segundaTela.putExtras(parametros);
                startActivity(segundaTela);
            }
        });
        */
    }
    void proximo(){
        Bundle parametros = new Bundle();
        parametros.putInt("pontos", pontos);
        Intent segundaTela = new Intent(Perguntas1.this, Perguntas2.class);
        segundaTela.putExtras(parametros);
        startActivity(segundaTela);
    }
}