package com.dionimfxgmail.avaliacaopdm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import cadastro.Cadastro_Autor;
import cadastro.Cadastro_Editora;
import cadastro.Cadastro_Livro;
import cadastro.Cadastro_Usuario;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_calculadora) {
            Calculadora calculadora = new Calculadora();
            setContentView(R.layout.calculadora);


            //*calculadora.onCreate(Bundle );*//

            Toast.makeText(getApplicationContext(),
                    "Calculadora está sendo implementado",
                    Toast.LENGTH_SHORT).show();


            return true;
        }
        if (id == R.id.action_cad_livro) {
            Cadastro_Livro cadastro_livro = new Cadastro_Livro();

            setContentView(R.layout.cadastro_livros);
            Toast.makeText(getApplicationContext(),
                    "Cadastro de Livro está sendo implementado",
                    Toast.LENGTH_SHORT).show();


            return true;
        }
        if (id == R.id.action_cad_autor) {
            Cadastro_Autor cadastro_autor = new Cadastro_Autor();
            setContentView(R.layout.calculadora);
            //*mostra uma mensagem na tela*//
            Toast.makeText(getApplicationContext(),
                    "Cadastro de Autores está sendo implementado",
                    Toast.LENGTH_SHORT).show();


            return true;
        }
        if (id == R.id.action_cad_editora) {
            Cadastro_Editora cadastro_editora = new Cadastro_Editora();
            setContentView(R.layout.calculadora);
            Toast.makeText(getApplicationContext(),
                    "Cadastro de Editoras está sendo implementado",
                    Toast.LENGTH_SHORT).show();

            return true;
        }
        if (id == R.id.action_cad_usuario) {
            Cadastro_Usuario cadastro_usuario = new Cadastro_Usuario();
            setContentView(R.layout.calculadora);
            Toast.makeText(getApplicationContext(),
                    "Cadastro de Usuário está sendo implementado",
                    Toast.LENGTH_SHORT).show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
