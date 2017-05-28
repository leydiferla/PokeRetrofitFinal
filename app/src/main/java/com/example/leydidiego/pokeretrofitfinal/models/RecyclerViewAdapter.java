package com.example.leydidiego.pokeretrofitfinal.models;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.leydidiego.pokeretrofitfinal.DatosPokemon;
import com.example.leydidiego.pokeretrofitfinal.R;

import java.util.ArrayList;

/**
 * Created by leydidiego on 27/05/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PictureViewHolder>{

    private ArrayList<Pokemon> dataset;
    private Context context;
    private Activity activity;



    public RecyclerViewAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public RecyclerViewAdapter.PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_pokemon, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.PictureViewHolder holder, int position) {
        final Pokemon p = dataset.get(position);
        holder.txtNombre.setText(p.getName());


        Glide.with(context)
                .load("http://pokeapi.co/media/sprites/pokemon/" + p.getNumber() + ".png")
                .centerCrop()
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imagenPokemon);

        holder.imagenPokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DatosPokemon.class);
                intent.putExtra("ID_POKEMON",p.getNumber());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount()  {
        return dataset.size();
    }
    public void adicionarListaPokemon(ArrayList<Pokemon> listaPokemon) {
        dataset.addAll(listaPokemon);
        notifyDataSetChanged();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        ImageView imagenPokemon;

        private TextView txtNombre;

        public PictureViewHolder(View itemView) {
            super(itemView);

            imagenPokemon   = (ImageView) itemView.findViewById(R.id.img_card);
            txtNombre       = (TextView) itemView.findViewById(R.id.txt_nombre_card);

        }
    }



}


