package com.teddy.albert.layers;


import com.teddy.albert.deepCorp.Neurone;
import com.teddy.albert.fonction.FonctionBase;

import java.util.ArrayList;

public class LayersNeurone implements ILayers {

    private ArrayList<ArrayList<ArrayList<Double>>> listeArray3Double =new ArrayList<>();
    private ArrayList<ArrayList<Double>> listeArray2Double =new ArrayList<>();
    private ArrayList<Double> listeArrayDouble =new ArrayList<>();


    public ArrayList<ArrayList<ArrayList<Double>>> createurFinalNeural(ArrayList<ArrayList<ArrayList<Double>>>lists, FonctionBase fonctionBase,int valeur){

        for (int i = 0; i <lists.size() ; i++) {

            this.listeArray2Double = createurMilieuNeural(lists.get(0), fonctionBase,valeur);
        }
        this.listeArray3Double.add(this.listeArray2Double);
        return this.listeArray3Double;
    }

    private ArrayList<ArrayList<Double>> createurMilieuNeural(ArrayList<ArrayList<Double>>lists, FonctionBase fonctionBase,int valeur){

        this.listeArray2Double = new ArrayList<>();

        for (int i = 0; i <lists.size() ; i++) {

            this.listeArrayDouble = createurNeural(lists.get(i), fonctionBase,valeur);

            this.listeArray2Double.add(this.listeArrayDouble);
        }
        return this.listeArray2Double;
    }


    private ArrayList<Double> createurNeural(ArrayList<Double> listeX, FonctionBase fonctionBase,int valeur){

        this.listeArrayDouble = new ArrayList<>();
        for (int i = 0; i <listeX.size() ; i++) {

            Neurone neural = new Neurone(fonctionBase,listeX.get(0),valeur);

            switch (valeur){

                case 0:
                    this.listeArrayDouble.add(neural.getFonctionActivation());
                    break;
                case 1:
                    this.listeArrayDouble.add(neural.getFonctionDerive());
                    break;
                default:
                    System.out.println("probléme au niveau layer la valeur n'est pas reconnu");
                    break;
            }
        }
        return this.listeArrayDouble;
    }



    @Override
    public ArrayList<ArrayList<ArrayList<Double>>> genListePoid(ArrayList<ArrayList<ArrayList<Double>>> liste, int nombre) {
        return null;
    }

    @Override
    public ArrayList<ArrayList<ArrayList<Double>>> genListeBiais(ArrayList<ArrayList<ArrayList<Double>>> liste) {
        return null;
    }

}