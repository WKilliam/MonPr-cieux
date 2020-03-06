package com.teddy.albert.layers;

import com.teddy.albert.deepCorp.Biais;
import com.teddy.albert.fonction.FonctionBase;

import java.util.ArrayList;

public class LayersBiais implements ILayers {

    private ArrayList<ArrayList<ArrayList<Double>>> genListePoidOuBiaisListe= new ArrayList<>();
    private ArrayList<ArrayList<Double>> genListePoidOuBiaisListeNiveau1=new ArrayList<>();
    private ArrayList<Double> genListePoidOuBiaisListeNiveau2=new ArrayList<>();



    public ArrayList<ArrayList<ArrayList<Double>>> genListeBiais(ArrayList<ArrayList<ArrayList<Double>>> liste) {

        for (int i = 0; i <liste.size() ; i++) {

            this.genListePoidOuBiaisListeNiveau1 = genListePoidOuBiaisN1(liste.get(0));
        }
        this.genListePoidOuBiaisListe.add(this.genListePoidOuBiaisListeNiveau1);
        return this.genListePoidOuBiaisListe;
    }

    private ArrayList<ArrayList<Double>> genListePoidOuBiaisN1(ArrayList<ArrayList<Double>> liste) {


        for (int i = 0; i <liste.size() ; i++) {

            this.genListePoidOuBiaisListeNiveau2 = genListePoidOuBiaisN2(liste.get(i));

            this.genListePoidOuBiaisListeNiveau1.add(this.genListePoidOuBiaisListeNiveau2);
        }
        return this.genListePoidOuBiaisListeNiveau1;
    }

    private ArrayList<Double> genListePoidOuBiaisN2(ArrayList<Double> liste) {


            this.genListePoidOuBiaisListeNiveau2 = new ArrayList<>();

            for (int i = 0; i <liste.size() ; i++) {

                Biais bias = new Biais();

                this.genListePoidOuBiaisListeNiveau2.add(liste.get(0)+bias.getValeurBiais());
            }
            return this.genListePoidOuBiaisListeNiveau2;
    }


    @Override
    public ArrayList<ArrayList<ArrayList<Double>>> createurFinalNeural(ArrayList<ArrayList<ArrayList<Double>>> lists, FonctionBase fonctionBase,int valeur) {
        return null;
    }

    @Override
    public ArrayList<ArrayList<ArrayList<Double>>> genListePoid(ArrayList<ArrayList<ArrayList<Double>>> liste, int nombre) {
        return null;
    }


}
