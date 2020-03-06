package com.teddy.albert.conceptionCorp;

import com.teddy.albert.fonction.FonctionBase;
import com.teddy.albert.layers.ILayers;
import com.teddy.albert.layers.LayerPoid;
import com.teddy.albert.layers.LayersBiais;
import com.teddy.albert.layers.LayersNeurone;
import com.teddy.albert.mathFile.EgalisateurEntrer;
import com.teddy.albert.mathFile.MathAddition;
import com.teddy.albert.mathFile.MathMultiplication;

import java.util.ArrayList;

public class CorpNeural {


    private ArrayList<ArrayList<ArrayList<Double>>> couchePoid= new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<Double>>> coucheNeuralActivation= new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<Double>>> coucheNeuralDerive= new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<Double>>> listeMultiplier= new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<Double>>> coucheDeBiais= new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<Double>>> listeAdditionner= new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<Double>>> egalisateur = new ArrayList<>();

    public CorpNeural(FonctionBase fonctionActivation,
                      ArrayList<Double> valeurXentrer,
                      int nombreNeuroneDuCorp) throws Exception {

        EgalisateurEntrer e = new EgalisateurEntrer();
        ILayers p = new LayerPoid();
        MathMultiplication mul = new MathMultiplication();
        MathAddition add = new MathAddition();
        ILayers nA = new LayersNeurone();
        ILayers nD = new LayersNeurone();
        ILayers b = new LayersBiais();

       this.egalisateur = e.Egalisateur(valeurXentrer, 3);
       this.couchePoid = p.genListePoid(this.egalisateur, 3);
       this.listeMultiplier = mul.multiplication_Afinal(this.egalisateur,this.couchePoid);
       this.listeAdditionner= add.Addition_final(this.listeMultiplier);
       this.coucheDeBiais=b.genListeBiais(this.listeAdditionner);
       this.coucheNeuralActivation=nA.createurFinalNeural(this.coucheDeBiais,fonctionActivation,0);
        System.out.println(this.coucheNeuralActivation);
       this.coucheNeuralDerive=nD.createurFinalNeural(this.coucheDeBiais,fonctionActivation,1);

    }

    public ArrayList<ArrayList<ArrayList<Double>>> getCoucheNeuralActivation() {
        return coucheNeuralActivation;
    }

    public ArrayList<ArrayList<ArrayList<Double>>> getCoucheNeuralDerive() {
        return coucheNeuralDerive;
    }

    public ArrayList<ArrayList<ArrayList<Double>>> getCoucheDeBiais() {
        return coucheDeBiais;
    }


    public ArrayList<ArrayList<ArrayList<Double>>> getCouchePoid() {
        return couchePoid;
    }

    public void setCouchePoid(ArrayList<ArrayList<ArrayList<Double>>> couchePoid) {
        this.couchePoid = couchePoid;
    }

    public ArrayList<ArrayList<ArrayList<Double>>> getEgalisateur() {
        return egalisateur;
    }


    public void setCoucheDeBiais(ArrayList<ArrayList<ArrayList<Double>>> coucheDeBiais) {
        this.coucheDeBiais = coucheDeBiais;
    }
}
