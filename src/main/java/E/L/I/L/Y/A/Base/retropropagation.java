package E.L.I.L.Y.A.Base;

import E.L.I.L.Y.A.Exception.LongueurException;

import java.util.ArrayList;

public class retropropagation {

    private ArrayList<ArrayList<ArrayList<Double>>> listeprise;
    private ArrayList<ArrayList<Double>> listeprise1;
    private ArrayList<Double> listeprise2;
    private Double valeurd;

    public void retropropagation(ArrayList<ArrayList<ArrayList<Double>>>liste,ArrayList<ArrayList<ArrayList<Double>>>listefxprecedante,ArrayList<ArrayList<ArrayList<Double>>>listefxsortie,ArrayList<ArrayList<ArrayList<Double>>> listeerreur,double tauxapp) throws LongueurException, Exception {

        int taillelistesortie = listefxsortie.get(0).size();

        ArrayList<ArrayList<ArrayList<Double>>> calculeerreur = calculeerreur(listefxsortie, listeerreur);

        for (int i = 0; i <taillelistesortie ; i++) {

            for (int j = 0; j <liste.get(i).size() ; j++) {

                double v = - calculeerreur.get(i).get(j).get(0) * listefxsortie.get(0).get(i).get(0) * (-1 * listefxsortie.get(0).get(i).get(0)) * listefxprecedante.get(i).get(j).get(0);

                double v1 = tauxapp *(v);

                double v2 = liste.get(0).get(i).get(0) - (v1);

                liste.get(i).get(j).set(0,v2);

            }
        }
    }

    public void retropropagationinterne(){


    }

    private ArrayList<ArrayList<ArrayList<Double>>> calculeerreur(ArrayList<ArrayList<ArrayList<Double>>>listeorigine,ArrayList<ArrayList<ArrayList<Double>>>listecalculer) throws Exception {

        this.listeprise=new ArrayList<>();

        if(listecalculer.size()!=listeorigine.size()){
            throw new Exception();
        }

        for (int i = 0; i <listecalculer.size() ; i++) {
            this.listeprise1= calculeerreur1(listeorigine.get(i), listecalculer.get(i));
        }
        this.listeprise.add(this.listeprise1);
        return this.listeprise;
    }

    private ArrayList<ArrayList<Double>> calculeerreur1(ArrayList<ArrayList<Double>> listeorigine,ArrayList<ArrayList<Double>>listecalculer){

        this.listeprise1=new ArrayList<>();

        for (int i = 0; i <listecalculer.size() ; i++) {
            this.listeprise2 = calculeerreur2(listeorigine.get(i), listecalculer.get(i));
        }
        this.listeprise1.add(this.listeprise2);
        return this.listeprise1;
    }

    private ArrayList<Double> calculeerreur2(ArrayList<Double>listeorigine,ArrayList<Double>listecalculer){

        this.listeprise2=new ArrayList<>();

        for (int i = 0; i <listecalculer.size() ; i++) {


            this.valeurd= 2 * (listecalculer.get(i) - listeorigine.get(i));

        }
        this.listeprise2.add(this.valeurd);
        return this.listeprise2;
    }
}
