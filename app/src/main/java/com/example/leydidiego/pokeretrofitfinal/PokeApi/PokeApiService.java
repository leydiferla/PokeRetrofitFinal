package com.example.leydidiego.pokeretrofitfinal.PokeApi;

import com.example.leydidiego.pokeretrofitfinal.models.Poder;
import com.example.leydidiego.pokeretrofitfinal.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by leydidiego on 27/05/17.
 */

public interface PokeApiService {

        @GET("pokemon")
        Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);

        @GET("pokemon/{id}/")
        Call<Poder> obtenerInfoPokemon(@Path("id") int id);
    }

