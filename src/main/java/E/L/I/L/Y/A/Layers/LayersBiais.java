package E.L.I.L.Y.A.Layers;

import E.L.I.L.Y.A.DeepCorp.Biais;
import E.L.I.L.Y.A.DeepCorp.Poid;
import E.L.I.L.Y.A.Fonction.FonctionBase;

import java.util.ArrayList;

public class LayersBiais implements ILayers {

    private ArrayList<ArrayList<ArrayList<Double>>> listeBiaisFinal=new ArrayList<>();
    private ArrayList<ArrayList<Double>> listeDeBiais=new ArrayList<>();
    private ArrayList<Double> listeDeBiaisSimple;
    private double valeurDuBiais;

    public ArrayList<ArrayList<ArrayList<Double>>> listesuperieurBiais(ArrayList<ArrayList<ArrayList<Double>>> liste, int nombre){


        this.listeBiaisFinal =new ArrayList<>(liste.size());

        for (int i = 0; i < nombre; i++) {

            this.listeDeBiais= listeIntermediairePoid(liste.get(i));

            this.listeBiaisFinal.add(this.listeDeBiais);
        }

        return this.listeBiaisFinal;
    }





    private ArrayList<ArrayList<Double>>listeIntermediairePoid(ArrayList<ArrayList<Double>> listeIntermediaire){

        this.listeDeBiais =new ArrayList<>();

        for (int i = 0; i < listeIntermediaire.size(); i++) {

            this.listeDeBiaisSimple = valeurEnDouble(listeIntermediaire.get(i));

            this.listeDeBiais.add(this.listeDeBiaisSimple);
        }

        return this.listeDeBiais;
    }




    private ArrayList<Double> valeurEnDouble(ArrayList<Double>listeACree){

        this.listeDeBiaisSimple=new ArrayList<>();

        for (int i = 0; i <listeACree.size() ; i++) {
            Biais biais = new Biais();
            this.valeurDuBiais = biais.getValeurBiais();
            this.listeDeBiaisSimple.add(this.valeurDuBiais);
        }
        return this.listeDeBiaisSimple;
    }




    @Override
    public ArrayList<ArrayList<ArrayList<Double>>> createurFinalNeural(ArrayList<ArrayList<ArrayList<Double>>> lists, FonctionBase fonctionBase) {
        return null;
    }

    @Override
    public ArrayList<ArrayList<ArrayList<Double>>> listesuperieurppoid(ArrayList<ArrayList<ArrayList<Double>>> liste, int nombre) {
        return null;
    }
}
