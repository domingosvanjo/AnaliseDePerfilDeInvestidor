package com.example.analisedeperfildeinvestidor;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btinvestir;
    private final int ATV_REQUEST = 1;
    int pontos;
    private TextView pontuacao;
    private TextView perfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btinvestir = (Button)findViewById(R.id.investir);
        pontuacao = (TextView)findViewById(R.id.pontos);
        perfil = (TextView)findViewById(R.id.perfil);

        btinvestir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novaTela = new Intent(MainActivity.this, Perguntas1.class);
                startActivityIfNeeded(novaTela, ATV_REQUEST);
            }
        });
        Intent UltimaTela = getIntent();
        if(UltimaTela!= null) {
            Bundle params = UltimaTela.getExtras();
            if (params != null) {
                pontos = params.getInt("pontos");
            }
            if (pontos>0) {
                pontuacao.isShown();
                pontuacao.setText("Pontuação: " + pontos);
                if (pontos <= 18) {
                    perfil.setText("Seu perfil de investidor é conservador.");
                }
                if (pontos > 18 & pontos <= 33) {
                    perfil.setText("Seu perfil de investidor é moderado.");
                }
                if (pontos > 33 & pontos <= 46) {
                    perfil.setText("Seu perfil de investidor é agresivo.");
                }
                if (pontos > 46) {
                    perfil.setText("Seu perfil de investidor é superagressivo.");
                }
            }
        }
    }
}