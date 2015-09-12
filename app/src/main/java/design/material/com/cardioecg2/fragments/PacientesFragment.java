package design.material.com.cardioecg2.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import design.material.com.cardioecg2.R;
import design.material.com.cardioecg2.adapters.PacientesAdapter;
import design.material.com.cardioecg2.model.Paciente;

/**
 * A simple {@link Fragment} subclass.
 */
public class PacientesFragment extends Fragment {

    String f;


    public PacientesFragment() {
        // Required empty public constructor
    }

    public PacientesFragment(String f){
        this.f = f;

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pacientes, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<Paciente> pacienteArrayList = new ArrayList<Paciente>();

        Paciente ernestoLedesma = new Paciente();
        ernestoLedesma.setNombre("Ernesto");
        ernestoLedesma.setApellido("Ledesma");
        ernestoLedesma.setRitmoCardiaco("124p - Normal");
        pacienteArrayList.add(ernestoLedesma);

        Paciente ernestoLedesma2 = new Paciente();
        ernestoLedesma2.setNombre("Pedro");
        ernestoLedesma2.setApellido("Aranda");
        ernestoLedesma2.setRitmoCardiaco("122p - Normal");
        pacienteArrayList.add(ernestoLedesma2);

        Paciente ernestoLedesma3 = new Paciente();
        ernestoLedesma3.setNombre("Pedro");
        ernestoLedesma3.setApellido("Aranda");
        ernestoLedesma3.setRitmoCardiaco("122p - Normal");
        pacienteArrayList.add(ernestoLedesma3);

        Paciente ernestoLedesma4 = new Paciente();
        ernestoLedesma4.setNombre("Pedro");
        ernestoLedesma4.setApellido("Aranda");
        ernestoLedesma4.setRitmoCardiaco("122p - Normal");
        pacienteArrayList.add(ernestoLedesma4);

        Paciente ernestoLedesma5 = new Paciente();
        ernestoLedesma5.setNombre("Pedro");
        ernestoLedesma5.setApellido("Aranda");
        ernestoLedesma5.setRitmoCardiaco("122p - Normal");
        pacienteArrayList.add(ernestoLedesma5);


        RecyclerView recyclerView  = (RecyclerView) getActivity().findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new PacientesAdapter(pacienteArrayList,R.layout.row_pacientes));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
