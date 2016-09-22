package com.dionimfxgmail.avaliacaopdm;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by dioni on 21/09/2016.
 */

public class Calculadora extends AppCompatActivity{
    String digitado="";
    TextView ent_calc_resultado;
    Button bt_calc_num0;
    Button bt_calc_num1;
    Button bt_calc_num2;
    Button bt_calc_num3;
    Button bt_calc_num4;
    Button bt_calc_num5;
    Button bt_calc_num6;
    Button bt_calc_num7;
    Button bt_calc_num8;
    Button bt_calc_num9;
    Button bt_calc_operador_divisao;
    Button bt_calc_operador_subtracao;
    Button bt_calc_operador_soma;
    Button bt_calc_operador_multiplicacao;
    Button bt_calc_operador_igual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public String operacao(){


        return "";
    }
    public void Resultado(String digito){
        digitado+=digito;
        ent_calc_resultado.setText(digitado);
    }

    public void onCreate() {
        bt_calc_num0 = (Button) findViewById(R.id.bt_calc_num0);
        bt_calc_num1 = (Button) findViewById(R.id.bt_calc_num1);
        bt_calc_num2 = (Button) findViewById(R.id.bt_calc_num2);
        bt_calc_num3 = (Button) findViewById(R.id.bt_calc_num3);
        bt_calc_num4 = (Button) findViewById(R.id.bt_calc_num4);
        bt_calc_num5 = (Button) findViewById(R.id.bt_calc_num5);
        bt_calc_num6 = (Button) findViewById(R.id.bt_calc_num6);
        bt_calc_num7 = (Button) findViewById(R.id.bt_calc_num7);
        bt_calc_num8 = (Button) findViewById(R.id.bt_calc_num8);
        bt_calc_num9 = (Button) findViewById(R.id.bt_calc_num9);
        bt_calc_operador_divisao = (Button) findViewById(R.id.bt_calc_operacao_divisao);
        bt_calc_operador_multiplicacao = (Button) findViewById(R.id.bt_calc_operador_multiplicacao);
        bt_calc_operador_soma = (Button) findViewById(R.id.bt_calc_operador_soma);
        bt_calc_operador_subtracao = (Button) findViewById(R.id.bt_calc_operador_subtracao);
        bt_calc_operador_igual = (Button) findViewById(R.id.bt_calc_operador_igual);





    }
}
