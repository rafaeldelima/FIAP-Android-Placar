package br.com.fiap.placar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PlacarActivity extends AppCompatActivity {

    private TextView tvTimeDaCasa;
    private TextView tvTimeVisitante;
    private TextView tvPlacarTimeDaCasa;
    private TextView tvPlacarTimeVisitante;
    private int golCasa = 0;
    private int golVisitante = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placar);

        tvTimeDaCasa = (TextView) findViewById(R.id.tvTimeDaCasa);
        tvTimeVisitante = (TextView) findViewById(R.id.tvTimeVisitante);
        tvPlacarTimeDaCasa = (TextView) findViewById(R.id.tvPlacarTimeDaCasa);
        tvPlacarTimeVisitante = (TextView) findViewById(R.id.tvPlacarTimeVisitante);

        if (getIntent() != null) {
            tvTimeDaCasa.setText(getIntent().getStringExtra("nomeTimeDaCasa"));
            tvTimeVisitante.setText(getIntent().getStringExtra("nomeTimeVisitante"));
        }

        if(savedInstanceState != null){
            tvPlacarTimeDaCasa.setText(String.valueOf(savedInstanceState.getInt("GOLCASA")));
            tvPlacarTimeVisitante.setText(String.valueOf(savedInstanceState.getInt("GOLVISITANTE")));


            golCasa = savedInstanceState.getInt("GOLCASA");
            golVisitante = savedInstanceState.getInt("GOLVISITANTE");

        }

    }

    public void golCasa(View v){
        tvPlacarTimeDaCasa.setText(String.valueOf(++golCasa));

    }

    public void golVisitante(View v){
        tvPlacarTimeVisitante.setText(String.valueOf(++golVisitante));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("GOLCASA", golCasa);
        outState.putInt("GOLVISITANTE", golVisitante);
    }
}
