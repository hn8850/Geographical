package com.example.geographical;

public class Country {
    private String name;
    private String capital;
    private String anthem;
    private String population;
    private String languages;


    public Country(String name, String capital, String anthem, String population, String languages) {
        this.name = name;
        this.capital = capital;
        this.anthem = anthem;
        this.population = population;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getAnthem() {
        return anthem;
    }

    public String getPopulation() {
        return population;
    }

    public String getLanguages() {
        return languages;
    }
}

