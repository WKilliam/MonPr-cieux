package com.teddy.albert.mathFile;

import java.util.ArrayList;

public class MathAdditionBetween {

    private ArrayList<ArrayList<ArrayList<Double>>> finallisteBetween;
    private ArrayList<ArrayList<Double>> listeBetweenDD;
    private ArrayList<Double> listeBetweenD =new ArrayList<>();
    private double valeurBetweenD;



    public ArrayList<ArrayList<ArrayList<Double>>> additionBetweenDoublefinal(ArrayList<ArrayList<ArrayList<Double>>> liste, ArrayList<ArrayList<ArrayList<Double>>> liste2) throws Exception {
        this.finallisteBetween = new ArrayList<>();
        this.listeBetweenDD = new ArrayList<>();

        for (int i = 0; i <liste.size() ; i++) {
            this.finallisteBetween.add(betweenArrayetArray(liste.get(i),liste2.get(i)));
        }
        return this.finallisteBetween;
    }


    private ArrayList<ArrayList<Double>> betweenArrayetArray(ArrayList<ArrayList<Double>> listeNumber1, ArrayList<ArrayList<Double>> listeNumber2) throws Exception {


        this.listeBetweenDD =new ArrayList<>();

        this.listeBetweenD=new ArrayList<>();

        this.valeurBetweenD=0;
        for (int i = 0; i <listeNumber1.size() ; i++) {
            this.listeBetweenD=new ArrayList<>();
            this.listeBetweenDD.add(additionBetweenlistetoliste(listeNumber1.get(i),listeNumber2.get(i)));
        }
        return this.listeBetweenDD;
    }




    private ArrayList<Double> additionBetweenlistetoliste(ArrayList<Double> listeNumber1, ArrayList<Double> listeNumber2) throws Exception {

        if (listeNumber1.isEmpty() || listeNumber2.isEmpty()
                || (listeNumber1.size() != listeNumber2.size())) {
            throw new Exception("mauvaise valeur pour la longueur de la liste =" + listeNumber1.size() + ", par rapport à cette liste =" + listeNumber2.size());
        }

        int longueurliste1 = listeNumber1.size();

        for (int j = 0; j < longueurliste1; j++) {
            this.valeurBetweenD = listeNumber1.get(j) + listeNumber2.get(j);
            this.listeBetweenD.add(this.valeurBetweenD);
        }
        return this.listeBetweenD;
    }
}
