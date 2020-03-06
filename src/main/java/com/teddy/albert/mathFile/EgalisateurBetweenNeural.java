package com.teddy.albert.mathFile;

import java.util.ArrayList;

public class EgalisateurBetweenNeural {

    private ArrayList<ArrayList<ArrayList<Double>>> finish=new ArrayList<>();

    public ArrayList<ArrayList<ArrayList<Double>>> createurLiaisonPoidNeural(ArrayList<ArrayList<ArrayList<Double>>>list1, int nombre){

        for (int i = 0; i <nombre ; i++) {

            this.finish.add(list1.get(0));
        }
        return this.finish;
    }
}
