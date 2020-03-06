package com.teddy.albert.layers;

import com.teddy.albert.deepCorp.Poid;
import com.teddy.albert.fonction.FonctionBase;

import java.util.ArrayList;

public class LayerPoid implements ILayers{

    private ArrayList<ArrayList<ArrayList<Double>>> listeDePoidsup;
    private ArrayList<ArrayList<Double>> listeDePoid;
    private ArrayList<Double> listeDePoidSimple;
    private double valeurDuPoid;




    public ArrayList<ArrayList<ArrayList<Double>>> genListePoid(ArrayList<ArrayList<ArrayList<Double>>> liste, int nombre){


        this.listeDePoidsup =new ArrayList<>(liste.size());

        for (int i = 0; i < nombre; i++) {

            this.listeDePoid= listeIntermediairePoid(liste.get(i));

            this.listeDePoidsup.add(this.listeDePoid);
        }

        return this.listeDePoidsup;
    }

    private ArrayList<ArrayList<Double>>listeIntermediairePoid(ArrayList<ArrayList<Double>> listeIntermediaire){

        this.listeDePoid =new ArrayList<>();

        for (int i = 0; i < listeIntermediaire.size(); i++) {

            this.listeDePoidSimple = valeurEnDouble(listeIntermediaire.get(i));

            this.listeDePoid.add(this.listeDePoidSimple);
        }

        return this.listeDePoid;
    }


    private ArrayList<Double> valeurEnDouble(ArrayList<Double>listeACree){


        this.listeDePoidSimple=new ArrayList<>();
        for (int i = 0; i <listeACree.size() ; i++) {
            Poid poid = new Poid();
            this.valeurDuPoid = poid.getValeurPoid();
            this.listeDePoidSimple.add(this.valeurDuPoid);
        }
        return this.listeDePoidSimple;
    }

    @Override
    public ArrayList<ArrayList<ArrayList<Double>>> createurFinalNeural(ArrayList<ArrayList<ArrayList<Double>>> lists, FonctionBase fonctionBase,int valeur) {
        return null;
    }

    @Override
    public ArrayList<ArrayList<ArrayList<Double>>> genListeBiais(ArrayList<ArrayList<ArrayList<Double>>> liste) {
        return null;
    }

}