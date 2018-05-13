package org.therrero.petagram3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {
    ArrayList<Mascota> fotosmascotas;
    private RecyclerView listaDeFotosDeMascotas;
    public FotoAdapter adaptador;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaDeFotosDeMascotas = (RecyclerView) v.findViewById(R.id.rvFotoMascotas);

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        listaDeFotosDeMascotas.setLayoutManager(glm);
        inicializarListaMascotas();
        inializarAdaptador();
        return v;
    }
    public void inializarAdaptador(){
        adaptador = new FotoAdapter(fotosmascotas, getActivity());
        listaDeFotosDeMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        fotosmascotas= new ArrayList<Mascota>();

        fotosmascotas.add(new Mascota("Pepi",R.drawable.mascota1,(int)Math.random()*10));
        fotosmascotas.add(new Mascota("Pepi", R.drawable.mascota1,(int)Math.random()*10));
        fotosmascotas.add(new Mascota("Pepi", R.drawable.mascota1,(int)Math.random()*10));
        fotosmascotas.add(new Mascota("Pepi",R.drawable.mascota1,(int)Math.random()*10));
        fotosmascotas.add(new Mascota("Pepi",R.drawable.mascota1,(int)Math.random()*10));
        fotosmascotas.add(new Mascota("Pepi",R.drawable.mascota1,(int)Math.random()*10));
        fotosmascotas.add(new Mascota("Pepi",R.drawable.mascota1,(int)Math.random()*10));
        fotosmascotas.add(new Mascota("Pepi",R.drawable.mascota1,(int)Math.random()*10));

    }
}
