package com.example.geographical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Country[] list_of_countries = new Country[7];
    TextView country_Name, capital_City, population, anthem, languages;
    Spinner spin;
    String[] names_of_countries = {"Pick a country", "Israel", "Spain", "USA", "UK", "Russia", "France", "Morocco"};
    int[] flagList = {R.drawable.ask1, R.drawable.israel, R.drawable.spain, R.drawable.usa, R.drawable.uk, R.drawable.russia, R.drawable.france, R.drawable.morocco};
    String[] names_of_capitals = {"", "Jerusalem", "Madrid", "Washington DC", "London", "Moscow", "Paris", "Rabat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_of_countries[0] = new Country("Israel", "Jerusalem", "Hatikva", "9,421,820", "Hebrew,English,Arabic");
        list_of_countries[1] = new Country("Spain", "Madrid", "Marcha Real", "47,450,795", "Spanish");
        list_of_countries[6] = new Country("Morocco", "Rabat", "النشيد الوطني المغربي", "37,112,080", "Morcoccan Arabic,French");
        list_of_countries[2] = new Country("USA", "Washington DC", "The Star-Spangled Banner ", "331,449,281", "English");
        list_of_countries[3] = new Country("UK", "London", "God Save The Queen", "67,081,000", "English");
        list_of_countries[4] = new Country("Russia", "Moscow", "Государственный гимн Российской Федерации", "146,171,015", "Russian");
        list_of_countries[5] = new Country("France", "Paris", "La Marseillaise", "67,413,000", "French");

        country_Name = findViewById(R.id.name);
        capital_City = findViewById(R.id.capital);
        languages = findViewById(R.id.languages);
        anthem = findViewById(R.id.anthem);
        population = findViewById(R.id.population);
        spin = findViewById(R.id.spin);

        CustomAdapter customadp = new CustomAdapter(getApplicationContext(),
                flagList, names_of_countries, names_of_capitals);
        spin.setAdapter(customadp);
        spin.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position != 0) {
            country_Name.setText("Name : " +list_of_countries[position-1].getName());
            capital_City.setText("Capital City : " + list_of_countries[position-1].getCapital());
            population.setText("Population Size : " + list_of_countries[position-1].getPopulation());
            languages.setText("Official Languages : " + list_of_countries[position-1].getLanguages());
            anthem.setText("National Anthem : " + list_of_countries[position-1].getAnthem());

        } else {
            country_Name.setText("");
            capital_City.setText("");
            population.setText("");
            languages.setText("");
            anthem.setText("");
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }
}