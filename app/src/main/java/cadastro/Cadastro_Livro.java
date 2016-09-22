package cadastro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.dionimfxgmail.avaliacaopdm.R;

/**
 * Created by dioni on 21/09/2016.
 */

public class Cadastro_Livro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_livros);
        Toolbar toolbar = (Toolbar) findViewById(com.dionimfxgmail.avaliacaopdm.R.id.toolbar);
        setSupportActionBar(toolbar);


    }

}
