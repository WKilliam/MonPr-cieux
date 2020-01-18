package E.L.I.L.Y.A.MathFile;

import java.util.ArrayList;

public class MathMultiplication {

    /**
     * CETTE OBJET EST PRÊT NE PLUS TOUCHER
     */

    private ArrayList<ArrayList<ArrayList<Double>>> list_final;
    private ArrayList<ArrayList<Double>> listeNombreAdditionner;
    private ArrayList<Double> listeSuiteNumerique=new ArrayList<>();
    private double valeurindix;


    public ArrayList<ArrayList<ArrayList<Double>>>multiplication_Afinal(ArrayList<ArrayList<ArrayList<Double>>> liste,ArrayList<ArrayList<ArrayList<Double>>> liste2) throws Exception {
        this.list_final = new ArrayList<>();
        this.listeNombreAdditionner = new ArrayList<>();

        for (int i = 0; i <liste.size() ; i++) {
            this.list_final.add(multiplisteDoubleEnListe(liste.get(i),liste2.get(i)));
        }
        return this.list_final;
    }

    /**
     * multiplie une arraylist  d'arraylist de double avec une autre arraylist d'arraylist de double
     * @param listeNumber1 arraylist  d'arraylist de double
     * @param listeNumber2 arraylist  d'arraylist de double
     * @return
     * @throws Exception
     */

    private ArrayList<ArrayList<Double>> multiplisteDoubleEnListe (ArrayList<ArrayList<Double>> listeNumber1,ArrayList<ArrayList<Double>> listeNumber2) throws Exception {


        this.listeNombreAdditionner=new ArrayList<>();

        this.listeSuiteNumerique=new ArrayList<>();

        this.valeurindix=0;
        for (int i = 0; i <listeNumber1.size() ; i++) {
            this.listeSuiteNumerique=new ArrayList<>();
            this.listeNombreAdditionner.add(MultiplisteDouble(listeNumber1.get(i),listeNumber2.get(i)));
        }
        return this.listeNombreAdditionner;
    }

    /**
     * prend deux arraylist et multiplie les deux element et retourne une arraylist d'element multiplier
     * @param listeNumber1 arraylist de double
     * @param listeNumber2 arraylist de double
     * @return
     * @throws Exception
     */

    private ArrayList<Double> MultiplisteDouble(ArrayList<Double> listeNumber1,ArrayList<Double> listeNumber2) throws Exception {

        if (listeNumber1.isEmpty() || listeNumber2.isEmpty()
                || (listeNumber1.size() != listeNumber2.size())) {
            throw new Exception("mauvaise valeur pour la longueur de la liste =" + listeNumber1.size() + ", par rapport à cette liste =" + listeNumber2.size());
        }

        int longueurliste1 = listeNumber1.size();

        for (int j = 0; j < longueurliste1; j++) {
            this.valeurindix = listeNumber1.get(j) * listeNumber2.get(j);
            this.listeSuiteNumerique.add(this.valeurindix);
        }
        return this.listeSuiteNumerique ;
    }

}
