package com.teddy.albert.layers;

import com.teddy.albert.fonction.FonctionBase;

import java.util.ArrayList;

public interface ILayers {

    public ArrayList<ArrayList<ArrayList<Double>>> createurFinalNeural(ArrayList<ArrayList<ArrayList<Double>>>lists, FonctionBase fonctionBase,int valeur);

    public ArrayList<ArrayList<ArrayList<Double>>> genListePoid(ArrayList<ArrayList<ArrayList<Double>>> liste,int nombre);

    public ArrayList<ArrayList<ArrayList<Double>>> genListeBiais(ArrayList<ArrayList<ArrayList<Double>>> liste);

    }
