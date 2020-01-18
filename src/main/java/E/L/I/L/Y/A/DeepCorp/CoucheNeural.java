package E.L.I.L.Y.A.DeepCorp;

import E.L.I.L.Y.A.Base.CreateurDeListe;
import E.L.I.L.Y.A.Fonction.FonctionBase;
import E.L.I.L.Y.A.Layers.ILayers;
import E.L.I.L.Y.A.Layers.LayerPoid;
import E.L.I.L.Y.A.Layers.LayersBiais;
import E.L.I.L.Y.A.Layers.LayersNeurone;
import E.L.I.L.Y.A.MathFile.MathAddition;
import E.L.I.L.Y.A.MathFile.MathAdditionBetween;
import E.L.I.L.Y.A.MathFile.MathMultiplication;

import java.util.ArrayList;

public class CoucheNeural {

    private ArrayList<ArrayList<ArrayList<Double>>> listeNeurone;
    private ArrayList<ArrayList<ArrayList<Double>>> listeBiais;
    private ArrayList<ArrayList<ArrayList<Double>>> listePoid;
    private ArrayList<ArrayList<ArrayList<Double>>> listePoidCalcul;

    public CoucheNeural(FonctionBase fonction,int nombreNeurone,ArrayList<ArrayList<ArrayList<Double>>>listeDentrer) throws Exception {


        ILayers layersPoid = new LayerPoid();
        ILayers layersBiais = new LayersBiais();
        ILayers layersNeurone = new LayersNeurone();
        CreateurDeListe creeliste = new CreateurDeListe();
        MathMultiplication mathmultip = new MathMultiplication();
        MathAddition mathaddit = new MathAddition();
        MathAdditionBetween between = new MathAdditionBetween();


        this.listePoid = layersPoid.listesuperieurppoid(listeDentrer, nombreNeurone);

        this.listePoidCalcul = creeliste.listefinaliser(this.listePoid);

        ArrayList<ArrayList<ArrayList<Double>>> listemultiplier = mathmultip.multiplication_Afinal(listeDentrer,this.listePoid);

        ArrayList<ArrayList<ArrayList<Double>>> listeAdditionner = mathaddit.Addition_final(listemultiplier);

        this.listeBiais = layersBiais.listesuperieurBiais(listeAdditionner, listeAdditionner.size());

        ArrayList<ArrayList<ArrayList<Double>>> listeXEntrerNeural = between.additionBetweenDoublefinal(listeAdditionner, this.listeBiais);

        this.listeNeurone = layersNeurone.createurFinalNeural(listeXEntrerNeural, fonction);

    }


    public ArrayList<ArrayList<ArrayList<Double>>> getListePoidCalcul() {
        return listePoidCalcul;
    }

    public ArrayList<ArrayList<ArrayList<Double>>> getListePoid() {
        return listePoid;
    }

    public ArrayList<ArrayList<ArrayList<Double>>> getListeNeurone() {
        return listeNeurone;
    }

    public ArrayList<ArrayList<ArrayList<Double>>> getListeBiais() {
        return listeBiais;
    }

    public ArrayList<ArrayList<ArrayList<Double>>> getListerecup() {
        return this.listeNeurone;
    }
}
