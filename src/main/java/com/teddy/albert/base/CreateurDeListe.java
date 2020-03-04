package E.L.I.L.Y.A.Base;

import java.util.ArrayList;

public class CreateurDeListe {

    private ArrayList<ArrayList<ArrayList<Double>>>liste;
    private ArrayList<ArrayList<Double>>liste1;
    private ArrayList<Double>liste2;


    public ArrayList<ArrayList<ArrayList<Double>>>listefinaliser(ArrayList<ArrayList<ArrayList<Double>>>liste){

        this.liste=new ArrayList<>();

        for (int i = 0; i <liste.size() ; i++) {

            this.liste1  = listecouche2(liste.get(i));

            this.liste.add(this.liste1);
        }

        return this.liste;
    }



    private ArrayList<ArrayList<Double>>listecouche2(ArrayList<ArrayList<Double>>liste){

        this.liste1=new ArrayList<>();

        for (int i = 0; i <liste.size() ; i++) {
            this.liste2 = listecouche1(liste.get(i));
            this.liste1.add(this.liste2);
        }

        return this.liste1;
    }

    private ArrayList<Double>listecouche1(ArrayList<Double>liste){

        this.liste2=new ArrayList<>();

        for (int i = 0; i <liste.size() ; i++) {

            Double aDouble = liste.get(0);
            this.liste2.add(aDouble);
        }
        return this.liste2;
    }
}
