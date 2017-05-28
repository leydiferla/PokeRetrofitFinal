package com.example.leydidiego.pokeretrofitfinal.models;

import java.util.ArrayList;

/**
 * Created by leydidiego on 27/05/17.
 */

public class PokemonRespuesta {
    private ArrayList<Pokemon> results;

    public ArrayList<Pokemon> getResults() {
        return results;
    }

    public void setResults(ArrayList<Pokemon> results) {
        this.results = results;
    }
}
