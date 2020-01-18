package E.L.I.L.Y.A.Layers;

import E.L.I.L.Y.A.Fonction.FonctionBase;

import java.util.ArrayList;

public interface ILayers {

    public ArrayList<ArrayList<ArrayList<Double>>> createurFinalNeural(ArrayList<ArrayList<ArrayList<Double>>>lists, FonctionBase fonctionBase);

    public ArrayList<ArrayList<ArrayList<Double>>> listesuperieurppoid(ArrayList<ArrayList<ArrayList<Double>>> liste,int nombre);

    public ArrayList<ArrayList<ArrayList<Double>>> listesuperieurBiais(ArrayList<ArrayList<ArrayList<Double>>> liste,int nombre);

    }
