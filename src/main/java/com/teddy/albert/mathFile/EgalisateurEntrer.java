package com.teddy.albert.mathFile;

import java.util.ArrayList;

public class EgalisateurEntrer {


    private ArrayList<Double> take;
    private ArrayList<ArrayList<Double>> take2;
    private ArrayList<ArrayList<ArrayList<Double>>> take3;

    public ArrayList<ArrayList<ArrayList<Double>>> Egalisateur (ArrayList<Double> liste,int nombrenerone){

        this.take3=new ArrayList<>();
        this.take2 = new ArrayList<>();
        for (int i = 0; i < nombrenerone; i++) {
            this.take2 = littleegalisateur(liste);
            this.take3.add(this.take2);
        }

        return this.take3;
    }

    private ArrayList<ArrayList<Double>> littleegalisateur(ArrayList<Double>liste ){


        this.take2 = new ArrayList<>(1);

        for (int i = 0; i < liste.size(); i++) {

            this.take = new ArrayList<>(1);
            this.take.add(liste.get(i));
            this.take2.add(this.take);

        }
        return this.take2;
    }
}