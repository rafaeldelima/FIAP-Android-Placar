package br.com.fiap.placar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private EditText etTimeDaCasa;
    private EditText etTimeVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTimeDaCasa = (EditText) findViewById(R.id.etTimeDaCasa);
        etTimeVisitante = (EditText) findViewById(R.id.etTimeVisitante);
    }

    public void iniciarJogo(View view){
        Intent abrirPlacar = new Intent(this, PlacarActivity.class);
        abrirPlacar.putExtra("nomeTimeDaCasa",etTimeDaCasa.getText().toString());
        abrirPlacar.putExtra("nomeTimeVisitante",etTimeVisitante.getText().toString());

        startActivity(abrirPlacar);

    }
}
