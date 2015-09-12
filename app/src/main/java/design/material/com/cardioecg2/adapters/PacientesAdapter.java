package design.material.com.cardioecg2.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import design.material.com.cardioecg2.R;
import design.material.com.cardioecg2.model.Paciente;

/**
 * Created by ernestoledesma1 on 11/9/15.
 */
public class PacientesAdapter extends RecyclerView.Adapter<PacientesAdapter.ViewHolder> {


    private ArrayList<Paciente> pacientes;
    private  int itemLayout;


    public PacientesAdapter(ArrayList<Paciente> pacientes, int itemLayout){

            this.pacientes = pacientes;
            this.itemLayout = itemLayout;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(itemLayout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        Paciente paciente = pacientes.get(i);

       viewHolder.nombre.setText(paciente.getNombre());
        viewHolder.apellido.setText(paciente.getApellido());
        viewHolder.ritmoCardiaco.setText(paciente.getRitmoCardiaco());



    }

    @Override
    public int getItemCount() {

        return pacientes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView nombre;
        public TextView apellido;
        public TextView ritmoCardiaco;


        public ViewHolder(View itemView) {
            super(itemView);


            nombre = (TextView) itemView.findViewById(R.id.nombre_paciente);
            apellido = (TextView) itemView.findViewById(R.id.apellido_paciente);
            ritmoCardiaco = (TextView) itemView.findViewById(R.id.ritmo_cardiaco);

        }


    }
}
