package org.therrero.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaDeMascotas;
    public MascotaAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar miActionBar = (android.support.v7.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaDeMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaDeMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inializarAdaptador();

}
    public void inicializarListaMascotas(){
        mascotas= new ArrayList<Mascota>();

        mascotas.add(new Mascota("Pepi", R.drawable.mascota1,0));
        mascotas.add(new Mascota("Chewi", R.drawable.mascota2,0));
        mascotas.add(new Mascota("Chispas", R.drawable.mascota3,0));
        mascotas.add(new Mascota("Toby",R.drawable.mascota4,0));
        mascotas.add(new Mascota("Kiki",R.drawable.mascota5,0));
        mascotas.add(new Mascota("Miky",R.drawable.mascota6,0));
        mascotas.add(new Mascota("Trump",R.drawable.mascota7,0));
        mascotas.add(new Mascota("Aris",R.drawable.mascota8,0));

    }

    public void inializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaDeMascotas.setAdapter(adaptador);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, RatedActivity.class);
        startActivity(intent);
    }
}
