package E.L.I.L.Y.A.Layers;


import E.L.I.L.Y.A.DeepCorp.Neurone;
import E.L.I.L.Y.A.Fonction.FonctionBase;

import java.util.ArrayList;

public class LayersNeurone implements ILayers {

    private ArrayList<ArrayList<ArrayList<Double>>> listeArray3Double =new ArrayList<>();
    private ArrayList<ArrayList<Double>> listeArray2Double =new ArrayList<>();
    private ArrayList<Double> listeArrayDouble =new ArrayList<>();


    public ArrayList<ArrayList<ArrayList<Double>>> createurFinalNeural(ArrayList<ArrayList<ArrayList<Double>>>lists, FonctionBase fonctionBase){

        for (int i = 0; i <lists.size() ; i++) {

            ArrayList<ArrayList<Double>> arrayLists = lists.get(0);
            this.listeArray2Double = createurMilieuNeural(lists.get(0), fonctionBase);
        }
        this.listeArray3Double.add(this.listeArray2Double);
        return this.listeArray3Double;
    }

    private ArrayList<ArrayList<Double>> createurMilieuNeural(ArrayList<ArrayList<Double>>lists, FonctionBase fonctionBase){

        this.listeArray2Double = new ArrayList<>();

        for (int i = 0; i <lists.size() ; i++) {

            this.listeArrayDouble = createurNeural(lists.get(i), fonctionBase);

            this.listeArray2Double.add(this.listeArrayDouble);
        }
        return this.listeArray2Double;
    }


    private ArrayList<Double> createurNeural(ArrayList<Double> listeX, FonctionBase fonctionBase){

        this.listeArrayDouble = new ArrayList<>();
        for (int i = 0; i <listeX.size() ; i++) {

            Neurone neural = new Neurone(fonctionBase,listeX.get(0));

            this.listeArrayDouble.add(neural.getFonctionActivation());
        }
        return this.listeArrayDouble;
    }



    @Override
    public ArrayList<ArrayList<ArrayList<Double>>> listesuperieurppoid(ArrayList<ArrayList<ArrayList<Double>>> liste, int nombre) {
        return null;
    }

    @Override
    public ArrayList<ArrayList<ArrayList<Double>>> listesuperieurBiais(ArrayList<ArrayList<ArrayList<Double>>> liste, int nombre) {
        return null;
    }
}