package com.example.leydidiego.pokeretrofitfinal.models;

/**
 * Created by leydidiego on 27/05/17.
 */




public class Poder {

    private String ability;
    private String name;
    private String baseExperience;
    private String weight;


    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(String baseExperience) {
        this.baseExperience = baseExperience;
    }
}
