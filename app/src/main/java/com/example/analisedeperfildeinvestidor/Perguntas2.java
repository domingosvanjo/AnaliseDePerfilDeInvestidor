package com.example.analisedeperfildeinvestidor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Perguntas2 extends AppCompatActivity {
    //private Button btProximo;
    private RadioButton opt1;
    private RadioButton opt2;
    private RadioButton opt3;
    private RadioButton opt4;
    private RadioButton opt5;
    int pontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas2);
        //btProximo = (Button) findViewById(R.id.btprox2);
        opt1 = (RadioButton) findViewById(R.id.opt6);
        opt2 = (RadioButton) findViewById(R.id.opt7);
        opt3 = (RadioButton) findViewById(R.id.opt8);
        opt4 = (RadioButton) findViewById(R.id.opt9);
        opt5 = (RadioButton) findViewById(R.id.opt10);
        Intent telaAnterior = getIntent();
        if(telaAnterior!= null) {
            Bundle params = telaAnterior.getExtras();
            if (params != null) {
                pontos = params.getInt("pontos");
            }
        }
        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pontos = pontos + 5;
                proximo();
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pontos = pontos + 4;
                proximo();
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pontos = pontos + 3;
                proximo();
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pontos = pontos + 2;
                proximo();
            }
        });
        opt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pontos = pontos + 1;
                proximo();
            }
        });
        /*btProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle parametros = new Bundle();
                parametros.putInt("pontos", pontos);
                Intent proximaTela = new Intent(Perguntas2.this, Perguntas3.class);
                proximaTela.putExtras(parametros);
                startActivity(proximaTela);
            }
        });*/
    }
    void proximo(){
        Bundle parametros = new Bundle();
        parametros.putInt("pontos", pontos);
        Intent proximaTela = new Intent(Perguntas2.this, Perguntas3.class);
        proximaTela.putExtras(parametros);
        startActivity(proximaTela);
    }
}
